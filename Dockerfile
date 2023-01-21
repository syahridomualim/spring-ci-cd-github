FROM eclipse-temurin:17-jdk-focal

EXPOSE 8082

WORKDIR /app
 
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
 
COPY src ./src
 
CMD ["./mvnw", "spring-boot:run"]
