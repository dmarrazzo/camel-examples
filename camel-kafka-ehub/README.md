# Camel from Kafka to Azure Event Hub

Example of Camel on Quarkus to integrate Kafka with Azure Event Bus.

WARNING: The only treatment of messages is the removal of `kafka.HEADER`.

## Environment variables

Set up the environment variables as in the following example:

```sh
KAFKA_TOPIC_NAME=event
BROKERS=my-cluster-kafka.example.com:443
EVENT_HUB_CONNECTION_STRING=Endpoint=sb://xyz.servicebus.windows.net/;SharedAccessKeyName=xyz-hub-policy;SharedAccessKey=....=;EntityPath=xyz-hub
KEYSTORES_DIR=/dir/path
```

> TIP: Quarkus can load the environment variables from `.env` file

## Run in dev mode

```sh
mvn quarkus:dev
```