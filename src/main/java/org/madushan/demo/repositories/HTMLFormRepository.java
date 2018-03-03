package org.madushan.demo.repositories;

import org.madushan.demo.domain.HTMLForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HTMLFormRepository extends CrudRepository<HTMLForm, Integer>{
}
