package br.com.bytebank.banco.teste.util;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		int num = 45;
		Integer numRef = num;
		System.out.println(numRef);
		numRef = Integer.valueOf(num); // autoboxing
		System.out.println(numRef);
		num = 0;
		
		num = numRef.intValue(); // unboxing
		System.out.println("Tipo primitivo " + num);
		System.out.println("Integer: " + numRef);
		
		System.out.println();
		System.out.println("Parse: conversão de uma String para algo mais especifico");
		
		Integer numRef2 = Integer.valueOf("497"); // Parse
		num = Integer.parseInt("497"); // Parse
		
	}

}
