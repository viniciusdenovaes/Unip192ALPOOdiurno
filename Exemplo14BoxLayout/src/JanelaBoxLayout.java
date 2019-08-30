import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaBoxLayout extends JFrame {
	
	public JanelaBoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panel = new JPanel();
		add(panel);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		panel.add(new JButton("1"));
		panel.add(new JButton("botao 2"));
		panel.add(new JButton("botao com texto 3"));
		panel.add(new JButton("4"));
		
		pack();
	}

}
