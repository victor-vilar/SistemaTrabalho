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
	
	//salavando o cliente no banco
	public void salvar(Cliente cliente)throws SQLException {
		
		//setando sql
		con.setAutoCommit(false);
		String sql = "INSERT INTO CLIENTES(nome,cnpjcpf)VALUES(?,?)";
		
		//criando query
		try(PreparedStatement query = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
			
			//setando as variaveis
			query.setString(1, cliente.getNome());
			query.setString(2, cliente.getCpfCnpj());
			
			//executando
			query.execute();
			con.commit();
			
			
			//se a lista de contatos for maior que zero
			if(cliente.ContatosTamanho() > 0) {
				
				//pegara o id criado no banco
				try(ResultSet rst = query.getGeneratedKeys()){
					
					//iterando sobre os codigos
					while(rst.next()) {
						int idCliente = rst.getInt(1);
					
						// chamara metodo para gravar os contatos
						gravarContatoDoCliente(idCliente, cliente);
					}

				}
			}
			//----------------------
			
			
			//se a lista de endereços for maior que zero
			if(cliente.enderecosTamanho() > 0 ) {
				
			}
			//-----------------------
			
		}catch(SQLException e ) {
			System.out.println(e.getMessage());
			con.rollback();
		}
		
	}
	
	//deletando cliente por id
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
	
	
	//gravar os contatos do cliente
	public void gravarContatoDoCliente(int id, Cliente cliente) throws SQLException {
		
		//setando sql
		String sql = "INSERT INTO CONTATOS(nome,telefone,email,id_cliente)"
				+ "values(?,?,?,?)";
		
		
		//setando query
		try(PreparedStatement query = con.prepareStatement(sql)){
			con.setAutoCommit(false);
			
			//fazendo loop em cada um dos contatos
			for(int x = 0; x < cliente.ContatosTamanho(); x++ ) {
				
				//colocando as informações
				query.setString(1,cliente.contatosPosicao(x).getName());
				query.setString(2,cliente.contatosPosicao(x).getTelefone());
				query.setString(3,cliente.contatosPosicao(x).getEmail());
				query.setInt(4,id);
				query.execute();	
			
			}
			
			//commitando query
			con.commit();
	
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			con.rollback();
		}
	}
	
	
}
