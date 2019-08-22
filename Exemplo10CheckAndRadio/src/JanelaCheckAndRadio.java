import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaCheckAndRadio extends JFrame {
	
	JPanel panel;
	JTextField textField;
	JLabel label;
	
	public JanelaCheckAndRadio() {
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBackground(Color.CYAN);
		add(panel);
		
		textField = new JTextField(10);
		panel.add(textField);
		textField.addActionListener(new ComportamentoTextField());
		
		label = new JLabel("Escreva no textfield");
		label.setFont(new Font("Sans Seriff", Font.BOLD, 16));
		panel.add(label);
		
		
		pack();
	}
	
	class ComportamentoTextField implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText(textField.getText());
			textField.setText("");
		}
		
	}
	
	

}



