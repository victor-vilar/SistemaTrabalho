package br.com.landtecengenharia.sistemaInterno.cliente;
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
		InputStream is = new FileInputStream("BDClientes.txt");// le os bytes do arquivo
		//transforma o texto em char, ou seja em cada letra // transforma em texto
		InputStreamReader isr = new InputStreamReader(is); //pega a string
		
		System.out.println(is);
			
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
