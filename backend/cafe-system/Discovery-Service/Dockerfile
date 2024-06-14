FROM openjdk:latest
RUN mkdir /app
EXPOSE 8761
COPY ./build/libs/*.jar /app/discovery-service.jar
ENTRYPOINT ["java", "-jar", "/app/discovery-service.jar"]