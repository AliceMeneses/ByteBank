package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TestaArrayDeReferencias {

	public static void main(String[] args) {
		ContaCorrente[] ccs = new ContaCorrente[3];
		
		ContaCorrente cc1 = new ContaCorrente(123, 4548);
		ccs[0] = cc1;
		System.out.println(ccs[0]);
		
		ccs[1] = new ContaCorrente(789, 6584);
		System.out.println(ccs[1]);
		
		for(int i = 0; i < ccs.length; i++) {
			System.out.println(ccs[i]);
		}
		
		try {
			System.out.println(ccs[45]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index fora do intervalo de indices");
			ex.printStackTrace();
		}
		
		
		Conta[] contas = new Conta[2];
		
		contas[0] = new ContaPoupanca(147,7898);
		contas[1] = new ContaCorrente(465,5687);
		
		System.out.println(contas[0]);
		
		ContaPoupanca cp = (ContaPoupanca) contas[0];// type cast explicito
		System.out.println(cp);
		
		try {
		ContaCorrente cc = (ContaCorrente) contas[0];		
		System.out.println(cc);
		}
		catch(ClassCastException ex) {
			System.out.println("Falha na conversão (type cast)");
			ex.printStackTrace();
		}
		
		
	}

}
