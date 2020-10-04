package br.com.bytebank.banco.modelo;

//modelo.CalculadorImposto = FQN, "nome completo da classe".
public class CalculadorImposto {
	private double totalImposto;
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
