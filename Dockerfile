# Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Final stage
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /app/target/Lab2-0.0.1-SNAPSHOT.jar Lab2.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "Lab2.jar"]
