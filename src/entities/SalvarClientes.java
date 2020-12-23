package entities;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;



public class SalvarClientes {

	private static ArrayList<Cliente> lista = new ArrayList<Cliente>();
	public static void salvarCliente(Cliente c) {
		lista.add(c);
	}
	
	public static int getTotalClientes() {
		return lista.size();
	}
	
	public static void getNomeClientes() {
		for(Cliente x : lista) {
			System.out.println(x.getNome());
			
			
		}		
	}
	
	public static void lerInformacoesBanco() throws IOException {
		
		//transforma o texto em bytes
		InputStream is = new FileInputStream("BDClientes.txt");
		//transforma o texto em char, ou seja em cada letra
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println(is);
			
	}
	
	public static void salvarClientesBanco() throws IOException{
		OutputStream os = new FileOutputStream("BDClientes.txt");// pega o byte
		OutputStreamWriter osw= new OutputStreamWriter(os);// pegar o char
		BufferedWriter bw = new BufferedWriter(osw);//pega a string
		
		for(Cliente x : lista) {
			bw.append(x.getNome() + "\n");
		}
		
		bw.close();
	}
	
	
}
