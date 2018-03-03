package org.madushan.demo.repositories;

import org.madushan.demo.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PatientRepository extends CrudRepository<Patient, Integer>{
}
