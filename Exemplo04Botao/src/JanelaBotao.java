import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaBotao extends JFrame {
	
	public JanelaBotao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setPreferredSize(new Dimension(400, 200));
		panel.setBackground(Color.YELLOW);
		add(panel);
		
		JButton botao = new JButton("Botao");
		botao.setPreferredSize(new Dimension(150,50));
		add(botao);
		
		JButton botao2 = new JButton("Botao 2");
		panel.add(botao2);
		
		pack();
		
	}
	
	

}
