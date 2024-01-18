FROM openjdk:21
EXPOSE 8080
ADD target/email-service.jar email-service.jar
ENTRYPOINT ["java", "-jar", "/email-service.jar" ]