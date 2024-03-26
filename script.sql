CREATE TABLE tb_usuario(
	cod_usuario SERIAL PRIMARY KEY,
	login VARCHAR(200),
	senha VARCHAR(200),
	tipo_usuario INT 
);

DROP TABLE tb_usuario;

INSERT INTO tb_usuario 
(login, senha, tipo_usuario) 
VALUES ('admin', 'admin', 1);

SELECT * FROM tb_usuario