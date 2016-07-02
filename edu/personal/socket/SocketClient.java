package edu.personal.socket;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class SocketClient {
	public static void main(String[] args) 
	           throws UnknownHostException, IOException {

	     Socket cliente = new Socket("127.0.0.1", 12346);

	     System.out.println("O cliente se conectou ao servidor!");

	     Scanner teclado = new Scanner(System.in);
	     PrintStream saida = new PrintStream(cliente.getOutputStream());
	     Scanner socketInputStream = new Scanner(cliente.getInputStream());
	     
	     listenClient( socketInputStream );

	     
	     while (teclado.hasNextLine()) {
	       saida.println(teclado.nextLine());
	     }

	     saida.close();
	     teclado.close();
	     cliente.close();
	}
	
	public static void listenClient( Scanner s){
		Scanner sc = s;
		new Thread() {
			
			@Override
			public void run() {
				System.out.println("Thread has been planted 2!");
				while (sc.hasNextLine()) {
					String message = s.nextLine();
					System.out.println( "From Server: " + message);
				}
				s.close();
			}
		}.start();
	}
}
