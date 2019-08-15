import javax.swing.JFrame;

public class TestaJanelaClasseAninhada {
	
	public static void main(String[] args) {
		
		new MinhaJanela("Minha Primeira Janela");
		new MinhaJanela("Minha Segunda Janela");
		
	}
	
	static class MinhaJanela extends JFrame {
		public MinhaJanela(String titulo) {
			super(titulo);
			setSize(400, 200);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	}

}
