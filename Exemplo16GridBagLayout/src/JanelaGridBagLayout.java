import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaGridBagLayout extends JFrame {
	
	public JanelaGridBagLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.0;
		c.fill = GridBagConstraints.BOTH;
		add(new JButton("botao 1"), c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 0.5;
		add(new JButton("botao 2"), c);
		
		c.gridx = 2;
		c.gridy = 0;
		c.weightx = 1.0;
		add(new JButton("botao 3"), c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 3;
		c.weightx = 0.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(new JButton("botao 5"), c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		add(new JButton("botao 4"), c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10, 20, 30, 40);
		add(new JButton("botao 6"), c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0, 0, 0, 0);
		add(new JButton("botao 7"), c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0, 0, 0, 0);
		add(new JButton("botao 8"), c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		add(new JButton("botao 9"), c);
		
		c.gridx = 2;
		add(new JButton("botao 9"), c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 5;
		c.anchor = GridBagConstraints.LAST_LINE_END;
		add(new JButton("a"), c);
		
		
		
		
		
		
		
		pack();
	}

}
