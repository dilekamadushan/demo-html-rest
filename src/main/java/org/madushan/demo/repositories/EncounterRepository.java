package org.madushan.demo.repositories;

import org.madushan.demo.domain.Encounter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EncounterRepository extends CrudRepository<Encounter, Integer>{
}
