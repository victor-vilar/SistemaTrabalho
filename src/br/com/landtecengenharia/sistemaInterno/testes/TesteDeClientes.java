package br.com.landtecengenharia.sistemaInterno.testes;

import java.sql.SQLException;

import br.com.landtecengenharia.sistemaInterno.dao.ClienteDAO;
import br.com.landtecengenharia.sistemaInterno.factory.ConnectionBuilder;
import br.com.landtecengenharia.sistemaInterno.models.Cliente;
import br.com.landtecengenharia.sistemaInterno.models.Contato;

public class TesteDeClientes {

		public static void main(String[] args) {
			
			
			//novo cliente
			Cliente restaurante = new Cliente(
					"Restaurante a Mineira de Caxias",
					"084548636541");
			
			//novo contato
			Contato joaozin = new Contato("Joazin","joaozinmineirinho@minas.com.br");
			
			//mais outro contato
			Contato mariazin = new Contato("Mariazin","mariazinnmineirinho@minas.com.br");
		
			
			//adicionando contato cliente
			restaurante.addContato(joaozin);
			restaurante.addContato(mariazin);
			
			
			//novo endereco
			//Address endereco = new Address()
			
			
			try {
				
				//novo clienteDAO
				ClienteDAO clientedao = new ClienteDAO(new ConnectionBuilder().getConnection());

				//gravar no banco
				clientedao.salvar(restaurante);
				
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		

			
			
			
		}
}
