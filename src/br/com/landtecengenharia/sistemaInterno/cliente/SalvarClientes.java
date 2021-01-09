package br.com.landtecengenharia.sistemaInterno.cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	
	public static void limparLista() {
		lista.clear();
	}
	
	
	public static void lerInformacoesBancoDosObjetos() throws IOException, ClassNotFoundException {
			File file = new File("BDClientes.ser");
			FileInputStream fileStream = new FileInputStream(file);
			ObjectInputStream os = new ObjectInputStream(fileStream);
			Cliente linha = null;
			while((linha = (Cliente)os.readObject()) != null) {
				lista.add((Cliente)linha);
			}
			os.close();
	}
	
	
	public static void salvarClientesBancoDosObjetos() throws IOException{
		File file = new File("BDClientes.ser");
		FileOutputStream fileStream = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		for(Cliente cliente : lista) {
			os.writeObject(cliente);
		}
		os.close();
	}
	
	public static void salvarListaDeclientesEmTexto() throws IOException {
		File file = new File("BDClientes.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bs = new BufferedWriter(fileWriter);
		for(Cliente cliente : lista) {
			bs.append("Nome:" + cliente.getNome() + "\n");
			bs.append("CNPJ:" + cliente.getCnpj() + "\n");
			bs.append("CPF:" + cliente.getCpf() + "\n");
			bs.append("Endereço:" + cliente.getEndereco() + "\n");
			bs.append("Cidade:" + cliente.getCidade() + "\n");
			bs.append("Estado:" + cliente.getEstado() + "\n----------------------\n");
		}
		salvarClientesBancoDosObjetos();
		bs.close();
	}
	
	
	
}
