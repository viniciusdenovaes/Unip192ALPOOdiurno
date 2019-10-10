package teste;

import controller.Controller;
import model.dao.Dao;
import model.dao.daoPostgre.DaoPostgre;
import view.View;
import view.view_default.ViewDefault;

public class Teste {
	
	public static void main(String[] args) {
		Dao dao = new DaoPostgre(); 
		View view = new ViewDefault();
		
		Controller controller = new Controller(dao, view);
		controller.init();
	}

}
