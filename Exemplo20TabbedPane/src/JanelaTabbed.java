import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaTabbed extends JFrame {
	
	public JanelaTabbed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.add("aba 1 azul", new PanelCores(Color.BLUE, "panel 1"));
		tabbedPane.add("aba 2 vermelha", new PanelCores(Color.RED, "panel 2"));
		tabbedPane.add("aba 3 verde", new PanelCores(Color.GREEN, "panel 3"));
		
		
		add(tabbedPane);
		
		pack();
	}
	

}
