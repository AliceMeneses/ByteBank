package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TestaArrayListEquals {

	public static void main(String[] args) {

		System.out.println("ArrayList com generics: ");
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		ContaCorrente cc1 = new ContaCorrente(48, 7895);
		ContaPoupanca cp = new ContaPoupanca(56, 8712);
		
		contas.add(cc1);
		contas.add(cp);
		
		for(Conta c : contas) {
			System.out.println(c);
		}
		
		System.out.println("-----------------");
		System.out.println("Já existe na lista o elemento " + cc1 + " ? " + contas.contains(cc1));
		
		ContaCorrente cc2 = new ContaCorrente(48, 7895);
		System.out.println("Já existe na lista o elemento " + cc2 + " ? " + contas.contains(cc2));
		
	}

}
