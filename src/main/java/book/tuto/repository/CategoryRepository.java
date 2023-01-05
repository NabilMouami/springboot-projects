package book.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.tuto.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
