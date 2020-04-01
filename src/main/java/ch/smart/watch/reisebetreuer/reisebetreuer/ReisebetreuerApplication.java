package ch.smart.watch.reisebetreuer.reisebetreuer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReisebetreuerApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/api/v1");
		SpringApplication.run(ReisebetreuerApplication.class, args);
	}

}
