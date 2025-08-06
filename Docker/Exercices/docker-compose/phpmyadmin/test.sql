
CREATE TABLE bagarre(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    lieu VARCHAR(50),
    date_bagarre DATETIME,
    objets BOOLEAN,
    arbitrage BOOLEAN,
    match_a_mort BOOLEAN,
    amount_for_the_winner INT
);

INSERT INTO bagarre (lieu,date_bagarre,objets,arbitrage,match_a_mort,amount_for_the_winner)
("Roubaix","2025-01-01T00:00:00Z", false,false,true,120502);