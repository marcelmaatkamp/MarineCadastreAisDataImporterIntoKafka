FROM maven:3 AS builder
WORKDIR /application
COPY src /application/src
COPY pom.xml /application/pom.xml
RUN \
 mvn package

FROM eclipse-temurin:21.0.5_11-jre-ubi9-minimal
WORKDIR /application
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY --from=builder /application/target/jhipster-aiskafka-application-0.0.1-SNAPSHOT.jar jhipster-aiskafka-application-0.0.1-SNAPSHOT.jar
EXPOSE 8080
# ENTRYPOINT exec java $JAVA_OPTS -jar jhipster-aiskafka-application-0.0.1-SNAPSHOT.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -cp /application:. -jar jhipster-aiskafka-application-0.0.1-SNAPSHOT.jar
