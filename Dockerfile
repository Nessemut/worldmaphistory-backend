FROM openjdk:20-ea-19-jdk-slim
EXPOSE 8080
ADD /target/worldmaphistory-1.0-SNAPSHOT.jar wmh.jar
ENTRYPOINT ["java", "-jar", "wmh.jar"]