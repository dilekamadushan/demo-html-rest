package org.madushan.demo.services;

import org.madushan.demo.domain.Encounter;
import org.madushan.demo.repositories.EncounterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncounterServiceImpl implements EncounterService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private EncounterRepository encounterRepository;

    @Autowired
    public void setEncounterRepository(EncounterRepository encounterRepository) {
        this.encounterRepository = encounterRepository;
    }

    @Override
    public List<Encounter> listAllEncounters() {
        logger.debug("listAllEncounters called");
        return (List<Encounter>) encounterRepository.findAll();
    }

    @Override
    public Encounter getEncounterById(Integer id) {
        logger.debug("getEncounterById called");
        return encounterRepository.findOne(id);
    }

    @Override
    public Encounter saveEncounter(Encounter encounter) {
        logger.debug("saveEncounter called");
        return encounterRepository.save(encounter);
    }

    @Override
    public void deleteEncounter(Integer id) {
        logger.debug("deleteEncounter called");
        encounterRepository.delete(id);
    }
}
