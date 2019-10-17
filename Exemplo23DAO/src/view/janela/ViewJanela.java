package view.janela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Cadastro;
import model.Curso;
import view.View;

public class ViewJanela extends JFrame implements View {
	
	JButton botaoBuscarAluno = new JButton("Buscar Aluno");
	JButton botaoAddAluno = new JButton("Adicionar Aluno");
	JTextField fieldNomeAluno = new JTextField(5);
	JTextField fieldRaAluno = new JTextField(5);
	DefaultTableModel dtmAlunos;
	
	
	JButton botaoBuscarCurso = new JButton("Buscar Curso");
	JButton botaoAddCurso = new JButton("Adicionar Curso");
	JTextField fieldNomeCurso = new JTextField(5);
	DefaultTableModel dtmCursos;
	
	JButton botaoCadastraCurso = new JButton("Cadastar Curso");
//	String getRaCadastro();
//	String getCursoCadastro();
	
	JButton botaoMostrarAluno = new JButton("Mostrar Aluno");
	
	
	public ViewJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		
		JPanel panelTabelas = new JPanel();
		add(panelTabelas, BorderLayout.CENTER);
		panelTabelas.setLayout(
				new BoxLayout(panelTabelas, BoxLayout.LINE_AXIS));
		
		
		JPanel panelAlunos = new JPanel();
		panelTabelas.add(panelAlunos);
		panelAlunos.setLayout(
				new BoxLayout(panelAlunos, BoxLayout.PAGE_AXIS));
		Object[][] dataAlunos = new Object[0][2];
		Object[] colNamesAlunos = {"ra", "nome"};
		dtmAlunos = new DefaultTableModel(dataAlunos, colNamesAlunos);
		JTable tabelaAlunos = new JTable(dtmAlunos);
		JScrollPane panelTabelaAlunos = new JScrollPane(tabelaAlunos);
		panelAlunos.add(panelTabelaAlunos);
		JPanel panelControleAlunos = new JPanel();
		panelAlunos.add(panelControleAlunos);
		panelControleAlunos.setLayout(new GridLayout(2, 3, 5, 5));
		panelControleAlunos.add(new JLabel("ra"));
		panelControleAlunos.add(fieldRaAluno);
		panelControleAlunos.add(botaoBuscarAluno);
		panelControleAlunos.add(new JLabel("nome"));
		panelControleAlunos.add(fieldNomeAluno);
		panelControleAlunos.add(botaoAddAluno);
		
		JPanel panelCursos = new JPanel();
		panelTabelas.add(panelCursos);
		panelCursos.setLayout(
				new BoxLayout(panelCursos, BoxLayout.PAGE_AXIS));
		Object[][] dataCursos = new Object[0][1];
		Object[] colNamesCursos = {"nome"};
		dtmCursos = new DefaultTableModel(dataCursos, colNamesCursos);
		JTable tabelaCursos = new JTable(dtmCursos);
		JScrollPane panelTabelaCursos = new JScrollPane(tabelaCursos);
		panelCursos.add(panelTabelaCursos);
		JPanel panelControleCursos = new JPanel();
		panelCursos.add(panelControleCursos);
		panelControleCursos.setLayout(new GridLayout(2, 3, 5, 5));
		panelControleCursos.add(new JLabel("nome"));
		panelControleCursos.add(fieldNomeCurso);
		panelControleCursos.add(botaoBuscarCurso);
		panelControleCursos.add(new JLabel(" "));
		panelControleCursos.add(new JLabel(" "));
		panelControleCursos.add(botaoAddCurso);
		
		
		
		JPanel panelBotaoCadastros = new JPanel();
		add(panelBotaoCadastros, BorderLayout.PAGE_END);
		panelBotaoCadastros.setLayout(
				new FlowLayout(FlowLayout.TRAILING, 10, 10));
		panelBotaoCadastros.add(botaoMostrarAluno);
		panelBotaoCadastros.add(botaoCadastraCurso);
		
		
		setVisible(true);
		pack();
	}

	@Override
	public void addComportamentoBuscaAlunos(ActionListener al) {
		botaoBuscarAluno.addActionListener(al);
	}

	@Override
	public void addComportamentoAddAluno(ActionListener al) {
		botaoAddAluno.addActionListener(al);
	}

	@Override
	public String getNomeAluno() {
		return fieldNomeAluno.getText();
	}

	@Override
	public String getRaAluno() {
		return fieldRaAluno.getText();
	}

	@Override
	public void mostrarAlunos(List<Cadastro> alunos) {
		dtmAlunos.setNumRows(0);
		for(Cadastro cadastro : alunos) {
			Object[] data = new Object[3];
			data[0] = cadastro.getAluno().getRa();
			data[1] = cadastro.getAluno().getNome();
			String cursos = "";
			for(Curso curso : cadastro.getCursos()) {
				cursos += curso.getNome() + "; ";
			}
			data[2] = cursos;
			dtmAlunos.addRow(data);
		}
	}

	@Override
	public void addComportamentoAddCurso(ActionListener al) {
		botaoAddCurso.addActionListener(al);
	}

	@Override
	public void addComportamentoBuscaCurso(ActionListener al) {
		botaoBuscarCurso.addActionListener(al);
	}

	@Override
	public String getNomeCurso() {
		return fieldNomeCurso.getText();
	}

	@Override
	public void mostrarCursos(List<Curso> cursos) {
		dtmCursos.setNumRows(0);
		for(Curso curso : cursos) {
			Object[] data = new Object[1];
			data[0] = curso.getNome();
			dtmCursos.addRow(data);
		}
	}

	@Override
	public void addComportamentoCadastrarCurso(ActionListener al) {
		botaoCadastraCurso.addActionListener(al);
	}

	@Override
	public String getRaCadastro() {
		return null;
	}

	@Override
	public String getCursoCadastro() {
		// TODO Auto-generated method stub
		return null;
	}
}
