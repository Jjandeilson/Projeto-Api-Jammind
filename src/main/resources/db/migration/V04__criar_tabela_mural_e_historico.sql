CREATE TABLE mural(
	id_mural INT NOT NULL,
   	nome_mural VARCHAR(50) NOT NULL,
    titulo_mural VARCHAR(50) NOT NULL,
    fk_id_tema INT NOT NULL,
    PRIMARY KEY(id_mural),
    FOREIGN KEY(fk_id_tema) REFERENCES tema(id_tema)
);

INSERT INTO mural (id_mural,nome_mural,titulo_mural,fk_id_tema) VALUES (1,'Reino animal','Nos fale sobre:',1);
INSERT INTO mural (id_mural,nome_mural,titulo_mural,fk_id_tema) VALUES (2,'Arte','Nos nos fale:',2);
INSERT INTO mural (id_mural,nome_mural,titulo_mural,fk_id_tema) VALUES (3,'Disparidades Sociais','Nos fale sobre:',3);
INSERT INTO mural (id_mural,nome_mural,titulo_mural,fk_id_tema) VALUES (4,'Gênero','Nos fale sobre:',4);
INSERT INTO mural (id_mural,nome_mural,titulo_mural,fk_id_tema) VALUES (5,'Sustentabilidade','Nos fale sobre:',5);

CREATE TABLE historico(
	id_historico INT AUTO_INCREMENT,
    data_conclusao date,
    concluido boolean DEFAULT true,
	fk_id_tarefa INT NOT NULL,
	fk_id_aluno INT NOT NULL,
	PRIMARY KEY(id_historico),
	FOREIGN KEY(fk_id_tarefa) REFERENCES tarefa(id_tarefa),
	FOREIGN KEY(fk_id_aluno) REFERENCES usuario(id_usuario)
);

CREATE TABLE aluno_mural(
	id_aluno_mural INT AUTO_INCREMENT,
    fk_id_usuario INT NOT NULL,
    fk_id_mural INT NOT NULL,
    texto_aluno TEXT NOT NULL,
    PRIMARY KEY(id_aluno_mural),
    FOREIGN KEY(fk_id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY(fk_id_mural) REFERENCES mural(id_mural)
);