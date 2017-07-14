package exercicio_10_Casa;

import java.util.Scanner;

public class TestePorta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Porta porta1 = new Porta();
		Porta porta2 = new Porta();

		System.out.println("Deseja abrir a porta 01 ? - Digite 1 para SIM e 2 para NAO");
		String resposta1 = sc.nextLine();
		System.out.println("Deseja abrir a porta 02 ? - Digite 1 para SIM e 2 para NAO");
		String resposta2 = sc.nextLine();

		System.out.println("Status da Porta: " + resposta1.length() + "\nCor: " + porta1.getCor());
		porta1.converteStringEmBoolean(resposta1);
		porta2.converteStringEmBoolean(resposta2);

	}
}
