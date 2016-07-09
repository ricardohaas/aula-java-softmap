package edu.personal.socketv2;

import java.io.InputStream;
import java.util.Scanner;

public class Client implements Runnable {
	private InputStream client;
	private Server server;
	
	public Client( InputStream client, Server server){
		this.client = client;
		this.server = server;
	} 
	
	@Override
	public void run() {
		Scanner s = new Scanner( this.client );
		while( s.hasNextLine() ){
			server.shareMessage( s.nextLine() );
		}
		s.close();
	}

}
