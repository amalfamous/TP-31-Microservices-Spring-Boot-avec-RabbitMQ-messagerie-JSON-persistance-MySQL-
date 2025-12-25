package org.example.microservicesmessagingconsumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class MicroservicesMessagingConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesMessagingConsumerApplication.class, args);
    }

}
