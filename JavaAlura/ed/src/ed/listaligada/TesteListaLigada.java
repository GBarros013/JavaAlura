package ed.listaligada;

public class TesteListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("paulo");
		System.out.println(lista);
		lista.adicionaNoComeco("guilherme");
		System.out.println(lista);
	}

}
