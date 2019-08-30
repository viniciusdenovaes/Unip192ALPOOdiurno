import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	public Panel(int align, Color color) {
		setBackground(color);
		setLayout(new FlowLayout(align));
		add(new JButton("botao 1"));
		add(new JButton("2"));
		add(new JButton("botao texto grande 3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}

}
