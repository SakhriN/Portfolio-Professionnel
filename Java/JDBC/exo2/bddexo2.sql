CREATE DATABASE bddexo2;

USE bddexo2;


CREATE TABLE client (
    id_client INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    numeroTelephone VARCHAR(15)
);

CREATE TABLE compte_bancaire (
    id_compte INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    solde DECIMAL(10, 2),
    client_id INT,
    CONSTRAINT fk_client_id FOREIGN KEY (client_id) REFERENCES client(id_client)
);


CREATE TABLE operation (
    id_operation INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    montant DECIMAL(10, 2),
    type VARCHAR(10),
    compte_id INT,
    CONSTRAINT fk_compte_id FOREIGN KEY (compte_id) REFERENCES compte_bancaire(id_compte)
);


DROP TABLE operation;
DROP TABLE compte_bancaire;
DROP TABLE client;