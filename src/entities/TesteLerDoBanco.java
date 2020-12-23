package entities;

public class TesteLerDoBanco {

	public static void main( String[] args) {
	
	Cliente ime = new Cliente();
	Cliente cig = new Cliente();
	ime.setNome("Instituto Militar de Engenharia");
	cig.setNome("Campo de Instrução Gericino");
	
	
	SalvarClientes.salvarCliente(ime);
	SalvarClientes.salvarCliente(cig);
	
	SalvarClientes.getNomeClientes();
	
	
	
	
	}
	
}
