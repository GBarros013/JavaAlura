package ed;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Jose");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		System.out.println(lista.contem(a1));
		

		
		
		lista.adiciona(0, a2);
		System.out.println(lista);

	}

}
