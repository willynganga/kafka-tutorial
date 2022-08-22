package ke.willythedev.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@SpringBootApplication
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

    @Configuration
    public class SubscriberService {

        @Bean
        public Consumer<String> sendText() {
            return msg -> System.out.println("The kafka message => " + msg);
        }

    }


}


