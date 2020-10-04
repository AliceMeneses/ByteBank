package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no bytebank
 * 
 * @author Alice
 * @version 1.0
 *
 */

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
