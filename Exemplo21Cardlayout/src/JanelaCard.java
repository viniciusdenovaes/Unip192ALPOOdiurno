import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JanelaCard extends JFrame {
	
	JButton botaoPanel01 = new JButton("Painel 01");
	JButton botaoPanel02 = new JButton("Painel 02");
	JButton botaoPanel03 = new JButton("Painel 03");
	JButton botaoProximo = new JButton("Proximo");
	JButton botaoAnterior = new JButton("Anterior");
	JButton botaoPrimeiro = new JButton("Primeiro");
	JButton botaoUltimo = new JButton("Ultimo");
	
	String nomePanel1 = "panel01";
	String nomePanel2 = "panel02";
	String nomePanel3 = "panel03";
	String nomePanel4 = "panel04";
	
	CardLayout cl = new CardLayout();
	JPanel panelCards = new JPanel(cl);
	
	public JanelaCard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		panelCards.add(new PanelCores(Color.BLUE, "panel 1"), nomePanel1);
		panelCards.add(new PanelCores(Color.RED, "panel 2"), nomePanel2);
		panelCards.add(new PanelCores(Color.GREEN, "panel 3"), nomePanel3);
		panelCards.add(new PanelCores(Color.PINK, "panel 4"), nomePanel4);
		
		botaoPanel01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCards, nomePanel1);
			}
		});
		botaoPanel02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCards, nomePanel2);
			}
		});
		botaoPanel03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCards, nomePanel3);
			}
		});
		
		botaoAnterior.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.previous(panelCards);
			}
		});
		botaoProximo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(panelCards);
			}
		});
		
		botaoPrimeiro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.first(panelCards);
			}
		});
		botaoUltimo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.last(panelCards);
			}
		});
		
		
		
		
		
		add(panelCards, BorderLayout.CENTER);
		JPanel panelBotoes = new JPanel();
		panelBotoes.add(botaoPanel01);
		panelBotoes.add(botaoPanel02);
		panelBotoes.add(botaoPanel03);
		panelBotoes.add(botaoAnterior);
		panelBotoes.add(botaoProximo);
		panelBotoes.add(botaoPrimeiro);
		panelBotoes.add(botaoUltimo);
		add(panelBotoes, BorderLayout.PAGE_END);
		
		pack();
	}
	

}
