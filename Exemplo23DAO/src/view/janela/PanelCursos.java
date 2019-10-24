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

public class PanelCursos extends JPanel {

	JButton botaoBuscar = new JButton("Buscar Curso");
	JButton botaoAdd = new JButton("Adicionar Curso");
	JTextField fieldNome = new JTextField(5);
	DefaultTableModel dtm;
	JTable tabela;
	
	
	public PanelCursos() {
		setLayout(
				new BoxLayout(this, BoxLayout.PAGE_AXIS));
		Object[][] data = new Object[0][1];
		Object[] colNames = {"nome"};
		dtm = new DefaultTableModel(data, colNames);
		tabela = new JTable(dtm);
		JScrollPane panelTabela = new JScrollPane(tabela);
		add(panelTabela);
		JPanel panelControle = new JPanel();
		add(panelControle);
		panelControle.setLayout(new GridLayout(2, 3, 5, 5));
		panelControle.add(new JLabel("nome"));
		panelControle.add(fieldNome);
		panelControle.add(botaoBuscar);
		panelControle.add(new JLabel(" "));
		panelControle.add(new JLabel(" "));
		panelControle.add(botaoAdd);
	}
	
	
	
	public DefaultTableModel getDtm() {
		return dtm;
	}



	public JTable getTabela() {
		return tabela;
	}



	public void addComportamentoAdd(ActionListener al) {
		botaoAdd.addActionListener(al);
	}

	public void addComportamentoBusca(ActionListener al) {
		botaoBuscar.addActionListener(al);
	}

	public String getNome() {
		return fieldNome.getText();
	}

	public void mostrar(List<Curso> cursos) {
		dtm.setNumRows(0);
		for(Curso curso : cursos) {
			Object[] data = new Object[1];
			data[0] = curso.getNome();
			dtm.addRow(data);
		}
	}

	
	
}


