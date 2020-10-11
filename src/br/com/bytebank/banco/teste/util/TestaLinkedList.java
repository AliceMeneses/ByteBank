package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TestaLinkedList {

	public static void main(String[] args) {
		
		LinkedList lista;
		lista = new LinkedList();
		
		ContaCorrente cc = new ContaCorrente(48, 7895);
		lista.add(cc);
		ContaPoupanca cp = new ContaPoupanca(289, 755);
		lista.add(cp);
		
		cc = (ContaCorrente) lista.get(0);
		System.out.println("Primeiro elemento da lista: " + cc);
		System.out.println("Tamanho: " + lista.size());
		
		System.out.println();
		System.out.println("Elementos da lista: ");
		for(Object obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------");
		System.out.println("LinkedList com generics");
		
		LinkedList<Conta> contas = new LinkedList<>();
		
		contas.add(cc);
		contas.add(cp);
		
		for(Conta c : contas) {
			System.out.println(c);
		}
		
	}

}
