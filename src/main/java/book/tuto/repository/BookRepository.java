package book.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.tuto.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
