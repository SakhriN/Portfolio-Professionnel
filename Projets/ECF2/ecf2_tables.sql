CREATE DATABASE IF NOT EXISTS ECF2;

USE ECF2;

CREATE TABLE IF NOT EXISTS departement(
   id_de INT NOT NULL AUTO_INCREMENT,
   nom_de VARCHAR(50),
   PRIMARY KEY(id_de)
);

CREATE TABLE IF NOT EXISTS enseignant(
   id_en INT NOT NULL AUTO_INCREMENT,
   prenom_en VARCHAR(50),
   nom_en VARCHAR(50),
   age_en INT,
   grade VARCHAR(50),
   Est_Principal BOOLEAN,
   id_de INT NOT NULL,
   PRIMARY KEY(id_en),
   FOREIGN KEY(id_de) REFERENCES departement(id_de) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Emploi_du_temps(
   id_em INT NOT NULL AUTO_INCREMENT,
   debut_cours DATETIME,
   fin_cours DATETIME,
   PRIMARY KEY(id_em)
);

CREATE TABLE IF NOT EXISTS classe(
   id_cl INT NOT NULL AUTO_INCREMENT,
   nom_cl VARCHAR(50),
   id_de INT NOT NULL,
   PRIMARY KEY(id_cl),
   FOREIGN KEY(id_de) REFERENCES departement(id_de) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS matiere(
   id_ma INT NOT NULL AUTO_INCREMENT,
   nom_ma VARCHAR(50),
   desc_ma VARCHAR(50),
   duree_ma INT,
   coef_ma INT,
   PRIMARY KEY(id_ma)
);

CREATE TABLE IF NOT EXISTS etudiant(
   id_et INT NOT NULL AUTO_INCREMENT,
   prenom_et VARCHAR(50),
   nom_et VARCHAR(50),
   email_et VARCHAR(50),
   id_em INT NOT NULL,
   id_cl INT NOT NULL,
   PRIMARY KEY(id_et),
   FOREIGN KEY(id_em) REFERENCES Emploi_du_temps(id_em),
   FOREIGN KEY(id_cl) REFERENCES classe(id_cl) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS note(
   id_no INT NOT NULL AUTO_INCREMENT,
   note DECIMAL(4,2),
   id_ma INT NOT NULL,
   id_et INT NOT NULL,
   PRIMARY KEY(id_no),
   FOREIGN KEY(id_ma) REFERENCES matiere(id_ma) ON DELETE CASCADE,
   FOREIGN KEY(id_et) REFERENCES etudiant(id_et) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Enseigne(
   id_en INT NOT NULL AUTO_INCREMENT,
   id_ma INT,
   PRIMARY KEY(id_en, id_ma),
   FOREIGN KEY(id_en) REFERENCES enseignant(id_en) ON DELETE CASCADE,
   FOREIGN KEY(id_ma) REFERENCES matiere(id_ma)
);

CREATE TABLE IF NOT EXISTS Contient(
   id_em INT NOT NULL AUTO_INCREMENT,
   id_ma INT,
   PRIMARY KEY(id_em, id_ma),
   FOREIGN KEY(id_em) REFERENCES Emploi_du_temps(id_em),
   FOREIGN KEY(id_ma) REFERENCES matiere(id_ma)
);

-- DELETE FROM classe;
-- DELETE FROM departement;
-- DELETE FROM enseignant;
-- DELETE FROM emploi_du_temps;
-- DELETE FROM etudiant;
-- DELETE FROM matiere;
-- DELETE FROM note;
-- DELETE FROM contient;
-- DELETE FROM enseigne;


-- DROP TABLE departement;
-- DROP TABLE classe;
-- DROP TABLE enseignant;
-- DROP TABLE emploi_du_temps;
-- DROP TABLE etudiant;
-- DROP TABLE matiere;
-- DROP TABLE note;
-- DROP TABLE contient;
-- DROP TABLE enseigne;

SELECT * FROM classe;
SELECT * FROM departement;
SELECT * FROM enseignant;
SELECT * FROM emploi_du_temps;
SELECT * FROM etudiant;
SELECT * FROM matiere;
SELECT * FROM note;
SELECT * FROM contient;
SELECT * FROM enseigne;

-- DELETE FROM departement WHERE id_de = 1;