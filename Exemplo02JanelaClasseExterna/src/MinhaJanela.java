import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	
	public MinhaJanela(String titulo) {
		super(titulo);
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

}
