import java.awt.Color;

public class Clube {
	
	private String nome;
	private Color[] cores;
	
	public Clube(String nome, Color corUm, Color corDois, Color corTres) {
		super();
		this.nome = nome;
		
		cores = new Color[3];
		
		cores[0] = corUm;
		cores[1] = corDois;
		cores[2] = corTres;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Color[] getCores() {
		return cores;
	}

	public void setCores(Color[] cores) {
		this.cores = cores;
	}
	

}
