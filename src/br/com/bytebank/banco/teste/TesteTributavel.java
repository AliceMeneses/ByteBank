package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(555, 4848);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.registra(cc);
		calculador.registra(sv);
		System.out.println(calculador.getTotalImposto());
	}	
}
