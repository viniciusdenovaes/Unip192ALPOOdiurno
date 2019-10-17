-- Database: "Faculdade_v2"

-- DROP DATABASE "Faculdade_v2";

CREATE DATABASE "Faculdade_v2"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.UTF-8'
       LC_CTYPE = 'en_US.UTF-8'
       CONNECTION LIMIT = -1;


CREATE TABLE alunos (
	ra VARCHAR(50) NOT NULL, 
	nome VARCHAR(50) NOT NULL,
	PRIMARY KEY(ra)
)

CREATE TABLE cursos (
	nome VARCHAR(50) NOT NULL, 
	PRIMARY KEY(nome)
)

CREATE TABLE alunos_cursos (
	nome_curso VARCHAR(50) REFERENCES cursos(nome), 
	ra VARCHAR(50) REFERENCES alunos(ra), 
	PRIMARY KEY(nome_curso, ra)
)



DROP TABLE alunos
DROP TABLE alunos_cursos
DROP TABLE cursos





