package exercicio_10_Casa;

public class TestePorta {

	public static void main(String[] args) {

		Porta porta1 = new Porta();
		Porta porta2 = new Porta();

		porta1.abre();
		porta1.setCor("Amarelo");
		porta1.setCor("Azul");
		porta1.fecha();

		porta2.abre();
		porta2.setCor("Azul");
		porta2.setCor("Amarelo");

		System.out.println("Status da Porta: " + porta1.estaAberta() + "\nCor da Porta: " + porta1.getCor());
		System.out.println("Status da Porta: " + porta2.estaAberta() + "\nCor da Porta: " + porta2.getCor());
	}
}
