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


CREATE TABLE tb_evento_psc_segunda(
  cod_evento SERIAL PRIMARY KEY,
  nome VARCHAR(200) NOT NULL,
  descricao VARCHAR(1000) NOT NULL,
  data_inicio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  data_termino TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
SELECT * FROM tb_evento_psc_segunda;

SELECT * FROM tb_usuario_psc_segunda;