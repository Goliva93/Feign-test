# 1. Traemos una máquina Linux súper ligera que ya tiene Java 21 instalado
FROM eclipse-temurin:21-jdk-alpine

# 2. Le decimos a Docker por qué puerto se va a comunicar este servicio
EXPOSE 8081

# 3. Copiamos el ejecutable (.jar) que Maven creó en la carpeta target hacia el contenedor
COPY target/*.jar app.jar

# 4. El comando exacto para encender tu aplicación
ENTRYPOINT ["java","-jar","/app.jar"]