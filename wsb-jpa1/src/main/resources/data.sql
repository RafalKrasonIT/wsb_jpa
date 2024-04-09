insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');

INSERT INTO doctor (first_name, last_name, telephone_number, email, doctor_number, specialization) VALUES
                                                                                                       ('Anna', 'Kowalska', '555-100-100', 'akowalska@clinic.com', '12345', 'Cardiology'),
                                                                                                       ('Piotr', 'Nowak', '555-200-200', 'pnowak@clinic.com', '67890', 'Pediatrics');

INSERT INTO patient (first_name, last_name, date_of_birth, telephone_number, email, patient_number, address_id) VALUES
                                                                                                                    ('Ewa', 'Maj', '1990-05-20', '555-300-300', 'emaj@mail.com', 'PN001', 1),
                                                                                                                    ('Marek', 'Biały', '1985-10-11', '555-400-400', 'mbialy@mail.com', 'PN002', 1);

INSERT INTO visit (description, time, doctor_id, patient_id) VALUES
                                                                 ('Routine check-up', '2024-04-20 09:00:00', 1, 1),
                                                                 ('Yearly pediatric examination', '2024-04-20 10:00:00', 2, 2);

INSERT INTO medical_treatment (description, type, visit_id) VALUES
                                                                ('Blood pressure measurement', 'CHECKUP', 1),
                                                                ('Annual flu vaccine', 'VACCINATION', 2);


