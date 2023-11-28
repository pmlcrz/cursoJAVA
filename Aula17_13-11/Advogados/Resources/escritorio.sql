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








update

DROP DATABASE IF EXISTS escritorio;
CREATE DATABASE escritorio CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci; 
USE escritorio;

--
-- Estrutura para tabela `advogado`
--

CREATE TABLE `advogado` (
  `idadv` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `dataadv` timestamp NOT NULL DEFAULT current_timestamp(),
  `oab` varchar(15) UNIQUE KEY NOT NULL,
  `nome` varchar(127) NOT NULL,
  `telefone` varchar(31) NOT NULL,
  `statusadv` enum('on','off') DEFAULT 'on'
);

--
-- Despejando dados para a tabela `advogado`
--

INSERT INTO `advogado` (`idadv`, `dataadv`, `oab`, `nome`, `telefone`, `statusadv`) VALUES
(1, '2023-11-27 16:13:16', '9y4y043y7t', 'Joca da Silva', '(21) 9876-54321', 'on'),
(2, '2023-11-27 16:13:16', 'oab2', 'Setembrino Trocatapas', '(21) 99887-7665', 'on'),
(3, '2023-11-27 16:13:16', 'oab3', 'Marineuza Siriliano', '(21) 98999-8877', 'on');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `datacliente` timestamp NOT NULL DEFAULT current_timestamp(),
  `nome` varchar(127) NOT NULL,
  `telefone` varchar(31) NOT NULL,
  `statuscliente` enum('on','off') DEFAULT 'on'
);

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`idcliente`, `datacliente`, `nome`, `telefone`, `statuscliente`) VALUES
(1, '2023-11-27 16:13:16', 'Maria', '(21) 99889-9889', 'on'),
(2, '2023-11-27 16:13:16', 'João', '(21) 99998-8887', 'on'),
(3, '2023-11-27 16:13:16', 'Edicleuza', '(21) 89998-8899', 'on'),
(4, '2023-11-27 16:57:27', 'Mariaazinha', '(21) 99889-9889', 'on');










