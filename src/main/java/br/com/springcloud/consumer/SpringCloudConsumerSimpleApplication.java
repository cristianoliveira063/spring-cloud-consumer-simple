package br.com.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudConsumerSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerSimpleApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void readMessage(String message) {
        System.out.println("New message: " + message);
    }

}

