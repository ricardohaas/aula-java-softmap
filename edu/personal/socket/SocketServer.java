package edu.personal.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocketServer {
	
	static List<Client> clients = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12346);
		System.out.println("Porta 12345 aberta!");
		
		while( true ){			
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " +   
					cliente.getInetAddress().getHostAddress()
					);
			
			Client client = new Client( cliente );
			clients.add( client );
		}
		
	}
	
	
	public static void shareMessage(String message){
		System.out.println( "Clientes conectados " + clients.size());
		//for (PrintStream client : clients) {
			//client.println("Mensagem para o cliente: " + client + message );
		//}
	}
}
