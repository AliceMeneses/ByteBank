package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		valor += 0.50; 
		super.saca(valor);
	}
	
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}
}
