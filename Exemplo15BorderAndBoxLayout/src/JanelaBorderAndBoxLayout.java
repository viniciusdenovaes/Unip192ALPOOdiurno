import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaBorderAndBoxLayout extends JFrame {
	
	public JanelaBorderAndBoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		add(new PanelTextArea(), BorderLayout.CENTER);
		add(new PanelButtons(), BorderLayout.PAGE_END);
		
		
		pack();
	}

}
