package model;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	Aluno aluno;
	List<Curso> cursos;
	public Cadastro(Aluno aluno) {
		this.aluno = aluno;
		this.cursos = new ArrayList<>();
	}
	public Aluno getAluno() {
		return aluno;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void addCurso(Curso curso) {
		this.cursos.add(curso);
	}
	@Override
	public String toString() {
		return aluno.getRa();
	}
	
	
	
	
	

}
