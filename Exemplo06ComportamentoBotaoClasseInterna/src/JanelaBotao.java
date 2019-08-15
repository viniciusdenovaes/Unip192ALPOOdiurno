import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		panel.setBackground(Color.PINK);
		
		JButton botao = new JButton("Botao");
		botao.addActionListener(new ComportamentoBotao());
		
		panel.add(botao);
		
		add(panel);
		
		pack();
	}
	
	class ComportamentoBotao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Botao clicado");
		}
		
	}
	

}
