package book.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.tuto.model.Zipcode;

@Repository
public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
}
