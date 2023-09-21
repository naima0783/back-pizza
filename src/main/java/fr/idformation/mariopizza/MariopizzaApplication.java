package fr.idformation.mariopizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MariopizzaApplication {

	/**
	 * max age of cross origin.
	 */
	public static final int AGE_MAX = 3600;
	/**
	 * the max size of column .
	 */
	public static final int SIZE_MAX = 120;

	/**
	 * the main method to call te pizza's app .
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(MariopizzaApplication.class, args);
	}

}
