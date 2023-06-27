package dev.toyhr.contentcalendar;

import dev.toyhr.contentcalendar.model.Content;
import dev.toyhr.contentcalendar.model.Status;
import dev.toyhr.contentcalendar.model.Type;
import dev.toyhr.contentcalendar.reposirory.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content content = new Content(
					null,
					"Hello ChatGPT Blog Post",
					"All About ChatGPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}

}
