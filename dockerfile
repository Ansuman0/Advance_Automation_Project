# Build stage
FROM maven:3.8.4-openjdk-17-slim as maven
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn dependency:go-offline -B
RUN mvn package

# Final stage
FROM openjdk:17
EXPOSE 8080
WORKDIR /automation-framework
COPY --from=maven target/Selenium-Automation-Framwork-0.0.1-SNAPSHOT.jar /app/Selenium-Automation-Framwork-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/Selenium-Automation-Framwork-0.0.1-SNAPSHOT.jar"]