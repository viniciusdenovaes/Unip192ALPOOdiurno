package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.Aluno;
import model.Cadastro;
import model.Curso;
import model.dao.Dao;
import view.View;

public class Controller {
	
	Dao dao;
	View view;
	
	public Controller(Dao dao, View view) {
		this.dao = dao;
		this.view = view;
	}
	
	class ComportamentoBuscaAluno implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String nome = view.getNomeAluno();
			List<Cadastro> cadastros = dao.buscaAlunoPorNome(nome);
			view.mostrarAlunos(cadastros);
		}
	}
	
	class ComportamentoBuscaCurso implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String nome = view.getNomeCurso();
			List<Curso> cursos = dao.buscaCurso(nome);
			view.mostrarCursos(cursos);
		}
	}
	
	class ComportamentoAddAluno implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String ra = view.getRaAluno();
			String nome = view.getNomeAluno();
			dao.addAluno(new Aluno(ra, nome));
		}
	}
	
	class ComportamentoAddCurso implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String nome = view.getNomeCurso();
			dao.addCurso(nome);
		}
	}
	
	class ComportamentoCadastraCurso implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String ra = view.getRaCadastro();
			String curso = view.getCursoCadastro();
			dao.addCursoEmCadastro(ra,  new Curso(curso));
		}
	}

}
