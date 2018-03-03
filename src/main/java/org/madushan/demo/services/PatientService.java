package org.madushan.demo.services;


import org.madushan.demo.domain.Patient;

public interface PatientService {
    Iterable<Patient> listAllPatients();

    Patient getPatientById(Integer id);

    Patient savePatient(Patient patient);

    void deletePatient(Integer id);
}
