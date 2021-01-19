package br.com.landtecengenharia.sistemaInterno.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionBuilder {
	private DataSource dataSource;
	
	public ConnectionBuilder() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl( "jdbc:postgresql://localhost/landtec" );
		cpds.setUser("postgres");                                  
		cpds.setPassword("231090");
		this.dataSource = cpds;
	}
	
	public Connection getConnection()throws SQLException {
		return this.dataSource.getConnection();
	}
	
	
	
	
}
