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