# Use a lightweight JDK base image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/*.jar app.jar

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
