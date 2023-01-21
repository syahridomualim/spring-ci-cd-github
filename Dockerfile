FROM openjdk:17

EXPOSE 8082

WORKDIR /applications

COPY target/springboot-cicd.jar /applications/springboot-cicd.jar

ENTRYPOINT ["java","-jar", "springboot-cicd.jar"]
