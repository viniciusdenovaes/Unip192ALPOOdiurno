import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JanelaCheckAndRadio extends JFrame {
	
	JCheckBox[] checkDisciplina = new JCheckBox[3];
	JRadioButton[] radioPeriodo = new JRadioButton[3];
	JRadioButton[] radioSemestre = new JRadioButton[3];
	
	public JanelaCheckAndRadio() {
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelDisciplina = new JPanel();
		add(panelDisciplina);
		panelDisciplina.setLayout(
				new GridLayout(checkDisciplina.length, 1));
		
		checkDisciplina[0] = new JCheckBox("Java");
		checkDisciplina[1] = new JCheckBox("A.I.");
		checkDisciplina[2] = new JCheckBox("C");
		
		for(JCheckBox check : checkDisciplina) {
			panelDisciplina.add(check);
			check.addActionListener(new ComportamentoBotoes());
		}
		
		JPanel panelPeriodo = new JPanel();
		add(panelPeriodo);
		panelPeriodo.setLayout(
				new GridLayout(radioPeriodo.length, 1));
		
		radioPeriodo[0] = new JRadioButton("Manhã");
		radioPeriodo[1] = new JRadioButton("Tarde");
		radioPeriodo[2] = new JRadioButton("Noite");
		
		ButtonGroup buttonGroupPeriodo = new ButtonGroup();
		
		for(JRadioButton radio : radioPeriodo) {
			buttonGroupPeriodo.add(radio);
			panelPeriodo.add(radio);
			radio.addActionListener(new ComportamentoBotoes());
		}
		
		
		
		
		pack();
	}
	
	class ComportamentoBotoes implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for(JCheckBox check : checkDisciplina)
				if(check.isSelected())
					System.out.println(
							"Materia " + check.getText());
			for(JRadioButton radio : radioPeriodo) 
				if(radio.isSelected())
					System.out.println(
							"Turno " + radio.getText());
			System.out.println();
		}
		
	}
	

}



