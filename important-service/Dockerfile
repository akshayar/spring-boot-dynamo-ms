FROM openjdk:11
WORKDIR /app


COPY target/spring-boot-dynamo-ms-0.0.1-SNAPSHOT.jar /app/app.jar
COPY src/main/resources /app/config
USER root
ENV STREAM_NAME=aksh-first
ENTRYPOINT ["java", "-jar"  ,"/app/app.jar", "--spring.config.location=/app/config/application.properties"]
