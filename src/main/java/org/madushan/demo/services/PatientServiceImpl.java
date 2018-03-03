package org.madushan.demo.services;

import org.madushan.demo.domain.Patient;
import org.madushan.demo.repositories.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private PatientRepository patientRepository;

    @Autowired
    public void setPatientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Iterable<Patient> listAllPatients() {
        logger.debug("listAllPatients called");
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Integer id) {
        logger.debug("getPatientById called");
        return patientRepository.findOne(id);
    }

    @Override
    public Patient savePatient(Patient patient) {
        logger.debug("savePatient called");
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Integer id) {
        logger.debug("deletePatient called");
        patientRepository.delete(id);
    }
}
