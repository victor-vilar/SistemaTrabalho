package br.com.landtecengenharia.sistemaInterno.models;

public class Address {

	//required parameters
	private String endereco;
	private String numero;
	private String cidade;
	private String estado;
	
	//optional parameters
	private String complemento;
	private String cep;

	
	public static class AddressBuilder {
		
		//required parameters
		private String endereco;
		private String numero;
		private String cidade;
		private String estado;
		
		//optional parameters
		private String complemento;
		private String cep;
		
		
		public AddressBuilder(String endereco, String numero, String cidade, String estado) {
			this.endereco = endereco;
			this.numero = numero;
			this.cidade = cidade;
			this.estado = estado;
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
	
	
	
}
