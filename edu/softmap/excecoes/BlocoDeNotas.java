package edu.softmap.excecoes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BlocoDeNotas extends JFrame{

	JButton ler = new JButton("ler");
	JTextArea textArea = new JTextArea();

	public BlocoDeNotas() {
		ler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lerArquivo();
			}

		});
		getContentPane().add(ler, BorderLayout.SOUTH);
		getContentPane().add(textArea, BorderLayout.CENTER);
	}
	private void lerArquivo() {
		try {
			byte[] parte = lerAqrquivo2();
			textArea.setText(new String(parte));
		} catch (FileNotFoundException e) {
           	textArea.setText(e.getMessage());	
           	
		} catch (IOException e) {
			textArea.setText(e.getMessage());	
       	}
		
	}
	private byte[] lerAqrquivo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\java_sabado\\eclipse\\eclipse.inix");
		byte[] parte = new byte[100];
		fis.read(parte);
		fis.close();
		return parte;
	}
	
	public static void main(String[] args) {
		BlocoDeNotas notas = new BlocoDeNotas();
		notas.pack();
		notas.setVisible(true);

	}

}
