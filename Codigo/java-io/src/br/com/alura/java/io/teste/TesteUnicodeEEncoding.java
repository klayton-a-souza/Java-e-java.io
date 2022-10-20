package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bs = s.getBytes("UTF-8");
		System.out.print(bs.length + ", UTF-8, ");
		String sNovo = new String(bs, "UTF-8");
		System.out.println(sNovo);
		
		bs = s.getBytes("UTF-16");
		System.out.print(bs.length + ", UTF-16, ");
		sNovo = new String(bs, "UTF-16");
		System.out.println(sNovo);
		
		
		bs = s.getBytes("windows-1252");
		System.out.print(bs.length + ", windows-1252, ");
		sNovo = new String(bs, "windows-1252");
		System.out.println(sNovo);
		
		bs = s.getBytes("ASCII");
		System.out.print(bs.length + ", ASCII, ");
		sNovo = new String(bs, "ASCII");
		System.out.println(sNovo);
		
		
		
	}

}
