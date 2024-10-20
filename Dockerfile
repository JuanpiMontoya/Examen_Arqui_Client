FROM openjdk:17-jdk-slim

EXPOSE 8083
COPY target/Client-Service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]