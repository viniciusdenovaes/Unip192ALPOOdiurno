import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButtons extends JPanel {
	
	public PanelButtons() {
		
		setBackground(Color.PINK);
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		add(Box.createHorizontalGlue());
		add(new JButton("Cancel"));
		add(Box.createRigidArea(new Dimension(5, 0)));
		add(new JButton("Ok"));
		
	}

}
