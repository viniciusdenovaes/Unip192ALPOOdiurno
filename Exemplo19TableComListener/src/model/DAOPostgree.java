package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOPostgree {
	
	public static void insereAluno() {
		
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

	public static void buscaAluno() {
		
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
	
	public static List<Aluno> buscaAlunos(String nomeChave){
		String query = "SELECT * FROM alunos "
				+ "WHERE LOWER(nome) LIKE LOWER(?)";
		
		List<Aluno> alunos = new ArrayList<>();
		
		try(
				Connection c = MinhaConexao.getConexao();
				PreparedStatement pstm = c.prepareStatement(query)){
			pstm.setString(1, "%"+nomeChave+"%");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				String ra = rs.getString("ra");
				String nome = rs.getString("nome");
				alunos.add(new Aluno(ra, nome));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return alunos;
	}
		
	public static boolean incluiAluno(String ra, String nome){
		String update = "INSERT INTO alunos VALUES(?, ?)";
		
		int rows = 0;
		
		try(
				Connection c = MinhaConexao.getConexao();
				PreparedStatement pstm = c.prepareStatement(update)){
			pstm.setString(1, ra);
			pstm.setString(2, nome);
			rows = pstm.executeUpdate();
			
		}
		catch(SQLException e) {
			//e.printStackTrace();
		}
		
		if(rows>0) return true;
		else return false;
	}
		
}
