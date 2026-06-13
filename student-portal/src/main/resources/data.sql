-- Clear existing data to prevent unique constraint conflicts during testing
DELETE FROM grades;
DELETE FROM subjects;
DELETE FROM students;
DELETE FROM users;

-- ==========================================
-- 1. INSERT USERS (1 Teacher, 2 Parents)
-- ==========================================
-- Teacher account
INSERT INTO users (user_id, username, password, role)
VALUES ('a1b2c3d4-e5f6-7a8b-9c0d-1e2f3a4b5c6d', 'TEACHER_JOHN', 'hashed_teacher_password', 'TEACHER');

-- Parent Account for Student 1 (Username matches Admission Number)
INSERT INTO users (user_id, username, password, role)
VALUES ('11111111-2222-3333-4444-555555555555', 'ADM-2026-001', 'hashed_parent_password_1', 'PARENT');

-- Parent Account for Student 2 (Username matches Admission Number)
INSERT INTO users (user_id, username, password, role)
VALUES ('66666666-7777-8888-9999-000000000000', 'ADM-2026-002', 'hashed_parent_password_2', 'PARENT');


-- ==========================================
-- 2. INSERT STUDENTS (Linked to the Parent Users via UUID)
-- ==========================================
-- Student 1
INSERT INTO students (admission_number, user_id, first_name, middle_name, last_name)
VALUES ('ADM-2026-001', '11111111-2222-3333-4444-555555555555', 'Liam', 'Alexander', 'Davis');

-- Student 2 (Middle name omitted to test NULL handling)
INSERT INTO students (admission_number, user_id, first_name, middle_name, last_name)
VALUES ('ADM-2026-002', '66666666-7777-8888-9999-000000000000', 'Sophia', NULL, 'Martinez');


-- ==========================================
-- 3. INSERT SUBJECTS
-- ==========================================
INSERT INTO subjects (subject_id, subject_name)
VALUES ('f4712f34-315c-433b-8d3c-912b591b1234', 'Mathematics');

INSERT INTO subjects (subject_id, subject_name)
VALUES ('e8211a92-214b-482a-9e1d-842c191a5678', 'English Language');

INSERT INTO subjects (subject_id, subject_name)
VALUES ('bc128d84-592a-4b91-ac83-193b202c9012', 'Integrated Science');


-- ==========================================
-- 4. INSERT GRADES (Linked by Admission Number & Subject UUID)
-- ==========================================
-- Student 1 (Liam Davis): Academic Year 2026 Grades
INSERT INTO grades (grade_id, admission_number, subject_id, academic_year, score)
VALUES ('9a8b7c6d-5e4f-3a2b-1c0d-e9f8a7b6c5d4', 'ADM-2026-001', 'f4712f34-315c-433b-8d3c-912b591b1234', 2026, 88.50);

INSERT INTO grades (grade_id, admission_number, subject_id, academic_year, score)
VALUES ('8b7c6d5e-4f3a-2b1c-0d9e-f8a7b6c5d4e3', 'ADM-2026-001', 'e8211a92-214b-482a-9e1d-842c191a5678', 2026, 91.25);

-- Student 2 (Sophia Martinez): Academic Year 2026 Grades
INSERT INTO grades (grade_id, admission_number, subject_id, academic_year, score)
VALUES ('7c6d5e4f-3a2b-1c0d-9e8f-a7b6c5d4e3f2', 'ADM-2026-002', 'f4712f34-315c-433b-8d3c-912b591b1234', 2026, 74.00);

INSERT INTO grades (grade_id, admission_number, subject_id, academic_year, score)
VALUES ('6d5e4f3a-2b1c-0d9e-8f7a-b6c5d4e3f2a1', 'ADM-2026-002', 'bc128d84-592a-4b91-ac83-193b202c9012', 2026, 95.75);
