package org.madushan.demo.repositories;

import org.madushan.demo.domain.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProviderRepository extends CrudRepository<Provider, Integer>{
}
