package view.janela;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Cadastro;
import model.Curso;

public class PanelMostrarCadastro extends JPanel {
	
	JLabel raValue = new JLabel(" ");
	JLabel nomeValue = new JLabel(" ");
	DefaultTableModel dtm;
	
	static final Font font = new Font("sans serif", Font.BOLD, 23);
	
	public PanelMostrarCadastro() {
		setLayout(new BorderLayout(5, 5));
		
		JPanel alunosDados = new JPanel();
		alunosDados.setLayout(
				new BoxLayout(alunosDados, BoxLayout.PAGE_AXIS));
		
		JPanel panelRa = new JPanel();
		JLabel raLabel = new JLabel("RA: ");
		raLabel.setFont(font);
		raValue.setFont(font);
		panelRa.add(raLabel);
		panelRa.add(raValue);
		alunosDados.add(panelRa);
		
		JPanel panelNome = new JPanel();
		JLabel nomeLabel = new JLabel("Nome: ");
		nomeLabel.setFont(font);
		nomeValue.setFont(font);
		panelRa.add(nomeLabel);
		panelRa.add(nomeValue);
		alunosDados.add(panelNome);
		
		add(alunosDados, BorderLayout.PAGE_START);
		
		Object[][] dados = new Object[0][1];
		Object[] colsNames = {"Cursos"};
		dtm = new DefaultTableModel(dados, colsNames);
		JTable tabela = new JTable(dtm);
		JScrollPane panelTabela = new JScrollPane(tabela);
		
		add(panelTabela, BorderLayout.CENTER);
		
	}
	
	public void atualizaCadastro(Cadastro cadastro) {
		raValue.setText(cadastro.getAluno().getRa());
		nomeValue.setText(cadastro.getAluno().getNome());
		dtm.setNumRows(0);
		for(Curso curso : cadastro.getCursos()) {
			Object data[] = {curso.getNome()};
			dtm.addRow(data);
		}
	}
	
	

}





