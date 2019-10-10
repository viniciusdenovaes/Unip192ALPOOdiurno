package view.janela;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import model.Aluno;
import view.View;

public class ViewJanela extends JFrame implements View{
	
	JTextField fieldNome = new JTextField(50);
	JTextField fieldRa   = new JTextField(50);
	JButton botaoBusca = new JButton("Buscar");
	
	public ViewJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		setVisible(true);
		pack();
	}

	@Override
	public void exibirAlunos(List<Aluno> alunos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBuscaNomeAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComportamentoBusca(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirResultadoAdicionar(boolean resultado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluno getAdicionaAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComportamentoAdiciona(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

}
