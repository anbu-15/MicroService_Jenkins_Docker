# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/orderservice-0.0.1-SNAPSHOT.jar /app/orderservice.jar

# Expose the port Orderservice will run on
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "/app/orderservice.jar"]
