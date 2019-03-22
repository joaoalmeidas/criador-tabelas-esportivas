
public class Competicao {
	
	private String nome;
	private Clube[] clubes;
	
	public Competicao(String nome, Clube[] clubes) {
		super();
		this.nome = nome;
		this.clubes = clubes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Clube[] getClubes() {
		return clubes;
	}

	public void setClubes(Clube[] clubes) {
		this.clubes = clubes;
	}
	
	

}
