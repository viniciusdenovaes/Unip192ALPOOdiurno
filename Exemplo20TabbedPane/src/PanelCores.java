import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCores extends JPanel {
	
	public PanelCores(Color cor, String texto) {
		setPreferredSize(new Dimension(400, 400));
		add(new JLabel(texto));
		setBackground(cor);
	}

}
