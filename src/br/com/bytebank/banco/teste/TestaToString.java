package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaToString {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 7894);
		ContaPoupanca cp = new ContaPoupanca(459, 7687);
		Object conta = cp;
		
		System.out.println(conta);
		System.out.println(cc);
		System.out.println(cp);
	}

}
