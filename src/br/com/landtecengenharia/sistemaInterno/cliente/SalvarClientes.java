package br.com.landtecengenharia.sistemaInterno.cliente;
import java.io.BufferedReader;
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
		
		InputStream is = new FileInputStream("BDClientes.txt");
		InputStreamReader isr = new InputStreamReader(is); 
		BufferedReader inp = new BufferedReader(isr);
		//lista.append(inp.readLine());
		
		
		System.out.println(inp.readLine());
		System.out.println(inp.readLine());
			
	}
	
	public static void salvarClientesBanco() throws IOException{
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			os = new FileOutputStream("BDClientes.txt");// le os bytes do arquivo
			osw= new OutputStreamWriter(os);// transforma em char
			bw = new BufferedWriter(osw);//transforma em string		
			for(Cliente x : lista) {
				bw.append("Nome: " + x.getNome() + " - CPF:" +x.getCpf() + " - CNPJ: " + x.getCnpj() + "\n");
			}
			bw.close();
		
		}catch(IOException ex) {
			System.out.println(ex);
		
		}finally {
			bw.close();
		}
	}
	
	
}
