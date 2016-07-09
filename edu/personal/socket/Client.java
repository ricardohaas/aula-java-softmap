package edu.personal.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Scanner sc;
	private Socket socketClient;
	
	public Client( Socket socketClient){
		this.setSocketClient(socketClient);
		this.listen();
	}

	public Socket getSocketClient() {
		return socketClient;
	}

	public void setSocketClient(Socket socketClient) {
		this.socketClient = socketClient;
	}
	
	public void listen(){
		try {
			sc = new Scanner( this.getSocketClient().getInputStream() );
		} catch (IOException e) {
		}
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("Thread has been planted!");
				while (sc.hasNextLine()) {
					String message = sc.nextLine();
					System.out.println(message);
				}
				sc.close();
			}
		}.start();
	}
}
