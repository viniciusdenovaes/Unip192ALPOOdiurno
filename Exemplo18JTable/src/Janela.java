import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
	
	TextField fieldBusca = new TextField(50);
	JButton botaoBusca = new JButton("Buscar");
	
	TextField fieldAddRA = new TextField(50);
	TextField fieldAddNome = new TextField(50);
	JButton botaoAdd = new JButton("Adicionar");
	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout(10, 10));
		
		JPanel panelBusca = new JPanel();
		panelBusca.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelBusca.add(fieldBusca);
		panelBusca.add(botaoBusca);
		add(panelBusca, BorderLayout.PAGE_START);
		
		JPanel panelAdiciona = new JPanel();
		panelAdiciona.setLayout(new GridLayout(3, 1, 10, 10));
		panelAdiciona.add(fieldAddRA);
		panelAdiciona.add(fieldAddNome);
		panelAdiciona.add(botaoAdd);
		add(panelAdiciona, BorderLayout.CENTER);
		
		
		
		pack();
	}
	
	public String getBusca() {
		return fieldBusca.getText();
	}
	
	public void mostrarErroNaoExisteAluno() {
		System.out.println("Não existe aluno");
	}
	
	public void printAlunos(List<Aluno> alunos) {
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
	
	public void adicionaComportamentoBusca(ActionListener al) {
		fieldBusca.addActionListener(al);
		botaoBusca.addActionListener(al);
	}
	
	public String getAddRa() {
		return fieldAddRA.getText();
	}
	
	public String getAddNome() {
		return fieldAddNome.getText();
	}
	
	public void printResultadoAdd(boolean resultado) {
		if(resultado)
			System.out.println("Aluno adicionado");
		else
			System.out.println("Aluno nao adicionado");
	}
	
	public void adicionaComportamentoAdd(ActionListener al) {
		botaoAdd.addActionListener(al);
	}
	

}
