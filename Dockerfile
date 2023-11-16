FROM arm64v8/openjdk:17-ea-16-jdk
COPY target/*.jar app.jar

ENTRYPOINT java -jar app.jar



