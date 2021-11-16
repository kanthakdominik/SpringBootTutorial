package pl.dominik.springboottutorial.repository;

import org.springframework.data.repository.CrudRepository;
import pl.dominik.springboottutorial.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
