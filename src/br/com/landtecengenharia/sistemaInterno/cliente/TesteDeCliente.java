package br.com.landtecengenharia.sistemaInterno.cliente;

public class TesteDeCliente {

	public static void main(String[] args) {
	
	Cliente c = new Cliente();
	Cliente laqfa = new Cliente();
	
	c.setNome("Instituto Militar de Engenharia");
	laqfa.setNome("Laboratorio Quimico Farmaceutico da Aeronautica");
	SalvarClientes.salvarCliente(c);
	SalvarClientes.salvarCliente(laqfa);
	
	
	SalvarClientes.getNomeClientes();
	
	
	
	
	
	
	
	}
}
