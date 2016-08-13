package edu.softmap.socket;

import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClienteSocket {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			long in = System.currentTimeMillis();
			Socket conexao = new Socket("localhost",12345);
			String nome = "joao" + i;
			OutputStream os = conexao.getOutputStream();
			os.write(nome.getBytes());
			Thread.sleep(1000);
			long f = System.currentTimeMillis();
			System.out.println("fim cliente " +nome+" tempo "+ (f-in));
			
		}
	}
	
}
