package book.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.tuto.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
