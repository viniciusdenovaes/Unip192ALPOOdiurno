package model.dao;

import java.util.List;

import model.Aluno;

public interface Dao {
	
	public List<Aluno> buscaAluno(String nome);
	
	public boolean adicionaAluno(Aluno aluno);

}
