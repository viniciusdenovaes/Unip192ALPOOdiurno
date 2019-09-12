
public class Aluno {
	
	String ra;
	String nome;
	public Aluno(String ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "ra: " + ra + ", nome: " + nome;
	}
	
	

}
