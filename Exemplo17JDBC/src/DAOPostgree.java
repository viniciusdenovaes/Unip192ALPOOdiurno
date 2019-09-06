import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOPostgree {
	static void insereAluno() {
		
		String update = "INSERT INTO alunos VALUES ('224', 'Ana')";
		
		try(
				Connection c = MinhaConexao.getConexao();
				Statement stm = c.createStatement()
				){
			int r = stm.executeUpdate(update);
			System.out.println("linhas modificadas = " + r);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	static void buscaAluno() {
		
		String query = "SELECT * FROM alunos";
		
		try(
				Connection c = MinhaConexao.getConexao();
				Statement stm = c.createStatement()
				){
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				System.out.println(
						"ra: " + rs.getString(1) +
						" nome: " + rs.getString("nome"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
}
