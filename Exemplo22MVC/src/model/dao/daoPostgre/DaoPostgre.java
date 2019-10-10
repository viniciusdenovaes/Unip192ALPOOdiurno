package model.dao.daoPostgre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.dao.Dao;

public class DaoPostgre implements Dao{

	@Override
	public List<Aluno> buscaAluno(String nomeBusca) {
		String query = "SELECT * FROM alunos "
				+ "WHERE LOWER(nome) LIKE LOWER(?)";
		
		List<Aluno> alunos = new ArrayList<>();
		
		try(
				Connection c = MinhaConexao.getConexao();
				PreparedStatement pstm = c.prepareStatement(query)){
			pstm.setString(1, "%"+nomeBusca+"%");
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

	@Override
	public boolean adicionaAluno(Aluno aluno) {
		String update = "INSERT INTO alunos VALUES(?, ?)";
		
		int rows = 0;
		
		try(
				Connection c = MinhaConexao.getConexao();
				PreparedStatement pstm = c.prepareStatement(update)){
			pstm.setString(1, aluno.getRa());
			pstm.setString(2, aluno.getNome());
			rows = pstm.executeUpdate();
			
		}
		catch(SQLException e) {
			//e.printStackTrace();
		}
		
		if(rows>0) return true;
		else return false;
	}
		
}
