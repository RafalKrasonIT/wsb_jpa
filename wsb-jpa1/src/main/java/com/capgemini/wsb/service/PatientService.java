package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.dao.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface PatientService {

    PatientTO findById(Long id);

    @Service
    public class PatientServiceImpl implements PatientService {

        private final PatientDao patientDao;

        @Autowired
        public PatientServiceImpl(PatientDao patientDao) {
            this.patientDao = patientDao;
        }

        @Override
        public PatientTO findById(Long id) {
            return null;
        }
    }
}
