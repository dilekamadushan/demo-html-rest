package org.madushan.demo.repositories;

import org.madushan.demo.domain.Item;
import org.madushan.demo.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemRepository extends CrudRepository<Item, Integer>{
}
