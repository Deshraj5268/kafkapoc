# kafkaproject

Once you download Kafka, you can issue a command to start ZooKeeper which is used by Kafka to store metadata.

zookeeper-server-start.bat .\config\zookeeper.properties 

Next, we need to start the Kafka cluster locally by issuing the below command.

kafka-server-start.bat .\config\server.properties 

Now, by default, the Kafka server starts on localhost:9092


