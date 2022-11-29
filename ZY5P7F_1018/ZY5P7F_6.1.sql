CREATE DATABASE AQYO8L_adatbazis1;
USE AQYO8L_adatbazis1;
CREATE TABLE Gyarto (adoszam INT, nev CHAR(30), telephely varchar(255), PRIMARY KEY (adoszam));
CREATE TABLE Termek (tkod int, nev char(50), ear int CHECK(ear > 0), gyarto int, PRIMARY KEY (tkod),  FOREIGN KEY (gyarto) REFERENCES Gyarto(adoszam));