package edu.softmap.interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.CardLayout;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class MyWindow extends JFrame {

	private JPanel contentPane;
	private JTextField resultField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow frame = new MyWindow();
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
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		setContentPane(contentPane);
		JPanel keysPane = new JPanel();
		JPanel keysPaneLine1 = new JPanel();
		JPanel keysPaneLine2 = new JPanel();
		JPanel keysPaneLine3 = new JPanel();
		JPanel keysPaneLine4 = new JPanel();
		
		contentPane.add(keysPane);
		
		JButton btnNine = new JButton("9");
		JButton btnEight = new JButton("8");
		JButton btnSeven = new JButton("7");
		JButton btnSix = new JButton("6");
		JButton btnFive = new JButton("5");
		JButton btnFour = new JButton("4");
		JButton btnThree = new JButton("3");
		JButton btnTwo = new JButton("2");
		JButton btnOne = new JButton("1");
		JButton btnZero = new JButton("0");
		JButton btnPlus = new JButton("+");
		JButton btnMinus = new JButton("-");
		JButton btnMult = new JButton("*");
		JButton btnDivide = new JButton("/");
		JButton btnComma = new JButton(".");
		JButton btnResult = new JButton("=");
		JButton btnClear = new JButton("C");
		keysPane.setLayout(new GridLayout(5, 1 ));
		keysPaneLine1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel resultPane = new JPanel();
		//resultPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		keysPane.add(resultPane);
		
		keysPaneLine1.add(btnNine);
		keysPaneLine1.add(btnEight);
		keysPaneLine1.add(btnSeven);
		keysPaneLine1.add(btnPlus);
		keysPane.add( keysPaneLine1 );
		
		keysPaneLine2.add(btnSix);
		keysPaneLine2.add(btnFive);
		keysPaneLine2.add(btnFour);
		keysPaneLine2.add(btnMinus);
		keysPane.add( keysPaneLine2 );
		
		keysPaneLine3.add(btnThree);
		keysPaneLine3.add(btnTwo);
		keysPaneLine3.add(btnOne);
		keysPaneLine3.add(btnMult);
		keysPane.add( keysPaneLine3 );
		
		keysPaneLine4.add( btnZero );
		keysPaneLine4.add( btnDivide );
		keysPaneLine4.add( btnComma );
		keysPaneLine4.add( btnResult );
		keysPaneLine4.add( btnClear );
		keysPane.add( keysPaneLine4 );
		
		
		resultPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		resultField = new JTextField();
		resultField.setHorizontalAlignment(SwingConstants.CENTER);
		resultPane.add(resultField);
		resultPane.add(resultField);
		resultField.setColumns(20);
		
		
		btnNine.addActionListener( new Manipuladorbotao( this ));
		btnEight.addActionListener( new Manipuladorbotao( this ));
		btnSeven.addActionListener( new Manipuladorbotao( this ));
		btnSix.addActionListener( new Manipuladorbotao( this ));
		btnFive.addActionListener( new Manipuladorbotao( this ));
		btnFour.addActionListener( new Manipuladorbotao( this ));
		btnThree.addActionListener( new Manipuladorbotao( this ));
		btnTwo.addActionListener( new Manipuladorbotao( this ));
		btnOne.addActionListener( new Manipuladorbotao( this ));
		btnZero.addActionListener( new Manipuladorbotao( this ));
		btnDivide.addActionListener( new Manipuladorbotao( this ));
		btnComma.addActionListener( new Manipuladorbotao( this ));
		btnPlus.addActionListener( new Manipuladorbotao( this ));
		btnMinus.addActionListener( new Manipuladorbotao( this ));
		btnMult.addActionListener( new Manipuladorbotao( this ));
		btnResult.addActionListener( new Manipuladorbotao( this ));
		btnClear.addActionListener( new Manipuladorbotao( this ));
	}
	
	public void addItem(String item){
		resultField.setText( resultField.getText()+item);
	}
	
	public void processResult(){
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			Object result = engine.eval(resultField.getText());
			resultField.setText( result.toString() );
		} catch (ScriptException e) {
			resultField.setText( "Error" );
		}
	}

	public void clearResult() {
		System.out.println("clearResult");
		resultField.setText("");
	}
	
}
