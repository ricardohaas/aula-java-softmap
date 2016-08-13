package edu.softmap.objectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LehObjeto {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		File f = new File("C:\\Users\\Ricardo\\workspace-eclipse\\AulaSoftmap\\src\\edu\\softmap\\objectStream\\kruger.obj");
		try{
			FileInputStream fin = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fin);
			clientes = (List<Cliente>) ois.readObject();
			for( Cliente c: clientes ){
				System.out.println( c.nome );
			}
			ois.close();
		}
		catch( Exception e){
			System.out.println( e.getMessage());
		}
		System.out.println("fim");

	}

}
