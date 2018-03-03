package org.madushan.demo.repositories;

import org.madushan.demo.domain.Concept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConceptRepository extends CrudRepository<Concept, Integer>{
}
