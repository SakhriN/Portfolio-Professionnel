CREATE DATABASE test;

USE test;

CREATE TABLE etudiant(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR(50),
lastName VARCHAR(50),
class_number INT NOT NULL,
diplome_date DATE
);

DROP TABLE etudiant;


INSERT INTO etudiant (firstName, lastName, class_number, diplome_date) VALUES
("Nassim", "Sakhri",1,"2021-12-12"),
("Clement", "Roelens",2,"2020-12-12"),
("Clémence", "Petit",3,"2021-02-01"),
("Olivia", "Pigani",4,"2020-02-29"),
("Romain", "Dufour",2,"2012-07-07"),
("Christophe", "Delory",3,"1999-08-08"),
("Joe Wilfried", "Tsonga",1,"2006-06-24"),
("Clark", "Kent",2,"2000-01-01"),
("Dominique", "Strauss-Kahn",1,"2007-07-07"),
("Robert", "Pattinson",2,"2020-12-12");

SELECT * FROM etudiant;

DELETE FROM etudiant where id=2;