package org.madushan.demo.services;

import org.madushan.demo.domain.Concept;
import org.madushan.demo.repositories.ConceptRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConceptServiceImpl implements ConceptService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ConceptRepository conceptRepository;

    @Autowired
    public void setConceptRepository(ConceptRepository conceptRepository) {
        this.conceptRepository = conceptRepository;
    }

    @Override
    public List<Concept> listAllConcepts() {
        logger.debug("listAllConcepts called");
        return (List<Concept>) conceptRepository.findAll();
    }

    @Override
    public Concept getConceptById(Integer id) {
        logger.debug("getConceptById called");
        return conceptRepository.findOne(id);
    }

    @Override
    public Concept saveConcept(Concept concept) {
        logger.debug("saveConcept called");
        return conceptRepository.save(concept);
    }

    @Override
    public void deleteConcept(Integer id) {
        logger.debug("deleteConcept called");
        conceptRepository.delete(id);
    }
}
