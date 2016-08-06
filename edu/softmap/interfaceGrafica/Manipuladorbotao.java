package edu.softmap.interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Manipuladorbotao implements ActionListener {
	MyWindow calcPanel;
	
	public Manipuladorbotao( MyWindow calcPanel ){
		this.calcPanel = calcPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton eventButton = (JButton)e.getSource();
		
		switch( eventButton.getText() ){
			case "=":
				calcPanel.processResult();
				break;
			case "C":
				calcPanel.clearResult();
				break;
			default:
				calcPanel.addItem(eventButton.getText() );
		}
	}
}
