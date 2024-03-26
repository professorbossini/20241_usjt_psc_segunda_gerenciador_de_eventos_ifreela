create table tb_usuario(
	cod_usuarios serial primary key,
	login varchar(200),
	senha varchar (200),
	tipo_usuario int
); 
drop table tb_usuario;
insert into tb_usuario (login, senha, tipo_usuario) values ('admin', 'admin', 1 ); 
select * from tb_usuario; 