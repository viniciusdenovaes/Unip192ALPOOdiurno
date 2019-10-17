package view;

import java.awt.event.ActionListener;
import java.util.List;

import model.Cadastro;
import model.Curso;

public interface View {
	
	void addComportamentoBuscaAlunos(ActionListener al);
	void addComportamentoAddAluno(ActionListener al);
	String getNomeAluno();
	String getRaAluno();
	void mostrarAlunos(List<Cadastro> alunos);
	
	void addComportamentoAddCurso(ActionListener al);
	void addComportamentoBuscaCurso(ActionListener al);
	String getNomeCurso();
	void mostrarCursos(List<Curso> cursos);
	
	void addComportamentoCadastrarCurso(ActionListener al);
	String getRaCadastro();
	String getCursoCadastro();
	
	

}
