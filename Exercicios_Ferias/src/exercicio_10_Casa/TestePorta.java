package exercicio_10_Casa;

import java.util.Scanner;

public class TestePorta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Porta porta1 = new Porta();
		Porta porta2 = new Porta();

		porta1.abre();
		porta1.setCor("Amarelo");
		porta1.fecha();
		porta1.pinta("Branco");

		porta2.abre();
		porta2.pinta("Marrom");

		System.out.println(porta1.getCor() + "\n" + porta1.isAberta());
		System.out.println();
		System.out.println(porta2.getCor() + "\n" + porta2.isAberta());

	}
}
