package edu.softmap.bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	private Connection connection;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main(){
		this.conectar();
		//this.criarTabela();
		//this.inserir("Joao");
		//this.inserir("Marcos");
		//this.inserir("Ricardo");
		//this.inserir("Zenaide");
		this.remover("Ricardo");
	}
	
	private void remover(String nome) {
		try {
			Statement sql = this.connection.createStatement();
			sql.execute(
					"delete from x where y like'%" + nome + "%'"
			);
		} catch (SQLException e) {
			System.out.println("Delete table error: " + e.getMessage() );
		}
	}

	private void inserir( String nome ) {
		try {
			Statement sql = this.connection.createStatement();
			sql.execute(
					"insert into x values ('"+nome+"')"
			);
		} catch (SQLException e) {
			System.out.println("Insert table error: " + e.getMessage() );
		}
	}

	private void criarTabela() {
		try {
			Statement sql = this.connection.createStatement();
			sql.execute(
					"create table x (y varchar(10))"
			);
		} catch (SQLException e) {
			System.out.println("Create table error: " + e.getMessage() );
		}
		
	}

	private void conectar(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/softmap","softmap","softmap"
			);
		} catch (ClassNotFoundException e) {
			System.out.println("DB class not found");
			this.connection = null;
		}
		catch (SQLException e) {
			System.out.println("Sql exception");
			this.connection = null;
		}
	}

}
