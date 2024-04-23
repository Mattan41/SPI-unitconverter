FROM openjdk:22

WORKDIR /app

COPY service/target/*.jar service.jar
COPY consumer/target/*.jar consumer.jar
COPY provider/target/*.jar provider.jar

CMD ["java", "-p", ".", "-m", "org.example.consumer/org.example.consumer.Main"]