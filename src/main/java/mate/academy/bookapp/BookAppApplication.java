package mate.academy.bookapp;

import java.math.BigDecimal;
import mate.academy.bookapp.model.Book;
import mate.academy.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookAppApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book book1 = new Book();
                book1.setTitle("Shuggie Bain");
                book1.setAuthor("Douglas Stuart");
                book1.setPrice(BigDecimal.valueOf(60));
                book1.setIsbn("221-5-16-156813-1");
                book1.setDescription("It tells the story of the youngest of three children, "
                        + "Shuggie, growing up with his alcoholic mother Agnes in 1980s "
                        + "post-industrial working-class Glasgow, Scotland");
                book1.setCoverImage("A black-and-white photograph of a young boy "
                        + "sitting atop a metal structure, which appears to be part "
                        + "of a playground");

                Book book2 = new Book();
                book2.setTitle("White Noise");
                book2.setAuthor("Don DeLillo");
                book2.setPrice(BigDecimal.valueOf(52));
                book2.setIsbn("001-7-19-164825-1");
                book2.setDescription("White Noise describes an academic year "
                        + "in the life of its narrator, "
                        + "Jack Gladney, a college professor in a small American town.");
                book2.setCoverImage("Early-morning or late-evening urban scene");

                Book book3 = new Book();
                book3.setTitle("We Were Liars");
                book3.setAuthor("Emily Lockhart");
                book3.setPrice(BigDecimal.valueOf(65));
                book3.setIsbn("121-8-21-165489-1");
                book3.setDescription("We Were Liars is a mysterious young adult novel about "
                        + "a wealthy family who spends every summer on their private island. ");
                book3.setCoverImage("Three friends swimming in the ocean");

                bookService.save(book1);
                bookService.save(book2);
                bookService.save(book3);
                System.out.println(bookService.findAll());
            }
        };
    }

}
