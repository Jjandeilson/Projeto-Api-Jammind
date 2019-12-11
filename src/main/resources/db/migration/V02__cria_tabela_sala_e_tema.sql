CREATE TABLE sala(
	id_sala INT AUTO_INCREMENT,
	codigo_sala VARCHAR(20) NOT NULL,
	titulo VARCHAR(30) NOT NULL,
	serie VARCHAR(20) NOT NULL,
	descricao VARCHAR(30) NOT NULL,
	PRIMARY KEY (id_sala)
);

CREATE TABLE sala_usuario(
	fk_id_sala INT NOT NULL,
	fk_id_usuario INT NOT NULL,
	PRIMARY KEY(fk_id_sala,fk_id_usuario),
	FOREIGN KEY(fk_id_sala) REFERENCES sala(id_sala),
	FOREIGN KEY(fk_id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE tema(
	id_tema INT AUTO_INCREMENT PRIMARY KEY,
	nome_tema VARCHAR(20) NOT NULL,
	descricao_tema VARCHAR(100) NOT NULL	
);

INSERT INTO tema(nome_tema,descricao_tema) VALUES ('Reino Animal','Questões que abordam o reino biológico composto por seres vivos.');
INSERT INTO tema(nome_tema,descricao_tema) VALUES ('Arte','Arquitetura, desenho, escultura, pintura, escrita, música, dança, teatro e cinema.');
INSERT INTO tema(nome_tema,descricao_tema) VALUES ('Disparidades Sociais', 'Assuntos que abordam a desigualdade social.');
INSERT INTO tema(nome_tema,descricao_tema) VALUES ('Gênero','Assuntos que abordam conceitos sobre identidade e igualdade de gênero.');
INSERT INTO tema(nome_tema,descricao_tema) VALUES ('Sustentabilidade', 'Ensiando melhorar o mundo.');

CREATE TABLE tema_sala(
	fk_id_tema INT NOT NULL,
	fk_id_sala INT NOT NULL,
	ativo boolean DEFAULT false,
	PRIMARY KEY(fk_id_tema,fk_id_sala),
	FOREIGN KEY(fk_id_tema) REFERENCES tema(id_tema),
	FOREIGN KEY(fk_id_sala) REFERENCES sala(id_sala)
);