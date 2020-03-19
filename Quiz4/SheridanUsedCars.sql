DROP DATABASE IF EXISTS sheridanusedcars;

CREATE DATABASE sheridanusedcars;

USE sheridanusedcars;

DROP TABLE IF EXISTS manufacturer;

CREATE TABLE manufacturer (
manufacturerID int NOT NULL AUTO_INCREMENT,
manufacturer varchar(30) NOT NULL,
PRIMARY KEY (manufacturerID)
);

INSERT INTO manufacturer (manufacturer) VALUES ('Nissan'),('Honda'),('Ford'),('Hyundai'),('Volkswagen'),('Chevrolet');

DROP TABLE IF EXISTS car;

CREATE TABLE car (
carID int NOT NULL AUTO_INCREMENT,
manufacturerID int NOT NULL,
model VARCHAR(30) NOT NULL,
year int NOT NULL,
colour VARCHAR(30) NOT NULL,
price decimal(7,2) NOT NULL,
PRIMARY KEY (carID),
FOREIGN KEY (manufacturerID) REFERENCES manufacturer(manufacturerID)
);

INSERT INTO car (manufacturerID, model, year, colour, price)
VALUES (1,'Sentra',2011,'Silver',15295.00),(5,'Beetle',2007,'Red',15995.00),(1,'Rogue',2012,'Brown',18995.00),
(4,'Tucson',2018,'Blue',13995.00),(2,'Fit',2007,'Black',11995.00),(4,'Sonata',2012,'Gray',10995.00),(2,'Civic',2012,'White',12995.00),
(2,'Civic',2012,'Gray',12995.00),(2,'Civic',2012,'Blue',10495.00),(3,'Focus',2010,'Silver',7495.00),(3,'Fusion',2013,'White',11495.00),
(3,'Fusion',2010,'Black',10995.00),(6,'Malibu',2017,'Gold',8795.00),(6,'Malibu',2017,'Blue',8795.00),(6,'Equinox',2014,'Purple',10995.00),
(6,'Cobalt',2013,'Black',7995.00),(2,'CR-V',2012,'Black',16995.00),(2,'Accord',2013,'White',13495.00),(1,'Altima',2015,'Black',15495.00),
(1,'Altima',2017,'Red',12495.00),(1,'Altima',2014,'Gray',13295.00),(2,'Civic',2011,'Silver',9995.00),(3,'Fusion',2006,'Red',10495.00),
(3,'Focus',2013,'Silver',9495.00),(3,'Explorer',2013,'Black',18995.00),(6,'Aveo',2013,'Red',7995.00),(6,'HHR',2011,'Black',10995.00),
(6,'Avalanche',2015,'Orange',13995.00),(6,'Cobalt',2007,'White',9995.00),(6,'Malibu',2001,'Gold',4995.00),
(6,'Impala',2012,'White',12495.00),(3,'F150',2012,'Red',18795.00),(3,'F150',2012,'White',19995.00),(6,'Cobalt',2011,'Yellow',8495.00),
(6,'Aveo',2016,'Orange',6495.00),(2,'Civic',2013,'Red',11795.00),(2,'Civic',2010,'White',12295.00);