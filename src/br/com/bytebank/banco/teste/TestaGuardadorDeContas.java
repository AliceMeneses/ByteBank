package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TestaGuardadorDeContas {
	
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta c1 = new ContaCorrente(45, 98);
		guardador.setConta(c1);
		
		Conta c2 = new ContaPoupanca(12, 78);
		guardador.setConta(c2);
		
		System.out.println("Quantidade de elementos do Guardador de Contas: " + guardador.getQuantidadeDeElementos());
		
		System.out.println();
		System.out.println("Elementos armazenados no guardador de contas:");
		Conta c3 = guardador.getConta(0);
		System.out.println("Conta da posição 0: " + c3);
		
		Conta c4 = guardador.getConta(1);
		System.out.println("Conta da posição 1: " + c4);
		
		guardador.remove(1);
		c4 = guardador.getConta(1);
		System.out.println();
		System.out.println("Elemento removido do guardador de contas:");
		System.out.println("Conta da posição 1: " + c4);
		
	}

}
