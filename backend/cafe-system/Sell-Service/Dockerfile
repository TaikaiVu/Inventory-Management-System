FROM openjdk:latest
RUN mkdir /app
EXPOSE 8280
COPY ./build/libs/*.jar /app/sell-service.jar
ENTRYPOINT ["java", "-jar", "/app/sell-service.jar"]