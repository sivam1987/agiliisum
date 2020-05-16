# agiliisum
This application is packaged as a jar which has Tomcat 8 embedded.
Tomcat You run it using the java -jar command.

Clone this repository
Make sure you are using JDK 1.11 ,Spring Boot 2.3.0 and bove and Maven 3.x
You can build the project and run the tests by running mvn clean package
Once successfully built, you can run  one of these two methods:
        java -jar -Dspring.profiles.active=test target/agiliisum-int-test-0.0.1-SNAPSHOT.jar
or
        mvn spring-boot:run -Drun.arguments="spring.profiles.active=test"
        
 2)About the Application
The application is just a simple get  the Agillisum products by using REST Controoler . It uses ProductDetailsServiceImpl to get the data.
becase i did create any database,REST controller is defined in com.aglsum.test.api.controller on port 8080. (see below)

3)Roles
This Application Has two roles(admin,user)
user id=ADMIN
password=password 
userid=USER
password=password
             
Get the API calls by using this urls etc.
This application h
http://localhost:8080/aglsum/api/getproductdetails
{
"prodCode":101,
"prodName":"Computer",
"prodCatgory":"Eletronics"
}
http://localhost:8080/aglsum/api/getconfigdetails
{
    "timestamp": "2020-05-16T11:58:31.654+00:00",
    "status": 401,
    "error": "Unauthorized",
    "message": "Unauthorized",
    "path": "/aglsum/api/getconfigdetails"
}


