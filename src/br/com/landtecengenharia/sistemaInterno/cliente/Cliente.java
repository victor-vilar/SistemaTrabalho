<<<<<<< HEAD:src/entities/Cliente.java
package br.com.landtecengenharia.sistemaInterno.cliente;
import java.io.Serializable;
public class Cliente implements Serializable{
=======


public class Cliente {
>>>>>>> 8adfdb4eaa3f8d5d282e38dd755794566e31490d:src/br/com/landtecengenharia/sistemaInterno/cliente/Cliente.java

	private String nome;
	private String cpf;
	private String cnpj;
	private String endereco;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	
	
	
	public Cliente() {
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
}
