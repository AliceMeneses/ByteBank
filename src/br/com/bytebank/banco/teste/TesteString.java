package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alice";// sintaxe literal
		System.out.println(nome);		
		
		String outra = nome.replace('e','i');
		System.out.println("Replace: " + outra);
		
		outra = nome.toUpperCase();
		System.out.println("toUpperCase: " + outra);
		
		outra = outra.toLowerCase();
		System.out.println("toLowerCase: " + outra);
		
		char letra = nome.charAt(3);
		System.out.println("charArt: " + letra);
		
		int index = nome.indexOf("c");
		System.out.println("indexOf: " + index);
		
		outra = nome.substring(1);
		System.out.println("substring: " + outra);
		
		boolean contem = nome.contains("lice"); 
		System.out.println("contains: " + contem);
	
		int tam = nome.length();
		System.out.println("Length: " + tam);
		
		outra = "   Alice   Meneses   ";
		outra = outra.trim();
		System.out.println("trim: " + outra);
		
	}

}
