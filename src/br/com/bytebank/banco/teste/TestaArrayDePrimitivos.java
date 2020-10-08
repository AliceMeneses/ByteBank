package br.com.bytebank.banco.teste;

public class TestaArrayDePrimitivos {

	public static void main(String[] args) {
		int[] idades;
		idades = new int[3];
		
		System.out.println(idades[0]);//valor padrão do int
		
		idades[0] = 19;		
		System.out.println(idades[0]);
		
		System.out.println("Array idades:");
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * 2;
			System.out.println(idades[i]);
		}
		
		float[] altura = {1.70f, 1.55f, 1.80f};// Sintaxe literal
		
		System.out.println("Array alturas:");
		for(int i = 0; i < altura.length; i++) {
			System.out.println(altura[i]);
		}
		
	}

}
