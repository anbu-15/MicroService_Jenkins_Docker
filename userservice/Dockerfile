# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/userservice-0.0.1-SNAPSHOT.jar /app/userservice.jar

# Expose the port Userservice will run on
EXPOSE 8084

# Run the application
ENTRYPOINT ["java", "-jar", "/app/userservice.jar"]
