FROM amazoncorretto:22-jdk
RUN mkdir /app
EXPOSE 8480
COPY ./build/libs/*.jar /app/security-service.jar
ENTRYPOINT ["java", "-jar", "/app/security-service.jar"]