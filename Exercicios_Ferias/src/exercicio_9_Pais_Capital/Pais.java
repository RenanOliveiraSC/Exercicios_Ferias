package exercicio_9_Pais_Capital;

public class Pais {

	private String nome;
	private String capital;
	private String dimensao;
	private String fronteira;

	Pais() {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}

	public boolean equals(final Pais outro) {
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getDimensao() {
		return dimensao;
	}

	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}

	public String getFronteira() {
		return fronteira;
	}

	public void setFronteira(String fronteira) {
		this.fronteira = fronteira;
	}

}
