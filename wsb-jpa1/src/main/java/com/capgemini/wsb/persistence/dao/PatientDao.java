package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long> {

    PatientEntity findById(Long id);
    List<PatientEntity> findAll();
    PatientEntity save(PatientEntity patient);
    void delete(PatientEntity patient);

}
