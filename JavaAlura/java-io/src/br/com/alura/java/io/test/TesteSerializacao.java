package br.com.alura.java.io.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException  {
		String nome = "Gabriel Barros";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		
		oos.writeObject(nome);
		oos.close();
		
	}

}
