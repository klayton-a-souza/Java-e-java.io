package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		//Escrevendo uma linha
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//Pulando linha
		bw.newLine();
		//Escrevendo outra linha
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		//Fechando recurso
		bw.close();
	}

}
