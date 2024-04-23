FROM openjdk:22

WORKDIR /app

COPY service/target/service-1.0-SNAPSHOT.jar /app/service-1.0-SNAPSHOT.jar
COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/consumer-1.0-SNAPSHOT.jar
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/provider-1.0-SNAPSHOT.jar

CMD ["bash", "-c", "java -p . -m org.example.consumer/org.example.consumer.Main"]