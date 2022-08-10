USE Cortez;

CREATE TABLE Cliente(

id int(11) NOT NULL AUTO_INCREMENT,
Nome varchar(60) NOT NULL,
NumReserva varchar(100) NOT NULL,
DataEntrada datetime NOT NULL,
DiasPerm int(30) NOT NULL,
Pay double NOT NULL,

PRIMARY KEY(id)


);