# hello-jmeter-unirest
jmeter test script utilizing JSR223 preprocessor and unirest for updating status intervally



### Dependencies
Copy the follownig dependencies under the lib directory

* unirest-java
* org.json
* httpclient  
* httpmime 
* httpasyncclient 

Ref.

- http://unirest.io/java.html
- http://www.json.org/java/
- http://hc.apache.org/downloads.cgi


*e.g.* 
```
./lib
├── commons-codec-1.9.jar
├── commons-logging-1.2.jar
├── httpasyncclient-4.1.1.jar
├── httpclient-4.5.2.jar
├── httpcore-4.4.4.jar
├── httpcore-nio-4.4.4.jar
├── httpmime-4.5.2.jar
├── json-20160212.jar
└── unirest-java-1.4.9.jar
```

### Run from your local box

*e.g.* on linux/osx 
```
jmeter.sh --propfile jmeter.properties --testfile hello-unirest.jmx &
```
