package exercicio_10_Casa;

public class TesteCasa {

	public static void main(String[] args) {

		Casa casa1 = new Casa();

		casa1.pinta("Verde");
		casa1.porta1.abre();
		casa1.porta2.fecha();
		casa1.porta3.abre();
		System.out.println("Cor da casa: " + casa1.getCor());
		System.out.println("Portas abertas: " + casa1.quantasPortasEstaoAbertas());
	}

}
