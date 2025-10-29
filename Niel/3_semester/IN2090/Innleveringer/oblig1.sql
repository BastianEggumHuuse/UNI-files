--Oblig 1 IN2090-- 

-- oppgave 2a --

SELECT navn FROM Planet WHERE stjerne = 'Proxima Centauri';

-- oppgave 2b --

SELECT DISTINCT oppdaget FROM Planet WHERE stjerne = 'TRAPPIST-1' OR stjerne = 'Kepler-154';

-- oppgave 2c --

SELECT COUNT(*) FROM Planet WHERE masse IS NULL; 

-- oppgave 2d --

SELECT navn, masse FROM Planet WHERE oppdaget = 2020 AND Masse > (SELECT AVG(masse) FROM Planet);

-- oppgave 2e --

SELECT MAX(oppdaget) - MIN(oppdaget) AS antall_ar FROM Planet;

-- oppgave 3a --

SELECT planet.navn
FROM Planet planet
INNER JOIN Materie materie ON (planet.navn = materie.planet)
WHERE planet.masse BETWEEN 3 AND 10
AND materie.molekyl = 'H2O';


-- oppgave 3b --


SELECT DISTINCT planet.navn
FROM Planet planet
INNER JOIN Stjerne stjerne ON (planet.stjerne = stjerne.navn)
INNER JOIN Materie materie ON (planet.navn = materie.planet)
WHERE stjerne.avstand < (stjerne.masse * 12)
AND materie.molekyl LIKE '%H%';


-- oppgave 3c --

SELECT planet1.navn, planet1.masse, planet1.oppdaget, planet1.stjerne, planet2.navn, planet2.masse, planet2.oppdaget, stjerne.avstand, stjerne.masse 
FROM Planet planet1
INNER JOIN Planet planet2 ON (planet1.stjerne = planet2.stjerne AND planet1.navn != planet2.navn)
INNER JOIN Stjerne stjerne ON (planet1.stjerne = stjerne.navn)
WHERE planet1.masse > 10 AND planet2.masse > 10
AND stjerne.avstand < 50;


-- oppgave 4 --

-- Spørringen bruker NATURAL JOIN som kobler like kolonnenavn. -- 
-- Problemet er at begge tabellene har kolonnen navn men i stedet for at han finner Planet.stjerne som passer Stjerne.navn finner han ingen rader siden planetnavn og stjernenavn er forskjellige.--

-- oppgave 5a --

INSERT INTO Stjerne (navn, avstand, masse)
VALUES ('Sola', 0, 1);

-- oppgave 5b --

INSERT INTO Planet (navn, masse, oppdaget, stjerne)
VALUES ('Jorda', 0.003146, NULL, 'Sola');

-- oppgave 6 --

CREATE TABLE observasjon (observasjons_id int primary key, tidspunkt timestamp, referanse_planet text references planet(navn), kommentar text);