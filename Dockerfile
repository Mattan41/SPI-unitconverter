FROM openjdk:22

WORKDIR /app

COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/consumer-1.0-SNAPSHOT.jar
COPY service/target/service-1.0-SNAPSHOT.jar /app/service-1.0-SNAPSHOT.jar
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/provider-1.0-SNAPSHOT.jar

CMD ["java", "-jar", "consumer-1.0-SNAPSHOT.jar", "service-1.0-SNAPSHOT.jar", "provider-1.0-SNAPSHOT.jar"]