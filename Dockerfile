# author: daniel glenn papadopoulos - nieminen
#
#
# build the kafka producer for the topic eartquake
# build command is:
# docker build --compress -t reisebetreuer-backend:v0.0.1 .

FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]