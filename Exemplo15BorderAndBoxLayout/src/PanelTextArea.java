import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelTextArea extends JPanel {
	
	public PanelTextArea() {
		setBackground(Color.GREEN);
		
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		panel.add(new JLabel("label"));
		add(panel);
		add(new JTextArea(20, 20));
	}

}
