# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/eureka-server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar

# Expose the port Eureka Server will run on
EXPOSE 8761

# Run the application
ENTRYPOINT ["java", "-jar", "/app/eureka-server.jar"]
