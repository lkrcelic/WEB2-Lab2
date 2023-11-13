FROM maven:3.8.5-openjdk-17
COPY . .
RUN mvn clean package -DskpTests

FROM openjdk-17-slim
COPY ..from=build /target/Lab2-0.0.1-SNAPSHOT.jar Lab2.jar
RUN mvn clean package -DskpTests
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "Lab2.jar"]
