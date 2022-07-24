FROM openjdk:8
ADD target/matrimonialaws.jar matrimonialaws.jar
ENTRYPOINT ["java", "-jar","matrimonialaws.jar"]
EXPOSE 8080