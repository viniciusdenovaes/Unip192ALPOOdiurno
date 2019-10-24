package view.janela;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Cadastro;
import model.Curso;

public class PanelAlunos extends JPanel {

	JButton botaoBuscar = new JButton("Buscar Aluno");
	JButton botaoAdd = new JButton("Adicionar Aluno");
	JTextField fieldNome = new JTextField(5);
	JTextField fieldRa = new JTextField(5);
	DefaultTableModel dtm;
	JTable tabela;
	
	public PanelAlunos() {
		setLayout(
				new BoxLayout(this, BoxLayout.PAGE_AXIS));
		Object[][] dataAlunos = new Object[0][2];
		Object[] colNamesAlunos = {"ra", "nome"};
		dtm = new DefaultTableModel(dataAlunos, colNamesAlunos);
		tabela = new JTable(dtm);
		JScrollPane panelTabelaAlunos = new JScrollPane(tabela);
		this.add(panelTabelaAlunos);
		JPanel panelControle = new JPanel();
		this.add(panelControle);
		panelControle.setLayout(new GridLayout(2, 3, 5, 5));
		panelControle.add(new JLabel("ra"));
		panelControle.add(fieldRa);
		panelControle.add(botaoBuscar);
		panelControle.add(new JLabel("nome"));
		panelControle.add(fieldNome);
		panelControle.add(botaoAdd);
	}
	
	
	
	
	public DefaultTableModel getDtm() {
		return dtm;
	}




	public JTable getTabela() {
		return tabela;
	}




	public void addComportamentoBusca(ActionListener al) {
		botaoBuscar.addActionListener(al);
	}

	public void addComportamentoAdd(ActionListener al) {
		botaoAdd.addActionListener(al);
	}

	public String getNome() {
		return fieldNome.getText();
	}

	public String getRa() {
		return fieldRa.getText();
	}

	public void mostrar(List<Cadastro> alunos) {
		dtm.setNumRows(0);
		for(Cadastro cadastro : alunos) {
			Object[] data = new Object[2];
			data[0] = cadastro;
			data[1] = cadastro.getAluno().getNome();
			dtm.addRow(data);
		}
	}

	
	
}


