package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * @author Alice
 *
 */
public class Conta implements Comparable<Conta>, Serializable{

	private static final long serialVersionUID = 1L;
	private int numero;
	private Cliente titular;
	private double saldo;
	private int agencia;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param numero
	 * @param agencia
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 */
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Ol�, eu sou uma exce��o. Valor: " + valor + " Saldo: " + this.saldo);
		} 
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outra = (Conta) obj;
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "N�mero: " + this.numero + " Ag�ncia: " + this.agencia;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.getSaldo(), outra.getSaldo());
	}
}
