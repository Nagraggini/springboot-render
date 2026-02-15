# Build stage
#Lefordítom és becsomagolom az alkalmazásomat.
#A java verziót a pom.xml fájlban láthatod.
FROM maven:3.9.5-openjdk-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Run stage
#Ez a konténer lesz,a hol fut az app.
FROM openjdk:21-jdk-slim
WORKDIR /app
#jar fájl adtunk meg a start.spring.io oldalon. A build szó a fentebb létrehozott stage-ra utal.
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar
#Ezen a porton futott offline a java servlet.
EXPOSE 8080 
#Belépési pont:
ENTRYPOINT ["java","-jar","demo.jar"]