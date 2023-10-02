-- HEALTH UNIT / UNIDADE DE SAÚDE
INSERT INTO tb_health_units (name) VALUES ('Health Unit A');
INSERT INTO tb_health_units (name) VALUES ('Health Unit B');
INSERT INTO tb_health_units (name) VALUES ('Health Unit C');
-- DOCTOR / MÉDICO
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Smith', 'Cardiologist', 1);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Johnson', 'Dermatologist', 2);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Williams', 'Pediatrician', 3);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Jones', 'Orthopedic Surgeon', 1);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Brown', 'Ophthalmologist', 2);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Davis', 'Neurologist', 3);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Miller', 'Gynecologist', 1);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Wilson', 'Dentist', 2);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Moore', 'Psychiatrist', 3);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. Taylor', 'ENT Specialist', 1);
INSERT INTO tb_doctors (name, speciality, health_unit_id) VALUES ('Dr. House', 'ENT Specialist', 2);
-- USER / USUÁRIO
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('John', 'Doe', '123456789', 'johndoe1', 'password1');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Jane', 'Smith', '987654321', 'janesmith2', 'password2');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Alice', 'Johnson', '456789123', 'alicejohnson3', 'password3');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Bob', 'Williams', '789123456', 'bobwilliams4', 'password4');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Emily', 'Brown', '321654987', 'emilybrown5', 'password5');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('David', 'Davis', '654987321', 'daviddavis6', 'password6');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Sarah', 'Miller', '987321654', 'sarahmiller7', 'password7');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Michael', 'Wilson', '654123789', 'michaelwilson8', 'password8');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Olivia', 'Moore', '321789456', 'oliviamoore9', 'password9');
INSERT INTO tb_users (firstname, lastname, document, username, password) VALUES ('Daniel', 'Taylor', '789456321', 'danieltaylor10', 'password10');
-- SCHEDULES / AGENDAMENTOS
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-27T10:00:00Z', 1, 1);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-27T11:30:00Z', 2, 2);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-27T14:15:00Z', 3, 3);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-28T09:45:00Z', 4, 4);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-28T13:30:00Z', 5, 5);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-29T16:00:00Z', 6, 6);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-30T08:30:00Z', 7, 7);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-09-30T10:45:00Z', 8, 8);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-10-01T15:15:00Z', 9, 9);
INSERT INTO tb_schedules (moment, doctor_id, user_id) VALUES ('2023-10-02T12:00:00Z', 10, 10);