package edu.softmap;

import javax.xml.ws.Endpoint;

public class PublishWebsevice {
	public static void main(String[] args){
	    OiMundo service = new OiMundo();
	    Endpoint endpoint = Endpoint.publish("http://localhost:8081/oi", service);
	    System.out.println(endpoint);
	}
}
