package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] contas;
	private int posicao;
	
	public GuardadorDeContas() {
		this.contas = new Conta[10]; 
		this.posicao = 0;
	}
	
	public void setConta(Conta ref) {
		this.contas[posicao] = ref;
		this.posicao++;
	}
	
	public Conta getConta(int index) {
		return this.contas[index];
	}
	
	public int getQuantidadeDeElementos() {
		return posicao;
	}
	
	public void remove(int index) {
		contas[index] = null; 
	}
	
	

}
