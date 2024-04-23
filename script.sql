CREATE TABLE tb_usuario_psc_segunda(
	cod_usuario SERIAL PRIMARY KEY,
	login VARCHAR(200),
	senha VARCHAR(200),
	tipo_usuario INT
);

DROP TABLE tb_usuario_psc_segunda;

INSERT INTO tb_usuario_psc_segunda 
(login, senha, tipo_usuario)
VALUES ('admin', 'admin', 1);

SELECT * FROM tb_usuario_psc_segunda;
Create table tb_evento_psc_segunda(
	cod_evento SERIAL PRIMARY KEY,
	nome VARCHAR (200) not null,
	descricao VARCHAR(1000) not null,
	data_inicio TIMESTAMP DEFAULT Current_timestamp,
	data_termino TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
	
);

SELECT * FROM tb_evento_psc_segunda;