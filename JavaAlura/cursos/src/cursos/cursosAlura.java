package cursos;

import java.util.ArrayList;
import java.util.Collections;

public class cursosAlura {
	public static void main(String[] args) {
		String curso1 = "Olá";
		String curso2 = "Tudo bem?";
		String curso3 = "Gracas a";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
				
		System.out.println("O primeiro curso da lista eh o: " + cursos.get(0));
		
		Collections.sort(cursos);
		System.out.println(cursos);
	}

}
