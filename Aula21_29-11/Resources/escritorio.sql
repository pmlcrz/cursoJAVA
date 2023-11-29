DROP DATABASE IF EXISTS escritorio;

-- Criar o banco de dados.

CREATE DATABASE escritorio CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- Selecionar o banco de dados
USE escritorio;

-- criar tabela advogado.
CREATE TABLE advogado (
idadv INT PRIMARY KEY AUTO_INCREMENT,
dataadv TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
oab VARCHAR(15) UNIQUE NOT NULL,
nome VARCHAR(127) NOT NULL,
telefone VARCHAR(31) NOT NULL,
email VARCHAR(60) NOT NULL,
statusadv ENUM("on", "off") DEFAULT "on"
);


-- criar tabela cliente
CREATE TABLE cliente (
idcliente INT PRIMARY KEY AUTO_INCREMENT,
datacliente TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
nome VARCHAR(127) NOT NULL,
telefone VARCHAR(31) NOT NULL,
statuscliente ENUM("on", "off") DEFAULT "on"
);

-- Inserir alduns dados "fakes" de advogados para testes.
INSERT INTO advogado(oab, nome, telefone, email) VALUES 
('RJ123456','Fulana da Silva','(21)987654321','fulana@email.com'),
('RJ010203','Beltrana Souza','(21)987654000','beltrana@email.com'),
('RJ900654','Cicrana Santos','(21)987654321','cicrana@email.com');

-- Inserir alduns dados "fakes" de clientes para testes.

INSERT INTO cliente(nome, telefone) VALUES 
('Fulana da Silva','(21)1234567'),
('Cicrana Santos','(21)14723687');



SELECT * FROM advogado;

SELECT * FROM cliente;



















