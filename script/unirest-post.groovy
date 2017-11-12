import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

if (vars.get("isNeededRefreshToken") ==  null) {
	vars.put("isNeededRefreshToken", "true");
}
if (vars.get("isNeededRefreshToken").equals("true")) {
  vars.put("isNeededRefreshToken", "false");
  HttpResponse<String> response = Unirest.post("https://echo.getpostman.com/post")
          .header("content-type", "text/plain")
          .header("cache-control", "no-cache")
          .header("postman-token", "2f176c85-ba41-2141-0b5f-adaf5193e50b")
          .body("Duis posuere augue vel cursus pharetra. In luctus a ex nec pretium. Praesent neque quam, tincidunt nec leo eget, rutrum vehicula magna.\nMaecenas consequat elementum elit, id semper sem tristique et. Integer pulvinar enim quis consectetur interdum volutpat.")
          .asString();
  vars.put("server", new String(response.getHeaders().getFirst("Server")));
  log.info("------------------------------------------");
  log.info(vars.get("server"));
  log.info("------------------------------------------");
  Date executedTime = new Date();
  log.info("----------------------------------");
  log.info("main start：" + executedTime)
  log.info("----------------------------------");
  vars.put("executedTime", Long.toString(executedTime.getTime()));
}
