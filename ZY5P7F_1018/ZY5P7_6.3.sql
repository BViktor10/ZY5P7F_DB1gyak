CREATE DATABASE AQYO8L_adatbazis3;
USE AQYO8L_adatbazis3;
CREATE TABLE Tanfolyam (tkod int, ar int, tipus varchar(50), megnevezes varchar(50), PRIMARY KEY (tkod));
CREATE TABLE Resztvevo (tajszam int, nev varchar(50), lakcim varchar(125), PRIMARY KEY (tajszam));
CREATE TABLE Tanfolyam_Resztvevo (tkod int REFERENCES Tanfolyam(tkod), tajszam int REFERENCES Resztvevo(tajszam), befizetes int);