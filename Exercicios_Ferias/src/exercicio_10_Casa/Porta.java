package exercicio_10_Casa;

public class Porta {

	private boolean aberta;
	private String cor;
	private float dimensaoX, dimensaoY, dimensaoZ;

	public void abre() {
		this.aberta = true;

	}

	public void fecha() {
		this.aberta = false;

	}

	public boolean estaAberta() {
		return aberta;

	}

	public void pinta(String s) {
		this.cor = s;
	}

	public boolean isAberta() {
		return aberta;

	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(float dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public float getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(float dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public float getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(float dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

}