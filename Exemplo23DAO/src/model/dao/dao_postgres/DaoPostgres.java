package model.dao.dao_postgres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Cadastro;
import model.Curso;
import model.dao.Dao;

public class DaoPostgres implements Dao {

	@Override
	public List<Cadastro> buscaAlunoPorNome(String key) {
		
		List<Cadastro> cadastros = new ArrayList<>();
		try(Connection c = MinhaConexao.getConexao()){
			
			String query = "SELECT a.ra, a.nome as nome_aluno, c.nome as nome_curso "
					+ "FROM alunos a "
					+ "INNER JOIN alunos_cursos ac ON (a.ra=ac.ra) "
					+ "INNER JOIN cursos c ON (ac.nome_curso=c.nome) "
					+ "WHERE LOWER(a.nome) LIKE LOWER(?)";
			PreparedStatement pstm = c.prepareStatement(query);
			pstm.setString(1, "%"+key+"%");
			ResultSet rs = pstm.executeQuery();
			
			Cadastro cadastroAnterior = null;
			while(rs.next()) {
				
				String ra = rs.getString("ra");
				String nome = rs.getString("nome_aluno");
				Aluno aluno = new Aluno(ra, nome);
				
				if(cadastroAnterior==null) {
					Cadastro cadastro = new Cadastro(aluno);
					Curso curso = new Curso(rs.getString("nome_curso"));
					cadastro.addCurso(curso);
					cadastroAnterior = cadastro;
				}
				else if(!(cadastroAnterior.getAluno().getRa()).equals(aluno.getRa())) {
					cadastros.add(cadastroAnterior);
					Cadastro cadastro = new Cadastro(aluno);
					Curso curso = new Curso(rs.getString("nome_curso"));
					cadastro.addCurso(curso);
					cadastroAnterior = cadastro;
				}
				else {
					Curso curso = new Curso(rs.getString("nome_curso"));
					cadastroAnterior.addCurso(curso);
				}
			}
			if(cadastroAnterior!=null)cadastros.add(cadastroAnterior);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return cadastros;
	}

	@Override
	public List<Curso> buscaCurso(String key) {
		
		List<Curso> cursos = new ArrayList<>();
		try(Connection c = MinhaConexao.getConexao()){
			
			String query = "SELECT * FROM cursos "
					+ "WHERE LOWER(nome) LIKE LOWER(?)";
			PreparedStatement pstm = c.prepareStatement(query);
			pstm.setString(1, "%"+key+"%");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				Curso curso = new Curso(rs.getString("nome"));
				cursos.add(curso);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return cursos;
	}

	@Override
	public boolean addCurso(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCursoEmCadastro(String raAluno, Curso curso) {
		boolean resultado = false;
		try(Connection c = MinhaConexao.getConexao()){
			
			String query = "INSERT INTO alunos_cursos "
					+ "VALUES(?, ?)";
			PreparedStatement pstm = c.prepareStatement(query);
			pstm.setString(1, curso.getNome());
			pstm.setString(2, raAluno);
			resultado = (pstm.executeUpdate()>0 ? true : false);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
