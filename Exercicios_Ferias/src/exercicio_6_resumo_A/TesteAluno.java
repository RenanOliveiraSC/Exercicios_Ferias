package exercicio_6_resumo_A;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fátima");
		aluno1.setSobrenome("De Lurdes");
		aluno1.setSexo("Faminino");
		aluno1.setCurso("Engenharia");
		aluno1.setDuracao("400hr");
		aluno1.setPeriodo("Noturno");

		System.out.println("******** Dados do Aluno **********" + "\nNome: " + aluno1.getNome() + "\nSobrenome: "
				+ aluno1.getSobrenome() + "\nSexo: " + aluno1.getSexo() + "\nCurso: " + aluno1.getCurso()
				+ "\nPeríodo: " + aluno1.getPeriodo() + "\nDuração: " + aluno1.getDuracao());

	}
}
