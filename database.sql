create database lezione_api_1;
use lezione_api_1;


CREATE TABLE Student(
                        studentID INTEGER PRIMARY KEY AUTO_INCREMENT,
                        firstName VARCHAR(250) not null,
                        lastName VARCHAR(250) not null,
                        studentNumber VARCHAR(10) not null unique,
                        dateOfBirth DATE not null
);

CREATE TABLE Teacher(
                        teacherID INTEGER PRIMARY KEY AUTO_INCREMENT,
                        firstName VARCHAR(250) not null,
                        lastName VARCHAR(250) not null,
                        teachingSubject VARCHAR(250) not null
);

INSERT INTO Student (firstName, lastName, studentNumber, dateOfBirth) VALUES
                                                                          ('Luca', 'Rossi', 'STU001', '2002-03-15'),
                                                                          ('Marco', 'Verdi', 'STU002', '2001-11-02'),
                                                                          ('Giulia', 'Bianchi', 'STU003', '2003-07-21'),
                                                                          ('Sara', 'Conti', 'STU004', '2002-12-09'),
                                                                          ('Elena', 'Ferrari', 'STU005', '2000-05-30'),
                                                                          ('Alessio', 'Neri', 'STU006', '2001-01-19'),
                                                                          ('Chiara', 'Romano', 'STU007', '2003-09-14'),
                                                                          ('Davide', 'Moretti', 'STU008', '2002-02-27'),
                                                                          ('Francesca', 'Costa', 'STU009', '2001-06-10'),
                                                                          ('Matteo', 'Galli', 'STU010', '2000-04-05');


INSERT INTO Teacher (firstName, lastName, teachingSubject) VALUES
                                                               ('Paolo', 'Russo', 'Matematica'),
                                                               ('Anna', 'Gatti', 'Informatica'),
                                                               ('Stefano', 'Breda', 'Storia'),
                                                               ('Marta', 'Leoni', 'Fisica'),
                                                               ('Riccardo', 'Sala', 'Chimica'),
                                                               ('Valeria', 'Greco', 'Inglese'),
                                                               ('Franco', 'Serra', 'Filosofia'),
                                                               ('Elisa', 'Marini', 'Arte'),
                                                               ('Giorgio', 'Ferri', 'Biologia'),
                                                               ('Irene', 'Villa', 'Educazione Fisica');




