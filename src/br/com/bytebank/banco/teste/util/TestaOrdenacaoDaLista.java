package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaOrdenacaoDaLista {

	public static void main(String[] args) {
		
		Conta c1 = new ContaPoupanca(25,5098);
		Conta c2 = new ContaCorrente(4,7812);
		Conta c3 = new ContaPoupanca(60,8916);
		Conta c4 = new ContaCorrente(85,8956);
		Conta c5 = new ContaCorrente(10,9845);
		
		ArrayList<Conta> lista = new ArrayList();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		
		System.out.println("Lista desordenada");
		System.out.println();
		
		for(Conta c : lista) {
			System.out.println(c);
		}
		
		NumeroDaContaComparator comparador = new NumeroDaContaComparator();
		lista.sort(comparador);
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada a partir do algoritmo sort");
		System.out.println();
		
		for(Conta c : lista) {
			System.out.println(c);
		}


	}

}

class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		
		return 0;
	}
	
}