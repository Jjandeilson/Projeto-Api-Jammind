CREATE TABLE usuario(
	id_usuario INT AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	sobrenome VARCHAR(50) NOT NULL,
	data_nascimento DATE NOT NULL,
	cidade VARCHAR(50) NOT NULL,
	estado VARCHAR(50) NOT NULL,
	email VARCHAR(60) NOT NULL,
	senha VARCHAR(30) NOT NULL,
	tipo_usuario VARCHAR(10) NOT NULL,
	PRIMARY KEY(id_usuario),
	CHECK (tipo_usuario in ('ALUNO','PROFESSOR'))
);