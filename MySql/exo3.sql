CREATE DATABASE exo3;

USE exo3;


CREATE TABLE IF NOT EXISTS professeur(
professeur_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
prenom VARCHAR(50),
nom VARCHAR(50),
class_number INT,
dept_number INT,
email VARCHAR(255),
telephone VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS etudiant(
etudiant_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
prenom VARCHAR(50),
nom VARCHAR(50),
telephone VARCHAR(10),
class_number INT,
diplome_obtention DATETIME
);

CREATE TABLE IF NOT EXISTS association(
professeur_id INT NOT NULL,
etudiant_id INT NOT NULL,
CONSTRAINT fk_professeur_id FOREIGN KEY(professeur_id) REFERENCES professeur(professeur_id),
CONSTRAINT fk_etudiant_id FOREIGN KEY(etudiant_id) REFERENCES etudiant(etudiant_id)
);

show tables;

ALTER TABLE etudiant
	MODIFY telephone VARCHAR(10) NOT NULL UNIQUE;
    
ALTER TABLE professeur
	MODIFY telephone VARCHAR(10) NOT NULL UNIQUE,
    MODIFY email VARCHAR(255) UNIQUE;
    
show columns from professeur;

    
INSERT INTO professeur VALUES(1,'Christophe', 'Delory',170723,59,'toto@tata.titi',"0123456789");
    
INSERT INTO etudiant VALUES(1,"Nassim","Sakhri","0987654321",170723,"2020-07-01 23:23:23");

SELECT * from professeur;
SELECT * from etudiant;

-- DROP TABLE professeur;
-- DROP TABLE etudiant;
-- DROP TABLE association;