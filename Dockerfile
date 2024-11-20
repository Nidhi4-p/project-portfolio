FROM maven:3.8.3-openjdk-17 AS build
# Set working directory
WORKDIR /home/app

# Copy pom.xml and source files
COPY pom.xml /home/app/pom.xml
COPY src /home/app/src

# Build the application, skip tests if needed
RUN mvn clean package -DskipTests

# Runtime image with JDK only (slimmer)
FROM openjdk:17-jdk-slim

# Copy the built JAR file from the build stage
COPY --from=build /home/app/target/*.jar app.jar

# Expose the application port
EXPOSE 8081

# Use wait-for-it.sh to wait for the MySQL service before running the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]