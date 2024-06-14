FROM amazoncorretto:22-jdk
RUN mkdir /app
EXPOSE 8080
COPY ./build/libs/*.jar /app/api-gateway.jar
ENTRYPOINT ["java", "-jar", "/app/api-gateway.jar"]