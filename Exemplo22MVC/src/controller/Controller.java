package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.Aluno;
import model.dao.Dao;
import view.View;

public class Controller {
	
	View view;
	Dao dao;
	
	public Controller(Dao aDao, View aView) {
		this.view = aView;
		this.dao = aDao;
	}
	
	public void init() {
		view.prepare();
		
		view.addComportamentoBusca(new ComportamentoBuscaAluno());
		view.addComportamentoAdiciona(new ComportamentoAdicionaAluno());
		
		view.init();
	}
	
	class ComportamentoBuscaAluno implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String nome = view.getBuscaNomeAluno();
			List<Aluno> alunos = dao.buscaAluno(nome);
			view.exibirAlunos(alunos);
		}
	}
	
	class ComportamentoAdicionaAluno implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Aluno aluno = view.getAdicionaAluno();
			boolean resultado = dao.adicionaAluno(aluno);
			view.exibirResultadoAdicionar(resultado);
		}
	}
	
	

}
