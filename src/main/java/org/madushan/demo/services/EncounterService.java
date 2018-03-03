package org.madushan.demo.services;


import org.madushan.demo.domain.Encounter;

import java.util.List;

public interface EncounterService {
    List<Encounter> listAllEncounters();

    Encounter getEncounterById(Integer id);

    Encounter saveEncounter(Encounter encounter);

    void deleteEncounter(Integer id);
}
