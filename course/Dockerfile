FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8083
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]