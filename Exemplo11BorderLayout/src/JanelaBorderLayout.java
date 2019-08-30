import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaBorderLayout extends JFrame {
	
	public JanelaBorderLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		add(new JButton("CENTER"), BorderLayout.CENTER);
		add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
		add(new JButton("LINE_END"), BorderLayout.LINE_END);
		add(new JButton("LINE_START"), BorderLayout.LINE_START);
		add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
		
		pack();
	}

}
