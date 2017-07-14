package exercicio_9_Pais_Capital;

import java.util.Scanner;

public class TestePais extends Pais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TestePais testepais1 = new TestePais();
		testepais1.setNome("Brasil");
		testepais1.setCapital("Brasília");

		System.out.print("Pais: " + testepais1.getNome() + "\nCapital: " + testepais1.getCapital());

	}

}
