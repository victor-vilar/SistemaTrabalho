package entities;

import java.io.IOException;

public class TesteLerDoBanco {

	public static void main( String[] args) {
	
	Cliente ime = new Cliente();
	Cliente cig = new Cliente();
	ime.setNome("Instituto Militar de Engenharia");
	cig.setNome("Campo de Instrução Gericino");
	ime.setCnpj("521452145");
	cig.setCnpj("7845124578");
	
	
	SalvarClientes.salvarCliente(ime);
	SalvarClientes.salvarCliente(cig);
	
	try {
		SalvarClientes.salvarClientesBanco();
	}catch(IOException ex){
		System.out.println(ex);
	}
	
	
//	try {
//		SalvarClientes.lerInformacoesBanco();
//	}catch(IOException ex) {
//		System.out.println(ex);
//	}
	
	
	
}
}