package teste;

import controller.Controller;
import model.dao.dao_postgres.DaoPostgres;
import view.janela.ViewJanela;

public class Teste {
	
	public static void main(String[] args) {
		new Controller(new DaoPostgres(), new ViewJanela());
	}

}
