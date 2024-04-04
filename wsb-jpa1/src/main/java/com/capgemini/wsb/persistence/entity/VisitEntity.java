package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor_id") // Nazwa kolumny klucza obcego w bazie danych
	private DoctorEntity doctor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id") // Nazwa kolumny klucza obcego w bazie danych
	private PatientEntity patient;

	@OneToMany(mappedBy = "visit", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<MedicalTreatmentEntity> medicalTreatments;

	// Getters and setters dla nowych relacji
	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public Set<MedicalTreatmentEntity> getMedicalTreatments() {
		return medicalTreatments;
	}

	public void setMedicalTreatments(Set<MedicalTreatmentEntity> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
