package br.com.bytebank.banco.modelo;
/**
 * Classe representa a moldura de uma conta
 * @author Alice
 *
 */
public class Conta {
	private int numero;
	private Cliente titular;
	private double saldo;
	private int agencia;
	private static int total;
	
	public Conta(int numero, int agencia) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Olá, eu sou uma exceção. Valor: " + valor + " Saldo: " + this.saldo);
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
}
