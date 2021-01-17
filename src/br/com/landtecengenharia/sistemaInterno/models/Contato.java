package br.com.landtecengenharia.sistemaInterno.models;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	//required
	private String name;
	private String email;
	
	//optional
	private String cargo;
	private String telefone;
	
	public Contato(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void CadastrarTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	
}
