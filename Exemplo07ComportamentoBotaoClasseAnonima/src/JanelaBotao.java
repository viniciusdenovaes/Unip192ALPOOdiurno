import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaBotao extends JFrame {
	
	public JanelaBotao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton botao = new JButton("Botao");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botao Clicado, Classe Anonima");
			}
		});
		add(botao);
		
		pack();
	}

}
