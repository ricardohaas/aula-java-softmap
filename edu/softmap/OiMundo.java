package edu.softmap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import edu.softmap.webservice.*;

@WebService
public class OiMundo {
   
  @WebMethod
  public String oi(String nome) {
    return "Hallo " + nome;
  }
}