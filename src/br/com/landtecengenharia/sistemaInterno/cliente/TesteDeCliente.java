package br.com.landtecengenharia.sistemaInterno.cliente;

import java.io.IOException;

public class TesteDeCliente {

	public static void main(String[] args) {
	
	Cliente c = new Cliente();
	Cliente laqfa = new Cliente();
	
	c.setNome("Instituto Militar de Engenharia");
	c.setCnpj("0845836000178");
	SalvarClientes.salvarCliente(c);
	
	laqfa.setNome("Laboratorio Quimico Farmaceutico da Aeronautica");
	laqfa.setCnpj("0845836000178");
	SalvarClientes.salvarCliente(laqfa);
	
	try {
		SalvarClientes.salvarListaDeclientesEmTexto();
	}catch(IOException e) {
		
	}
	
	SalvarClientes.getNomeClientes();
	SalvarClientes.limparLista();
	SalvarClientes.getNomeClientes();
	
	try {
		SalvarClientes.lerInformacoesBancoDosObjetos();
	}catch(IOException e) {
		
	}catch(ClassNotFoundException e) {
		
	}

	
	
	
	
	
	
	}
}
