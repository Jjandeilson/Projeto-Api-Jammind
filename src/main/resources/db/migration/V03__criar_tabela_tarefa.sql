CREATE TABLE tarefa(
	id_tarefa INT AUTO_INCREMENT,
	nome_tarefa VARCHAR(50) NOT NULL,
	nome_pergunta VARCHAR(300) NOT NULL,
	opcao_a VARCHAR(100) NOT NULL,
	opcao_b VARCHAR(100) NOT NULL,
	opcao_c VARCHAR(100) NOT NULL,
	opcao_d VARCHAR(100) NOT NULL,
	resposta CHAR(1),
	fk_id_tema INT NOT NULL,
	PRIMARY KEY(id_tarefa),
	FOREIGN KEY(fk_id_tema) REFERENCES tema(id_tema)
);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta ,opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Reino Animal I', 'Qual a maior serpente venenosa do mundo?', 'A) Mamba Negra - 3,5m.',
'B) Cobra Tigre do Leste - 2m.','C) Víbora Otomana - 120cm.','D) Cobra Real - 5,5m.','D',1);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Reino Animal II','Qual o peso da Sucuri?',
'A) Cerca de 130kg','B) Cerca de 450kg','C) Cerca de 235kg.', 'D) Cerca de 295kg','B' ,1);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Reino Animal III','Qual a família de serpentes considerada a mais evoluída de todas?',
'A) Viperídeos.','B) Elapídeos.','C) Pitonídeos.','D) Tiflopídeos','A',1);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Reino Animal IV','Para ser considerado um inseto, o animal precisa apresentar algumas características. Entre as características a seguir, qual é a única que não pode ser encontrada em um inseto?',
'A) Um par de olhos compostos.','B) Um par de antenas na cabeça.','C) Corpo dividido em cabeça, tórax e abdome.','D) Presença de seis pares de patas.','D',1);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Reino Animal V', 'Dos organismos a seguir, qual possui metamorfose incompleta?',
'A) Traça','B) Gafanhoto.','C) Joaninha.','D) Borboleta','B',1);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Arte I','Quais são as duas principais obras de Leonardo da Vinci?','A) Mona Lisa e A Última Ceia.','B) Homem Vitruviano e Criação de Adão',
'C) Criação de Adão e Mona Lisa','D) A Última Ceia e Homem Vitruviano','A',2);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Arte II','No barroco brasileiro destaca-se dois artistas. Quem são eles?',
'A) John Dryden e John Milton.','B) Luis de Góngora e Francisco de Quevedo',
'C) Alejadinho e Mestre Valentim.','D) John Donne e Samuel Johnson.','C' ,2);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Arte III','A escultura barroca se destaca por vários aspectos. Assinale o item incorreto sobre a escultura barroca?',
'A) Drapeados.','B) Uso da razão','C) Linha curvas','D) Tons dourados', 'C',2);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Arte IV','A escultura barroca se destaca por vários aspectos. Assinale o item incorreto sobre a escultura barroca?',
'A) Drapeados.','B) Uso da razão.','C) Linha curvas.','D) Tons dourados', 'D',2);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Arte V','Qual pintor barroco foi responsável pela pintura do quadro "Vocação de São Mateus"?','A) El greco.',
'B) Michelangelo.','C) Andrea Pozzo.','D) Picasso.','E' ,2);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema)
VALUES ('Disparidades sociais I', 'É importante doar brinquedos?', 'A) Não, crianças carentes não precisam de brinquedos.', 'B) Não, se a criança não tem brinquedo, ela deve trabalhar para ter um.', 
'C) Sim, é importante ajudar crianças carentes.', 'D) Não, apenas crianças muito pequenas precisam de brinquedos.','C',3);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema)
VALUES ('Disparidades sociais II', 'Algumas crianças trabalham no sinal ou pedem dinheiro na rua, sobre essa prática:', 'A) É correto, não atrapalha o futuro da criança.', 
'B) É errado e devemos denunciar. Lugar de criança é na escola.', 'C) É correto, a criança deve ajudar os pais a sustentar a casa em que mora.', 
'D) É errado, mas não é um problema tão grava.','B',3);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema)
VALUES ('Gênero I', 'Você acredita que existem "coisas que somente meninos podem fazer" e "coisas que somente meninas podem fazer"? Por exemplo: cozinhar, jogar vídeo game.',
 'A) Sim, por exemplo: "futebol é coisa de menino" e "boneca é coisa de menina".', 'B) Não, todos podem fazer as mesmas coisas mesmo com características diferentes.', 
 'C) Apenas no caso de afazeres domésticos as meninas devem continuar fazendo, já os meninos não.', 
'D) Apenas no caso de esportes com bola e luta, os meninos devem continuar fazendo, e as meninas não.', 'B', 4);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema)
VALUES ('Gênero', 'Vôce acredita que existem cores de roupas que somente meninos podem vestir e cores de roupa que somente meninas podem vestir?',
'A) Sim, por exemplo: "Azul é coisa de menino e "rosa é coisa de menina".','B) Não, todos podem vestir as mesmas cores.', 
'C) Sim, a cor rosa combinas mais com meninas.', 'D) Sim, a cor azul combina mais com meninos.','B',4);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Sustentabilidade I','O que é reciclagem?',
'A) “Jogar fora” o lixo produzido.','B) Coletar todo tipo de material existente em lixos recicláveis.',
'C) Nome dado para todo o processo do lixo após seu descarte.','D) Processo de transformação de materiais usados em novos produtos para consumo.',
'D' ,5);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Sustentabilidade II','Como separar corretamente seu lixo?',
'A) Juntar tudo na lixeira, pois os prédios já fazem o trabalho de separação.',
'B) Separar o lixo orgânico dos resíduos sólidos .',
'C) Deixar plásticos sujos junto com lixo orgânico.','D) Juntar todo tipo de lixo e descartar em ponto de coleta.','B' ,5);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Sustentabilidade III','O que é coleta seletiva?',
'A) Processo de separação e recolhimento dos resíduos para o reaproveitamento por meio de reciclagem.',
'B) Destinação de resíduos para lixões e aterros.','C) Processo de envio de todo o lixo produzido para cooperativas ou entrega para catadores de rua.',
'D) A escolha aleatória do melhor lixo produzido.','A' ,5);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Sustentabilidade IV','O que fazer com o lixo eletrônico – pilhas, baterias e equipamentos quebrados?',
'A) Recolher, organizar e armazenar em casa o máximo de tempo que der.','B) Juntar com plásticos e metais.',
'C) Jogar no lixo comum.','D) Procurar locais específicos para seu descarte.','D' ,5);

INSERT INTO TAREFA (nome_tarefa, nome_pergunta, opcao_a, opcao_b, opcao_c, opcao_d, resposta, fk_id_tema) 
values ('Sustentabilidade V','Uma das formas de colaborar com a preservação do meio ambiente é reduzir a produção de resíduos. Mas como?',
'A) Optando pela compra de produtos com embalagens recicláveis.','B) Reutilizando os materiais e objetos sempre que possível.',
'C) Apoiando iniciativas de reciclagem.','D) Todas as anteriores.','D' ,5);

