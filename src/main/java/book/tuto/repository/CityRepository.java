package book.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.tuto.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
