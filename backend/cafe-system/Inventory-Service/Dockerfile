FROM amazoncorretto:22-jdk
RUN mkdir /app
EXPOSE 8180
COPY ./build/libs/*.jar /app/inventory-service.jar
ENTRYPOINT ["java", "-jar", "/app/inventory-service.jar"]