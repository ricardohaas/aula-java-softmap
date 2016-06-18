package edu.softmap.webservice;

public class UseWebservice {

	public static void main(String[] args) {
		edu.softmap.webservice.OiMundo port = new OiMundoService().getOiMundoPort();
		System.out.println(port.oi("Johann"));
	}
}
