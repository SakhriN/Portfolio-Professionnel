CREATE DATABASE exo5;

USE exo5;

SELECT * FROM villes_france_free;
SELECT * FROM departement;

SELECT * from villes_france_free ORDER BY ville_population_2012 DESC LIMIT 10;

SELECT * from villes_france_free ORDER BY ville_surface ASC LIMIT 50;

SELECT * from departement WHERE departement_code LIKE "97%";

SELECT ville_nom, departement_nom from villes_france_free,departement WHERE departement.departement_code = villes_france_free.ville_departement ORDER BY ville_population_2012 DESC LIMIT 10 ;

SELECT departement_nom, COUNT(ville_departement) AS nombre_communes FROM departement,villes_france_free WHERE departement.departement_code = villes_france_free.ville_departement GROUP BY departement_nom ORDER BY COUNT(ville_departement) DESC;

SELECT departement_nom, SUM(ville_surface) FROM departement, villes_france_free WHERE departement.departement_code = villes_france_free.ville_departement GROUP BY departement_nom ORDER BY SUM(ville_surface) DESC LIMIT 10;

SELECT COUNT(ville_nom) AS "Nombre de ville qui commencent par Saint" FROM villes_france_free WHERE ville_nom LIKE "Saint%";

SELECT ville_nom, COUNT(*) AS "Nombres de fois qu'il y'a le meme nom de ville" FROM villes_france_free  GROUP BY ville_nom HAVING COUNT(*)>1  ORDER BY COUNT(*) DESC;

SELECT ville_nom, ville_surface AS superficie FROM villes_france_free WHERE ville_surface > (SELECT AVG(ville_surface) FROM villes_france_free);

SELECT departement_nom, departement_code, SUM(ville_population_2012) AS "Population en 2012" FROM departement, villes_france_free WHERE villes_france_free.ville_departement = departement.departement_code GROUP BY departement_nom, departement_code HAVING SUM(ville_population_2012)>2000000; 


-- Corrigé du 11 :