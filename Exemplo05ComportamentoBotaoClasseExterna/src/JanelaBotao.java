import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaBotao extends JFrame {
	
	public JanelaBotao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton botao = new JButton("Botao");
		botao.addActionListener(new ComportamentoBotao());
		add(botao);
		
		pack();
	}

}
