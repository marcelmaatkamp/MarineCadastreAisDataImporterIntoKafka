# JHipster AIS Kafka Application

The application's purpose is to import data files from the Marine Cadastre website, specifically those related to vessel traffic, and send them to a local Kafka server. The repository includes the source code, documentation, and instructions for setting up and running the application. The documentation highlights the use of a hexagonal architecture, the various package types within the application, and the importance of unit testing with assertions. It also provides details on the Apache Kafka technology used for data streaming.

## Prerequisites

### Java

You need to have Java 21:

- [JDK 21](https://openjdk.java.net/projects/jdk/21/)

### Node.js and NPM

Before you can build this project, you must install and configure the following dependencies on your machine:

[Node.js](https://nodejs.org/): We use Node to run a development web server and build the project.
Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```
npm install
```

## Local environment


<!-- jhipster-needle-localEnvironment -->

## Start up

```bash
./mvnw 
```

```bash
docker compose -f src/main/docker/kafka.yml up -d
```


<!-- jhipster-needle-startupCommand -->

## Documentation

- [Hexagonal architecture](documentation/hexagonal-architecture.md)
- [Package types](documentation/package-types.md)
- [Assertions](documentation/assertions.md)
- [Apache Kafka](documentation/apache-kafka.md)

<!-- jhipster-needle-documentation -->
