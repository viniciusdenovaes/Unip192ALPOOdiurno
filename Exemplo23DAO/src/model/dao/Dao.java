package model.dao;

import java.util.List;

import model.Aluno;
import model.Cadastro;
import model.Curso;

public interface Dao {
	
	List<Curso> buscaCurso(String nome);
	List<Cadastro> buscaAlunoPorNome(String nome);
	boolean addCurso(String nome);
	boolean addAluno(Aluno aluno);
	boolean addCursoEmCadastro(String raAluno, Curso curso);

}
