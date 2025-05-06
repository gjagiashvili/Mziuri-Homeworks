CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    dob DATE,
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    grade INTEGER CHECK (grade >= 1) CHECK (grade <= 12),
    email TEXT UNIQUE 
);

INSERT INTO students (first_name, last_name, dob, enrollment_date, grade, email)
VALUES
('Gio', 'Jagiashvili', '2009-04-04', DEFAULT, 10, 'gjagiashvili@gmail.com'),
('Ana', 'Dzagnidze', '2009-10-10', DEFAULT, 12, 'ana@gmail.com'),
('Temo', 'Gogiashvili', '2012-02-20', DEFAULT, 2, 'temo@gmail.com'),
('Anastasia', 'Asatiani', '2008-08-08', DEFAULT, 8, 'anastiasia@gmail.com'),
('Data', 'Gabadadze', '2007-07-07', DEFAULT, 9, 'data@gmail.com');

-- -- ხარვეზი იმით რომ კლასი 12-ზე მაღალია
-- INSERT INTO students (first_name, last_name, dob, grade, email)
-- VALUES ('Mariam', 'Basilashvili', '2000-06-01', 15, 'mariam@gmail.com');

-- -- ან იმეილი რომ უნიკალური არაა
-- INSERT INTO students (first_name, last_name, dob, grade, email)
-- VALUES ('ელენე', 'ნოზაძე', '2010-01-01', 4, 'ana.g@example.com');

UPDATE students
SET grade = grade + 1
WHERE first_name = 'Anastasia' AND last_name = 'Asatiani';

DELETE FROM students
WHERE first_name = 'Data';



