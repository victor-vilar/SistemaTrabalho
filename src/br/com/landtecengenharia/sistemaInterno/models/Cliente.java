package br.com.landtecengenharia.sistemaInterno.models;
import java.io.Serializable;

public class Cliente implements Serializable{

	private String nome;
	private String cpfcnpj;
	

	public Cliente(String nome, String cpfcnpj) {
		this.nome=nome;
		this.cpfcnpj = cpfcnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfcnpj;
	}
		
}
