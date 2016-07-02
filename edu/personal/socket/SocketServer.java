package edu.personal.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocketServer {
	
	static List<PrintStream> clients = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12346);
		System.out.println("Porta 12345 aberta!");
		
		while( true ){			
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " +   
					cliente.getInetAddress().getHostAddress()
					);
			
			Scanner s = new Scanner(cliente.getInputStream());
			PrintStream clientOut = new PrintStream(cliente.getOutputStream());			
			clients.add(clientOut );
			listenClient( s );
		}
		
	}
	
	public static void listenClient( Scanner s){
		Scanner sc = s;
		new Thread() {
			
			@Override
			public void run() {
				System.out.println("Thread has been planted!");
				while (sc.hasNextLine()) {
					String message = s.nextLine();
					System.out.println(message);
					shareMessage( message );
				}
				s.close();
//				servidor.close();
//				cliente.close();
			}
		}.start();
	}
	
	public static void shareMessage(String message){
		System.out.println( "clients size" + clients.size());
		for (PrintStream client : clients) {
			client.println("Mensagem para o cliente: " + message );
		}
	}
}
