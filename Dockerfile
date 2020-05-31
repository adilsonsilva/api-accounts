FROM openjdk:11-jre
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/api-accounts.jar
WORKDIR /app
ENTRYPOINT java -jar api-accounts.jar
