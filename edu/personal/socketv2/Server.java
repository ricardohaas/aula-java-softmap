package edu.personal.socketv2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	private int port;
	private List<PrintStream> clients;
	
	public Server(int port) {
		this.port = port;
		this.clients = new ArrayList<PrintStream>();
	}

	public static void main(String[] args) throws IOException {
		new Server(12345).execute();
	}
	
	private void execute() throws IOException {
		ServerSocket server = new ServerSocket( this.port );
		System.out.println( "Porta " + this.port + "aberta!" );
		
		while( true ){
			Socket client = server.accept();
			System.out.println( "Nova conexão" );
			
			PrintStream ps = new PrintStream( client.getOutputStream() );
			this.clients.add( ps );
			
			//Client c
		}
	}

	public void shareMessage(String nextLine) {
		
	}

}
