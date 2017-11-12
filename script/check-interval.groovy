if (vars.get("isNeededRefreshToken") ==  null) {
	vars.put("isNeededRefreshToken", "true");
}
long currentTime = new Date().getTime();
long executedTime = vars.get("executedTime") == null ? new Date().getTime() :Long.valueOf(vars.get("executedTime"));
long timeDiff = ( currentTime - executedTime );
log.info("----------------------------------");
log.info("current time: " + currentTime)
log.info("executed time: " + executedTime)
log.info( "time diff: " + timeDiff ); 
if(timeDiff > 7000) {
	vars.put("isNeededRefreshToken", "true");
}
log.info("isNeededRefreshToken: " + vars.get("isNeededRefreshToken"))
log.info("----------------------------------");
