CREATE DATABASE AQYO8L_adatbazis2;
USE AQYO8L_adatbazis2;
CREATE TABLE Gyarto (adoszam INT, nev CHAR(30), telephely char(255), irsz char(4), varos char(4), utca char(100), PRIMARY KEY (adoszam));
CREATE TABLE Termek (tkod int, nev char(50), ear int CHECK(ear > 0), gyarto int, PRIMARY KEY (tkod),  FOREIGN KEY (gyarto) REFERENCES Gyarto(adoszam));
CREATE TABLE Egysegek (aru int, db int CHECK(db > 0), FOREIGN KEY (aru) REFERENCES Termek(tkod));
CREATE TABLE Alkatresz (akod int, nev char(50), PRIMARY KEY (akod));
CREATE TABLE Komponens (termek int REFERENCES Termek(tkod), alkatresz int REFERENCES Alkatresz(akod));
