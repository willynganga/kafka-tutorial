package ke.willythedev.kafkapublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaPublisherApplication {

	@Autowired
	private PublisherService publisherService;

	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> publisherService.sendGreeting();
	}

}
