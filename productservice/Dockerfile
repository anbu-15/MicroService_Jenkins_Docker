# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/productservice-0.0.1-SNAPSHOT.jar /app/productservice.jar

# Expose the port Productservice will run on
EXPOSE 8083

# Run the application
ENTRYPOINT ["java", "-jar", "/app/productservice.jar"]
