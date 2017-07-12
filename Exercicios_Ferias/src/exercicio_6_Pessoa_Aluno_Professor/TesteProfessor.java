package exercicio_6_Pessoa_Aluno_Professor;

public class TesteProfessor {

	public static void main(String[] args) {

		Professor professor1 = new Professor();
		professor1.setNome("Renan");
		professor1.setSobrenome("Oliveira");
		professor1.setSexo("M");
		professor1.setMateria("Inglês");

		Professor professor2 = new Professor();
		professor2.setNome("Gabriela");
		professor2.setNome("Shulz");
		professor2.setSexo("F");
		professor2.setMateria("Geografia");

		System.out.println("Matéria: " + professor1.getMateria() + "\nProfessor: " + professor1.getNome()
				+ "\nSobrenome: " + professor1.getSobrenome() + "\nSexo: " + professor1.getSexo());

	}
}
