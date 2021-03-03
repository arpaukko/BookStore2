package fi.haagahelia.BookStore2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.BookStore2.domain.Book;
import fi.haagahelia.BookStore2.domain.BookRepository;

@SpringBootApplication
public class BookStore2Application {

	public static void main(String[] args) {
		SpringApplication.run(BookStore2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book b1 = new Book("Selliläppää vankilasta", "Janne Raninen", 2021, "9789179954420", 19.99);
			Book b2 = new Book("Wanted Janne 'Nacci' Tranberg", "Janne Tranberg", 2019, "9789522895387", 19.99);
			
			repository.save(b1);
			repository.save(b2);
		};
	}

}
