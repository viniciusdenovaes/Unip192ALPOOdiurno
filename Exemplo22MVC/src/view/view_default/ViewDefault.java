package view.view_default;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import view.View;

public class ViewDefault implements View {
	
	ActionListener comportamentoBusca;
	ActionListener comportamentoAdicionaAluno;

	@Override
	public void prepare() {
	}

	@Override
	public void init() {
		while(true) {
			System.out.println("Entre com a acao");
			System.out.println("1 para adicionar");
			System.out.println("2 para buscar");
			System.out.println("3 para sair");
			Scanner sc = new Scanner(System.in);
			int acao = sc.nextInt();
			
			switch(acao) {
			case 1: 
				comportamentoAdicionaAluno.actionPerformed(null);
				break;
			case 2: 
				comportamentoBusca.actionPerformed(null);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Acao nao entendida");
			}

		}
	}

	
	// metodos para buscar aluno
	@Override
	public void exibirAlunos(List<Aluno> alunos) {
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

	@Override
	public String getBuscaNomeAluno() {
		String nomeAluno;
		System.out.println("Entre com o nome do aluno");
		Scanner sc = new Scanner(System.in);
		nomeAluno = sc.next();
		return nomeAluno;
	}

	@Override
	public void addComportamentoBusca(ActionListener al) {
		comportamentoBusca = al;
	}

	
	// metodos de adicionar aluno
	@Override
	public void exibirResultadoAdicionar(boolean resultado) {
		if(resultado)
			System.out.println("Aluno adicionado");
		else
			System.out.println("Aluno nao adicionado");
	}

	@Override
	public Aluno getAdicionaAluno() {
		System.out.println("Entre com o ra do aluno");
		Scanner sc = new Scanner(System.in);
		String raAluno = sc.next();

		System.out.println("Entre com o nome do aluno");
		sc = new Scanner(System.in);
		String nomeAluno = sc.next();
		
		return new Aluno(raAluno, nomeAluno);
	}

	@Override
	public void addComportamentoAdiciona(ActionListener al) {
		comportamentoAdicionaAluno = al;
	}

}
