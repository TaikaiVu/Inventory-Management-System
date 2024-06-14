FROM openjdk:latest
RUN mkdir /app
EXPOSE 8680
COPY ./build/libs/*.jar /app/notification-service.jar
ENTRYPOINT ["java", "-jar", "/app/notification-service.jar"]