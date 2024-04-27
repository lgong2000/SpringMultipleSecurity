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