import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaMudaCor extends JFrame {
	
	JPanel panel;
	JButton botao01;
	JButton botao02;
	JButton botao03;
	
	public JanelaMudaCor() {
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.CYAN);
		panel.setPreferredSize(new Dimension(400, 400));
		add(panel);
		
		botao01 = new JButton("Amarelo");
		panel.add(botao01);
		botao01.addActionListener(
				new ComportamentoMudaCor(Color.YELLOW));
		
		botao02 = new JButton("Verde");
		panel.add(botao02);
		botao02.addActionListener(
				new ComportamentoMudaCor(Color.GREEN));
		
		botao03 = new JButton("Rosa");
		panel.add(botao03);
		botao03.addActionListener(
				new ComportamentoMudaCor(Color.PINK));
		
		
		pack();
	}
	
	class ComportamentoMudaCor implements ActionListener {
		
		Color color;
		
		public ComportamentoMudaCor(Color aColor) {
			this.color = aColor;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(this.color);
		}
		
	}
	
	

}



