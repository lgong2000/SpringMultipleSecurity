# SpringMultipleSecurity

Spring Web
Spring Data JDBC
Spring H2 Database

Version 1
ListCrudRepository need Spring Boot 3.x
Record
Repository
schema.sql

H2 Database:
application.properties
    spring.datasource.generate-unique-name=false
    spring.datasource.name=blog
    spring.h2.console.enabled=true
schema.sql is run automatically
H2-console:
http://localhost:8080/h2-console
    JDBC URL: jdbc:h2:mem:blog

Version 2
Enable Spring Security
H2-console need PermitAll to run

Version 3
2 SecurityFilterChain
@Order(1) is necessary when running first

Version 4
Use securityMatcher to restrict the SecurityFilterChain scope

Version 5
http://localhost:8080/  #PermitAll
http://localhost:8080/private   #FormLogin
http://localhost:8080/api/posts #Default Login(Popup Window)
http://localhost:8080/h2-console    #PermitAll - Click Connect to further Check