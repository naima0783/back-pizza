package fr.idformation.marioPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	/**
	 * Max Age.
	 */
	public static final long MAX = 3600;

	/**
	 * Column = 20.
	 */
	public static final int COLUMN20 = 20;

	/**
	 * the main of the application mario's pizza .
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
