package br.com.landtecengenharia.sistemaInterno.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.landtecengenharia.sistemaInterno.entities.Cliente;
import br.com.landtecengenharia.sistemaInterno.factory.ConnectionBuilder;

public class teste {

	public static void main(String[] args) {
		//Cliente cliente = new Cliente("adfadfadfadf","08454836000178");
		
		try(Connection con = new ConnectionBuilder().getConnection()) {
			ClienteDAO clienteDao = new ClienteDAO(con);
			clienteDao.deletar(2);
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
