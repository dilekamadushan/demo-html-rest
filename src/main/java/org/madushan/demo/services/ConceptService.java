package org.madushan.demo.services;


import org.madushan.demo.domain.Concept;

import java.util.List;

public interface ConceptService {
    List<Concept> listAllConcepts();

    Concept getConceptById(Integer id);

    Concept saveConcept(Concept concept);

    void deleteConcept(Integer id);
}

