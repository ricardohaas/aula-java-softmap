package edu.softmap;

import javax.swing.JOptionPane;

public class PainelValores {
	
	public static double pedeDecimal( String message){
		double decimal = 0;
		String resp = "";
		try{
			resp = JOptionPane.showInputDialog( message );
			if( resp.equals( "sair") ){
				System.out.println("Fechando programa");
				System.exit( 0 );
			}
			decimal = Double.parseDouble( resp );
		}
		catch(Exception ex){
			
			System.out.println( ex.getMessage());
			JOptionPane.showMessageDialog(null, "Valor inválido, digite 'sair' para fechar o programa");
			return PainelValores.pedeDecimal( message );
		}
		return decimal;
	}

	public static int pedeInteiro( String message) {
		int inteiro = 0;
		String resp = "";
		try{
			resp = JOptionPane.showInputDialog( message );
			if( resp.equals( "sair") ){
				System.out.println("Fechando programa");
				System.exit( 0 );
			}
			inteiro = Integer.parseInt( resp );
		}
		catch(Exception ex){
			
			System.out.println( ex.getMessage());
			JOptionPane.showMessageDialog(null, "Valor inválido, digite 'sair' para fechar o programa");
			return PainelValores.pedeInteiro( message );
		}
		return inteiro;
	}

	public static String pedeString( String message) {
		String resp = "";
		try{
			resp = JOptionPane.showInputDialog( message );
			if( resp == "" ){
				PainelValores.pedeString( message );
			}
			if( resp.equals( "sair") ){
				System.out.println("Fechando programa");
				System.exit( 0 );
			}
			
		}
		catch(Exception ex){
			
			System.out.println( ex.getMessage());
			JOptionPane.showMessageDialog(null, "Valor inválido, digite 'sair' para fechar o programa");
			PainelValores.pedeString( message );
		}
		
		return resp;
	}
}
