package br.com.landtecengenharia.sistemaInterno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.landtecengenharia.sistemaInterno.models.Cliente;

public class ClienteDAO {

	private Connection con;
	
	public ClienteDAO(Connection con) {
		this.con = con;

	}
	
	public void salvar(Cliente cliente)throws SQLException {
		con.setAutoCommit(false);
		String sql = "INSERT INTO CLIENTES(nome,cnpjcpf)VALUES(?,?)";
		
		try(PreparedStatement query = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
			query.setString(1, cliente.getNome());
			query.setString(2, cliente.getCpfCnpj());
			query.execute();
			con.commit();
			
			try(ResultSet rst = query.getGeneratedKeys()){
				while(rst.next()) {
					System.out.println("Cliente salvo no banco: ");
					System.out.println(rst.getString(2));
				}
			}
			
		}catch(SQLException e ) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void deletar(int id) throws SQLException{
		con.setAutoCommit(false);
		String sql = "DELETE FROM CLIENTES WHERE ID = ?";
		try(PreparedStatement query = con.prepareStatement(sql)){
			query.setInt(1, id);
			query.execute();
			con.commit();
			
		}catch(SQLException e) {
			con.rollback();
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
