[TOC]

# Spring Kafka Demo

## Run Kafka locally with Docker

```bash
cd scripts/kafka

# start
docker-compose up -d 

# stop
docker-compose stop

```

## Spring Boot Application

- Spring Boot 2.4.0
- Kafka 2.6.0
- Java 1.8


## Test send / receive messages

```bash
curl -X POST http://localhost:8080/kafka/publish -F 'message=luckyboy'
```


