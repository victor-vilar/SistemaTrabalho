package br.com.landtecengenharia.sistemaInterno.models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable{

	private String nome;
	private String cpfcnpj;
	private List<Address> enderecos = new ArrayList<>();
	private List<Contato> contatos = new ArrayList<>();
	

	public Cliente(String nome, String cpfcnpj) {
		this.nome=nome;
		this.cpfcnpj = cpfcnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getCpfCnpj() {
		return cpfcnpj;
	}
	
	public void addContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public void addEndereco(Address endereco) {
		this.enderecos.add(endereco);
	}
	
	public int ContatosTamanho() {
		return this.contatos.size();
	}
	
	public int enderecosTamanho() {
		return this.enderecos.size();
	}
	
	public Contato contatosPosicao(int i) {
		return this.contatos.get(i);
	}
	
	public String toString() {
		return this.getNome() + " - " + this.getCpfCnpj();
	}
		
}
