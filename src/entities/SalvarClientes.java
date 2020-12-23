package entities;
import java.util.ArrayList;
public class SalvarClientes {

	private static ArrayList<Cliente> lista = new ArrayList<Cliente>();
	public static void salvarCliente(Cliente c) {
		lista.add(c);
	}
	
	
}
