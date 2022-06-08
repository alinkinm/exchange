FROM openjdk:8
ADD build/libs/exchange-0.0.1-SNAPSHOT.jar exchange-0.0.1-SNAPSHOT.jar
EXPOSE 9966
ENTRYPOINT ["java", "-jar", "exchange-0.0.1-SNAPSHOT.jar"]