-- INSERTIONS 

INSERT INTO departement VALUES
(1,"Sévigné"),
(2,"Colbert"),
(3,"Averroes"),
(4,"Jean Rostand"),
(5,"Sainte Lucie");

INSERT INTO enseignant VALUES
(1,"Mohamed","Voila",42,"A",false,1),
(2,"Christophe","Toto",32,"A",false,2),
(3,"Christophe","Unknown",45,"C",false,4),
(4,"Arthur","Joyeux",29,"A",true,3),
(5,"Antoine","Energique",19,"B",false,5);

INSERT INTO emploi_du_temps VALUES
(1, '2024-03-07 09:00:00', '2024-06-07 17:30:00'),
(2, '2024-03-07 09:52:28', '2025-09-20 09:52:28'),
(3, '2024-03-07 09:52:28', '2026-01-20 09:52:28'),
(4, '2024-03-07 09:52:28', '2030-04-20 09:52:28'),
(5, '2024-03-07 09:52:28', '2103-05-20 09:52:28');

INSERT INTO classe VALUES
(1,"5eme A",1),
(2,"5eme B",1),
(3,"5eme A",2),
(4,"6eme C",4),
(5,"3eme D",3),
(6,"3eme B",5);

INSERT INTO matiere VALUES
(1,"Java","Utile partout",60,5),
(2,"Combats pokemon","Se reposer et évacuer son stress a tout moment",60,4),
(3,"TypeScript","Ultra dur mais utile (a ce qu'il parait)",60,3),
(4,"MySql","Parce que c'est la base pour les bases(de données)",60,2),
(5,"Assembleur","Pourquoi cette matière existe ?",60,1);

INSERT INTO etudiant VALUES
(1,"Nassim","Sakhri","nassim.sakhri@gmail.com",1,1),
(2,"Clement","Roelens","clement.roelens@gmail.com",2,2),
(3,"Clemence","Petit","clemence.petit@gmail.com",3,3),
(4,"Olivia","Pigani","olivia.pigani@gmail.com",4,4),
(5,"Maxime","Morvan","maxime.morvan@gmail.com",5,5);

INSERT INTO note VALUES
(1,20,3,2),
(2,19.99,4,3),
(3,19.97,2,1),
(4,10,1,4),
(5,0,5,5);

INSERT INTO enseigne VALUES
(1,3),
(2,1),
(3,5),
(4,2),
(5,4);

INSERT INTO contient VALUES
(1,5),
(2,3),
(3,1),
(4,4),
(5,2);

-- LECTURES

-- SELECT id_cl, nom_cl FROM classe;


-- SELECT COUNT(DISTINCT id_ma) AS nombre_de_matieres FROM note WHERE id_et = '1';

-- SELECT note.id_no, note.note, matiere.nom_ma
-- FROM note
-- JOIN matiere ON note.id_ma = matiere.id_ma
-- WHERE note.id_et = 1;

-- SELECT AVG(note) AS moyenne
-- FROM note
-- WHERE id_et = 1;

-- SELECT COUNT(*) AS nombre_eleves
-- FROM departement
-- JOIN classe ON departement.id_de = classe.id_de
-- JOIN etudiant ON classe.id_cl = etudiant.id_cl
-- WHERE departement.id_de = 1;

-- SELECT nom_et, prenom_et
-- FROM etudiant
-- WHERE id_cl = 1;

-- Suppression :

-- DELETE FROM etudiant WHERE id_et = 5;

-- DELETE FROM classe WHERE id_cl = 4;

-- DELETE FROM departement WHERE id_de = 1;







