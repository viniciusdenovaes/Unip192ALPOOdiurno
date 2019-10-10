package view;

import java.awt.event.ActionListener;
import java.util.List;

import model.Aluno;

public interface View {
	
	public void prepare();
	
	public void init();
	
	// buscar aluno
	public void exibirAlunos(List<Aluno> alunos);
	public String getBuscaNomeAluno();
	public void addComportamentoBusca(ActionListener al);
	
	// adicionar aluno
	public void exibirResultadoAdicionar(boolean resultado);
	public Aluno getAdicionaAluno();
	public void addComportamentoAdiciona(ActionListener al);

}
