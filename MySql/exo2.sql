CREATE DATABASE IF NOT EXISTS exo2;

USE exo2;

CREATE TABLE IF NOT EXISTS compte(
compte_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
pseudo VARCHAR(50),
mot_de_passe VARCHAR(50),
email VARCHAR(255),
date_creation DATETIME,
derniere_connexion VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS role(
role_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
libelle VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS compte_role(
compte_id INT NOT NULL,
role_id INT  NULL,
CONSTRAINT fk_compte_id FOREIGN KEY(compte_id) REFERENCES compte(compte_id),
 CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES role(role_id),
date_ajout DATETIME PRIMARY KEY
);

SHOW TABLES;