FROM openjdk:17-jdk-slim
ARG JAR_FILE_PATH=build/libs/blindroute-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE_PATH} blindRoute.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "blindRoute.jar"]