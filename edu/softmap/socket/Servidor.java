package edu.softmap.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws Exception{
		Servidor s = new Servidor();
		s.inicia();

	}

	private void inicia() throws Exception {
		System.out.println("servidor criado");
		ServerSocket servidor = new ServerSocket(12345);
		while (true) {
			try {
				System.out.println("aguardando cliente");
				Socket conexao = servidor.accept();
				atendeCliente(conexao);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	private void atendeCliente(Socket conexao) 
			throws Exception {
			Atende atende = new Atende();
			atende.conexao = conexao;
			atende.start();
			
	}
	
	class Atende extends Thread {
		
		Socket conexao;
		
		@Override
		public void run() {
			try {
			InputStream is = conexao.getInputStream();
			byte[] lidos = new byte[10];
			is.read(lidos);
			Thread.sleep(10000);
			System.out.println("fim cliente " 
			+ new String(lidos));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
