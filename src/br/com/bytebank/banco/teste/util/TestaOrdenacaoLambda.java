package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaOrdenacaoLambda {

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
		
		lista.forEach((conta) -> System.out.println(conta + ", Titular: " + conta.getTitular().getNome()  + ", Saldo: " + conta.getSaldo()));	
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo o número da conta");
		System.out.println();

		lista.sort((Conta c5, Conta c6) -> {				
				return Integer.compare(c5.getNumero(), c6.getNumero());
			});
		
		lista.forEach((conta) -> System.out.println(conta));
			
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo o titular da conta");
		System.out.println();
		
		lista.sort((Conta c9, Conta c10) -> {
				String titularC1 = c9.getTitular().getNome();
				String titularC2 = c10.getTitular().getNome();	
				return titularC1.compareTo(titularC2);			
			
		});
		
		lista.forEach((conta) -> System.out.println(conta+ ", Titular: " + conta.getTitular().getNome() ));	
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo a ordenação natural da conta usando o metodo da instancia:");
		System.out.println();
		
		lista.sort(null);// Forçando ordenação natural
		
		lista.forEach((conta) -> System.out.println(conta + ", Saldo: " + conta.getSaldo()));	
		
		System.out.println("------------------------------------------");
		System.out.println("Lista ordenada segundo a ordenação natural da conta usando a classe Collections:");
		System.out.println();
		
		Collections.sort(lista);
		
		lista.forEach((conta) -> System.out.println(conta + ", Saldo: " + conta.getSaldo()));	

	}

}