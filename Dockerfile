FROM openjdk:17
WORKDIR /demo
CMD ["./gradlew", "clean", "bootJar"]
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]