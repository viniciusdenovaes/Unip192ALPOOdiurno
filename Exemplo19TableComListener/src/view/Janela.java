package view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Aluno;

public class Janela extends JFrame{
	
	TextField fieldBusca = new TextField(50);
	JButton botaoBusca = new JButton("Buscar");
	
	TextField fieldAddRA = new TextField(50);
	TextField fieldAddNome = new TextField(50);
	JButton botaoAdd = new JButton("Adicionar");
	
	DefaultTableModel dtm;
	JTable tabela;
	JScrollPane scrollPane;
	JButton botaoMostrar = new JButton("Mostrar");

	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout(10, 10));
		
		JPanel panelBusca = new JPanel();
		panelBusca.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panelBusca.add(fieldBusca);
		panelBusca.add(botaoBusca);
		add(panelBusca, BorderLayout.PAGE_START);
		
		JPanel panelTabela = new JPanel();
		panelTabela.setLayout(new BorderLayout(5, 5));
		Object[][] data = new Object[0][2];
		Object[] colNames = {"ra", "nome"};
		dtm = new DefaultTableModel(data, colNames);
		
		tabela = new JTable(dtm) {
		@Override
		public boolean isCellEditable(int row, int col){
			return false;
		}
	};
	
		scrollPane = new JScrollPane(tabela);
		panelTabela.add(scrollPane, BorderLayout.CENTER);
		JPanel panelBotaoMostrar = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		panelBotaoMostrar.add(botaoMostrar);
		panelTabela.add(panelBotaoMostrar, BorderLayout.PAGE_END);
		add(panelTabela, BorderLayout.CENTER);
		
		JPanel panelAdiciona = new JPanel();
		panelAdiciona.setLayout(new GridLayout(3, 1, 10, 10));
		panelAdiciona.add(fieldAddRA);
		panelAdiciona.add(fieldAddNome);
		panelAdiciona.add(botaoAdd);
		add(panelAdiciona, BorderLayout.PAGE_END);
		
		
		
		pack();
	}
	
	public String getBusca() {
		return fieldBusca.getText();
	}
	
	public void mostrarErroNaoExisteAluno() {
		System.out.println("Não existe aluno");
	}
	
	public void printAlunos(List<Aluno> alunos) {
		dtm.setRowCount(0);
		for(Aluno aluno : alunos) {
			Object[] rowData = new Object[2];
			rowData[0] = aluno.getRa();
			rowData[1] = aluno.getNome();
			dtm.addRow(rowData);
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
	
	public Aluno getAlunoSelecionado() {
		int linhaSelecionada = tabela.getSelectedRow();
		String ra = (String) dtm.getValueAt(linhaSelecionada, 0);
		String nome = (String) dtm.getValueAt(linhaSelecionada, 1);
		Aluno aluno = new Aluno(ra, nome);
		return aluno;
	}
	
	public void mostrarAlunoSelecionado(Aluno aluno) {
		System.out.println("\nAluno Selecionado:");
		System.out.println(aluno + "\n");
	}
	
	public void adicionaComportamentoMostrar(ActionListener al) {
		botaoMostrar.addActionListener(al);
	}
	
	public void adicionaComportamentoMostrarComMouse(MouseListener ml) {
		tabela.addMouseListener(ml);
	}
	

}
