# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/paymentservice-0.0.1-SNAPSHOT.jar /app/paymentservice.jar

# Expose the port Paymentservice will run on
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "/app/paymentservice.jar"]
