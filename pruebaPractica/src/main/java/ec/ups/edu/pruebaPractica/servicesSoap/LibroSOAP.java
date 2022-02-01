package ec.ups.edu.pruebaPractica.servicesSoap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.ups.edu.pruebaPractica.business.LibroONLocal;
import ec.ups.edu.pruebaPractica.model.Libro;

@WebService
public class LibroSOAP {
	
	@Inject
	private LibroONLocal libroON;
	
	@WebMethod
	public String crearLibro(Libro libro) {
		try {
			libroON.insertarLibro(libro);
			return "OK";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "ERROR";
		}
	}
	
	@WebMethod
	public List<Libro> getLibros(){
		return libroON.getLibros();
	}
}
