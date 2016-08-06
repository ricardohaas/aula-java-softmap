package edu.softmap.exercicio36;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;
import java.awt.FlowLayout;

public class Editor extends JFrame {

	private JPanel contentPane;
	private JTextArea editorContent;
	private JTextField characterCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor frame = new Editor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Editor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		editorContent = new JTextArea();
		editorContent.setColumns(35);
		editorContent.setRows(5);
		characterCount = new JTextField();
		characterCount.setColumns(15);
		characterCount.setToolTipText("Total de caracteres");
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add( editorContent );
		contentPane.add( characterCount );
		setContentPane(contentPane);
		
		ThreadContador t = new ThreadContador( this );
		t.start();
	}
	
	public int getContentLenght(){
		return editorContent.getText().length();
	}
	
	public void setCharacterCount( String text){
		characterCount.setText( text );
	}
}
