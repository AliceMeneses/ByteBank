package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicao;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicao = 0;
	}
	
	public void setRefencia(Object ref) {
		this.referencias[posicao] = ref;
		this.posicao++;
	}
	
	public Object getConta(int index) {
		return this.referencias[index];
	}
	
	public int getQuantidadeDeElementos() {
		return posicao;
	}
	
	public void remove(int index) {
		referencias[index] = null; 
	}
}
