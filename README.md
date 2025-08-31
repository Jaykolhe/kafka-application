# Kafka Application 🎯

A **Spring Boot Kafka Application** that demonstrates producing and consuming **JSON messages** (`Student` objects) using **Apache Kafka**.

## 📖 What is Apache Kafka?
Apache Kafka is a **distributed event streaming platform** used for building real-time data pipelines and streaming applications.  

- **Producer**: Sends data (messages) to a Kafka topic.  
- **Topic**: A category/channel to which messages are published.  
- **Consumer**: Subscribes to a topic and reads messages.  
- **Broker**: Kafka server that stores messages.  
- **Zookeeper**: Keeps track of Kafka cluster metadata (for older versions; Kafka 3+ can run without it).  

In this project:
- A **Producer** publishes `Student` JSON objects to a topic `JK`.  
- A **Consumer** listens to the `JK` topic and processes these messages.  

## 📌 Features
- Kafka **JSON Producer** → Publishes `Student` objects to a topic.  
- Kafka **Consumer** → Subscribes to the same topic and consumes JSON messages.  
- End-to-end flow for **real-time messaging**.  
- Logging with **SLF4J** to trace message flow.  
- Built with **Spring Boot + Spring Kafka**.

## ⚡ Technologies Used
- **Java 21+**
- **Spring Boot**
- **Spring Kafka**
- **Apache Kafka**
- **Lombok**

## 🚀 Getting Started

### 1. Prerequisites
- Install **Apache Kafka** (or run it with Docker).  
- Start **Zookeeper/Kraft** and **Kafka broker**.  
  ```bash
  git clone https://github.com/Jaykolhe/kafka-application.git
cd kafka-application
./mvnw clean install
./mvnw spring-boot:run
