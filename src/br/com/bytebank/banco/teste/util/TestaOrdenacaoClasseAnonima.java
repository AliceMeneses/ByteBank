package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaOrdenacaoClasseAnonima {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente(22, 33);
        Cliente clienteC1 = new Cliente();
        clienteC1.setNome("Nico");
        c1.setTitular(clienteC1);
        c1.deposita(333.0);

        Conta c2 = new ContaPoupanca(22, 44);
        Cliente clienteC2 = new Cliente();
        clienteC2.setNome("Guilherme");
        c2.setTitular(clienteC2);
        c2.deposita(444.0);

        Conta c3 = new ContaCorrente(22, 11);
        Cliente clienteC3 = new Cliente();
        clienteC3.setNome("Paulo");
        c3.setTitular(clienteC3);
        c3.deposita(111.0);

        Conta c4 = new ContaPoupanca(22, 22);
        Cliente clienteC4 = new Cliente();
        clienteC4.setNome("Ana");
        c4.setTitular(clienteC4);
        c4.deposita(222.0);
		
		ArrayList<Conta> lista = new ArrayList();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		
		System.out.println("Lista com a ordem de inserção");
		System.out.println();
		
		for(Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome()  + ", Saldo: " + c.getSaldo());
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo o número da conta");
		System.out.println();

		lista.sort(new Comparator<Conta>(){//classe anonima

			@Override
			public int compare(Conta c1, Conta c2) {
				
				return Integer.compare(c1.getNumero(), c2.getNumero());

			}
			
		});
		
		for(Conta c : lista) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo o titular da conta");
		System.out.println();
		
		lista.sort(new Comparator<Conta>(){

			@Override
			public int compare(Conta c1, Conta c2) {
				String titularC1 = c1.getTitular().getNome();
				String titularC2 = c2.getTitular().getNome();	
				return titularC1.compareTo(titularC2);
			}
			
		});
		
		for(Conta c : lista) {
			System.out.println(c  + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo a ordenação natural da conta usando o metodo da instancia:");
		System.out.println();
		
		lista.sort(null);// Forçando ordenação natural
		
		for(Conta c : lista) {
			System.out.println(c  + ", Saldo: " + c.getSaldo());
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo a ordenação natural da conta usando a classe Collections:");
		System.out.println();
		
		Collections.sort(lista);
		
		for(Conta c : lista) {
			System.out.println(c  + ", Saldo: " + c.getSaldo());
		}
	}

}