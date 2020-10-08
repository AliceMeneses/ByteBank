package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayDeReferencias {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[3];
		
		ContaCorrente cc1 = new ContaCorrente(123, 4548);
		contas[0] = cc1;
		System.out.println(contas[0]);
		
		contas[1] = new ContaCorrente(789, 6584);
		System.out.println(contas[1]);
		
		for(int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]);
		}
		
		try {
			System.out.println(contas[45]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
	}

}
