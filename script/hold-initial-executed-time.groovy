Date executedTime = new Date();
log.info("----------------------------------");
log.info("main start：" + executedTime)
log.info("----------------------------------");

vars.put("executedTime", Long.toString(executedTime.getTime()));
