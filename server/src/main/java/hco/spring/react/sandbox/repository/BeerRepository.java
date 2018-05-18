package hco.spring.react.sandbox.repository;

import hco.spring.react.sandbox.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
