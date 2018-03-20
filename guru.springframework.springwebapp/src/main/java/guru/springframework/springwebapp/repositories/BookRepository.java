package guru.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.springwebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
