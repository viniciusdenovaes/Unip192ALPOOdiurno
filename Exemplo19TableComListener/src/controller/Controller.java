package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import model.Aluno;
import model.DAOPostgree;
import view.Janela;

public class Controller {
	
	DAOPostgree dao;
	Janela janela;
	
	public Controller() {
		
		dao = new DAOPostgree();
		janela = new Janela();
		
		janela.adicionaComportamentoBusca(new ComportamentoBuscar());
		
		janela.adicionaComportamentoAdd(new ComportamentoAdiciona());
		
		janela.adicionaComportamentoMostrar(new ComportamentoMostrar());
		
		janela.adicionaComportamentoMostrarComMouse(new ComportamentoMostrar());
	}
	
	class ComportamentoBuscar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String nome = janela.getBusca();
			
			List<Aluno> alunos = DAOPostgree.buscaAlunos(nome);
			
			if(alunos.isEmpty())
				janela.mostrarErroNaoExisteAluno();
			else
				janela.printAlunos(alunos);
			
		}
		
	}
	
	class ComportamentoAdiciona implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String ra = janela.getAddRa();
			String nome = janela.getAddNome();
			
			boolean resultado = DAOPostgree.incluiAluno(ra, nome);
			
			janela.printResultadoAdd(resultado);
		}
		
	}
	
	class ComportamentoMostrar implements ActionListener, MouseListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Aluno aluno = janela.getAlunoSelecionado();
			janela.mostrarAlunoSelecionado(aluno);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				Aluno aluno = janela.getAlunoSelecionado();
				janela.mostrarAlunoSelecionado(aluno);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

}
