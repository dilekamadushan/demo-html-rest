package org.madushan.demo.services;


import org.madushan.demo.domain.Encounter;
import org.madushan.demo.domain.FormSubmission;

import java.util.List;

public interface EncounterService {
    List<Encounter> listAllEncounters();

    Encounter getEncounterById(Integer id);

    Encounter saveEncounter(FormSubmission formSubmission);

    void deleteEncounter(Integer id);
}
