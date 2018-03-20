package guru.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
