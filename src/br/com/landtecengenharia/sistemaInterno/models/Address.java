package br.com.landtecengenharia.sistemaInterno.models;

public class Address {

	//required parameters
	private String endereco;
	private String numero;
	private String cidade;
	private String estado;
	private boolean principal = false;
	
	//optional parameters
	private String complemento;
	private String cep;

	
	public static class AddressBuilder {
		
		//required parameters
		private String endereco;
		private String numero;
		private String cidade;
		private String estado;
		private boolean principal = false;
		
		//optional parameters
		private String complemento;
		private String cep;
		
		
		public AddressBuilder(String endereco, String numero, String cidade, String estado, boolean principal) {
			this.endereco = endereco;
			this.numero = numero;
			this.cidade = cidade;
			this.estado = estado;
			this.principal = principal;
		}
		
		public AddressBuilder Complemento(String complemento) {
			this.complemento = complemento;
			return this;
		}
		
		public AddressBuilder Cep(String cep) {
			this.cep = cep;
			return this;
		}
		
		public Address build() {
			return new Address(this);
			
		}
		
		
	}
	
	
	private Address(AddressBuilder builder) {
		this.endereco = builder.endereco;
		this.numero = builder.numero;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
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


	public boolean isPrincipal() {
		return principal;
	}


	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
	
	
	
}
