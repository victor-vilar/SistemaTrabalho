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
				
				//pegando o id do cliente gerado
				try(ResultSet rst = query.getGeneratedKeys()){
					
					
					//enquanto houver endereços
					while(rst.next()) {
						
						//capiturando id do cliente
						int idCliente = rst.getInt(1);
					
						//gravar os enderecos dos clientes
						gravarEnderecosCliente(idCliente, cliente);
					}	

				}
			}
			
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
	
	
	public void gravarEnderecosCliente(int id , Cliente cliente) throws SQLException {
		
		
		//criando string
		String sql = "INSERT INTO ENDERECOS("
				+ "endereco,numero,cidade,estado,complemento,cep,principal)"
				+ "VALUES(?,?,?,?,?,?,?)";
		
				
				
		//criando prepared statement
		try(PreparedStatement query = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
			
			//para cada endereço do cliente ira incluir no sql
			for(int x = 0; x < cliente.enderecosTamanho() ; x++) {
				
				//endereço
				query.setString(1, cliente.enderecoPosicao(x).getEndereco());
				
				//numero
				query.setString(2, cliente.enderecoPosicao(x).getNumero());
				
				//cidade
				query.setString(3, cliente.enderecoPosicao(x).getCidade());
				
				//estado
				query.setString(4, cliente.enderecoPosicao(x).getEstado());
				
				//complemento
				query.setString(5, cliente.enderecoPosicao(x).getComplemento());
				
				//cep
				query.setString(6, cliente.enderecoPosicao(x).getCep());
				
				//endereço principal
				query.setBoolean(7, cliente.enderecoPosicao(x).isPrincipal());
				
				//executando query
				query.execute();
			}
		
			//commitando alterçaões
		
		}catch(SQLException e) {
			con.rollback();
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
