import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller {
	
	DAOPostgree dao;
	Janela janela;
	
	public Controller() {
		
		dao = new DAOPostgree();
		janela = new Janela();
		
		janela.adicionaComportamentoBusca(new ComportamentoBuscar());
		
		janela.adicionaComportamentoAdd(new ComportamentoAdiciona());
	}
	
	class ComportamentoBuscar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String nome = janela.getBusca();
			
			List<Aluno> alunos = dao.buscaAlunos(nome);
			
			if(alunos.isEmpty())
				janela.mostrarErroNaoExisteAluno();
			else
				janela.printAlunos(alunos);
			
		}
		
	}
	
	class ComportamentoAdiciona implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String ra = janela.getAddRa();
			String nome = janela.getAddNome();
			
			boolean resultado = dao.incluiAluno(ra, nome);
			
			janela.printResultadoAdd(resultado);
		}
		
	}
	

}
