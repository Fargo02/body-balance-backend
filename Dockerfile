FROM gradle:8.4-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle buildFatJar --no-daemon  # Собираем fat-jar

FROM openjdk:11
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/body-balance.jar
ENTRYPOINT ["java", "-jar", "/app/body-balance.jar"]
