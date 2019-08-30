import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaFlowLayout extends JFrame {
	
	public JanelaFlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		add(new Panel(FlowLayout.LEADING, Color.PINK), BorderLayout.PAGE_START);
		add(new Panel(FlowLayout.CENTER, Color.BLUE), BorderLayout.CENTER);
		add(new Panel(FlowLayout.TRAILING, Color.GREEN), BorderLayout.PAGE_END);
		
		
		pack();
	}

}
