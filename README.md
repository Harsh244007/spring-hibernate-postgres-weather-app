application properties inside  src\main\resources\application.properties

api routes

get /weather
get /weather/country

post /weather
get /weather

Home and error pages are all set with error handling.

spring.datasource.url=jdbc:postgresql://localhost:5433/taskmanager
spring.datasource.username=postgres
spring.datasource.password=harsh
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update