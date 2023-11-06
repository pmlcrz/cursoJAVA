create database escritorio;

use escritorio;

create table Cliente(

idcliente integer primary key auto_increment,

nome varchar(60) not null,

telefone varchar(14) not null

);