package br.com.landtecengenharia.sistemaInterno.testes;

import br.com.landtecengenharia.sistemaInterno.models.Address;

public class TesteDeAddress {

	public static void main(String[] args) {
		
		Address endereco = new Address.AddressBuilder
				("Rua Marechal Floriano", "49","Duque de Caxias","Rio de Janeiro")
				.Complemento("apt 205")
				.Cep("25075025").build();

	}

}
