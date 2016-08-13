package edu.softmap.objectStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GravaObjeto {

	public static void main(String[] args) throws Exception{
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente anderson = new Cliente();
		anderson.nome = "Kruger";
		anderson.endereco = "costa e silva";
		anderson.peso = 89;
		anderson.rg = 1234;
		clientes.add(anderson);
		clientes.add(anderson);
		clientes.add(anderson);
		clientes.add(anderson);
		clientes.add(anderson);
		clientes.add(anderson);
		
		File f = new File("C:\\Users\\Ricardo\\workspace-eclipse\\AulaSoftmap\\src\\edu\\softmap\\objectStream\\kruger.obj");
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(clientes);
		oos.close();
		System.out.println("fim");

	}

}
