package com.redhat.ssa;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("kafka:{{kafka.topic.name}}")
        //from("timer:java?period=10000")
                .routeId("Kafka2AEHub")
                .removeHeader("kafka.HEADERS")
                .log("Received : \"${body}\"")
                //.to("log:DEBUG?showBody=true&showHeaders=true");
                .to("azure-eventhubs://dmshift/my-hub");
    }

}
