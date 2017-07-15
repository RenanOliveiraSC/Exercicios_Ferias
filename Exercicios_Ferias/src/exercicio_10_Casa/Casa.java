package exercicio_10_Casa;

public class Casa {

	private String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();

	void pinta(String color) {
		this.cor = color;
	}

	int quantasPortasEstaoAbertas() {
		int abertas = 0;
		if (this.porta1.estaAberta()) {
			abertas += 1;
		}
		if (this.porta2.estaAberta()) {
			abertas += 1;
		}
		if (this.porta3.estaAberta()) {
			abertas += 1;
		}
		return abertas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
