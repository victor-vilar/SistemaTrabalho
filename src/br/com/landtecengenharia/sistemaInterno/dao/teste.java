package br.com.landtecengenharia.sistemaInterno.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.landtecengenharia.sistemaInterno.factory.ConnectionBuilder;
import br.com.landtecengenharia.sistemaInterno.models.Cliente;

public class teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("LABORATORIO QUIMICO FARMACEUTICO DA AERONAUTICA","08454836000178");
		
		try(Connection con = new ConnectionBuilder().getConnection()) {
			ClienteDAO clienteDao = new ClienteDAO(con);
			clienteDao.salvar(cliente);
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
