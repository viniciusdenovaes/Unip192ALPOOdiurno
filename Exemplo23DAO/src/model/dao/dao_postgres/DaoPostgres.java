package model.dao.dao_postgres;

import java.util.List;

import model.Aluno;
import model.Cadastro;
import model.Curso;
import model.dao.Dao;

public class DaoPostgres implements Dao {

	@Override
	public List<Curso> buscaCurso(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cadastro> buscaAlunoPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCurso(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCursoEmCadastro(String raAluno, Curso curso) {
		// TODO Auto-generated method stub
		return false;
	}

}
