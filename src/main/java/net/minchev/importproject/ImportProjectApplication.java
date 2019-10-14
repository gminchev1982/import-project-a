package net.minchev.importproject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImportProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ImportProjectApplication.class, args);
		Logger logger = LoggerFactory.getLogger(ImportProjectApplication.class);
		logger.info("ImportProject");

	}

}
