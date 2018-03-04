package org.madushan.demo.repositories;

import org.madushan.demo.domain.HTMLPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HTMLPageRepository extends CrudRepository<HTMLPage, Integer>{
}
