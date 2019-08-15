import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class TestaJanela {
	
	public static void main(String[] args) {
		
		JFrame minhaJanela = new JFrame("Minha Janela");
		
		/*Esta parte extra serve para pegar o tamanho
		 * da tela do monitor*/
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension tamanhoTela = toolkit.getScreenSize();
		int larguraDaTela = (int)tamanhoTela.getWidth();
		int alturaDaTela = (int)tamanhoTela.getHeight();
		minhaJanela.setSize(larguraDaTela/2, alturaDaTela/2);
		
		minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		minhaJanela.setVisible(true);
		
	}

}
