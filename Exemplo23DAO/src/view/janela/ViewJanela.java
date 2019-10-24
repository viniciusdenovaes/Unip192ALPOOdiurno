package view.janela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	
	PanelAlunos panelAlunos;
	PanelCursos panelCursos;
	PanelMostrarCadastro panelMostrarCadastro;
	
	JButton botaoCadastraCurso = new JButton("Cadastar Curso");
	
	public ViewJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		
		JPanel panelTabelas = new JPanel();
		add(panelTabelas, BorderLayout.CENTER);
		panelTabelas.setLayout(
				new BoxLayout(panelTabelas, BoxLayout.LINE_AXIS));
		
		
		panelAlunos = new PanelAlunos();
		panelTabelas.add(panelAlunos);
		panelAlunos.getTabela().addMouseListener(new ComportamentoMostrarCadastro());
		
		panelCursos = new PanelCursos();
		panelTabelas.add(panelCursos);
		
		panelMostrarCadastro = new PanelMostrarCadastro();
		panelTabelas.add(panelMostrarCadastro);
		
		JPanel panelBotaoCadastros = new JPanel();
		add(panelBotaoCadastros, BorderLayout.PAGE_END);
		panelBotaoCadastros.setLayout(
				new FlowLayout(FlowLayout.TRAILING, 10, 10));
		panelBotaoCadastros.add(botaoCadastraCurso);
		
		
		setVisible(true);
		pack();
	}

	@Override
	public void addComportamentoBuscaAlunos(ActionListener al) {
		panelAlunos.addComportamentoBusca(al);
	}

	@Override
	public void addComportamentoAddAluno(ActionListener al) {
		panelAlunos.addComportamentoAdd(al);
	}

	@Override
	public String getNomeAluno() {
		return panelAlunos.getNome();
	}

	@Override
	public String getRaAluno() {
		return panelAlunos.getRa();
	}

	@Override
	public void mostrarAlunos(List<Cadastro> alunos) {
		panelAlunos.mostrar(alunos);
	}

	@Override
	public void addComportamentoAddCurso(ActionListener al) {
		panelCursos.addComportamentoAdd(al);
	}

	@Override
	public void addComportamentoBuscaCurso(ActionListener al) {
		panelCursos.addComportamentoBusca(al);
	}

	@Override
	public String getNomeCurso() {
		return panelCursos.getNome();
	}

	@Override
	public void mostrarCursos(List<Curso> cursos) {
		panelCursos.mostrar(cursos);
	}

	@Override
	public void addComportamentoCadastrarCurso(ActionListener al) {
		botaoCadastraCurso.addActionListener(al);
	}

	@Override
	public String getRaCadastro() {
		JTable tabela = panelAlunos.getTabela();
		int linha = tabela.getSelectedRow();
		DefaultTableModel dtm = panelAlunos.getDtm();
		return dtm.getValueAt(linha, 0).toString();
		
	}

	@Override
	public String getCursoCadastro() {
		JTable tabela = panelCursos.getTabela();
		int linha = tabela.getSelectedRow();
		DefaultTableModel dtm = panelCursos.getDtm();
		return dtm.getValueAt(linha, 0).toString();
	}
	
	class ComportamentoMostrarCadastro 
	implements MouseListener {
		
		public void acao() {
			JTable tabela = panelAlunos.getTabela();
			int linha = tabela.getSelectedRow();
			DefaultTableModel dtm = panelAlunos.getDtm();
			Cadastro cadastro = (Cadastro)dtm.getValueAt(linha, 0);
			panelMostrarCadastro.atualizaCadastro(cadastro);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			acao();
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
