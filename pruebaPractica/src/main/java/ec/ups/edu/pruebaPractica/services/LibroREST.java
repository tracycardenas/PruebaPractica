package ec.ups.edu.pruebaPractica.services;

import java.util.List;

import javax.inject.Inject;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ec.ups.edu.pruebaPractica.business.LibroONLocal;
import ec.ups.edu.pruebaPractica.model.Libro;

@Path("libros")
public class LibroREST {
	
	@Inject
	private LibroONLocal libroON;
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String crearLibro(Libro libro) {
		try {
			libroON.insertarLibro(libro);
			return "OK";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "ERROR";
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Libro> getLibros(){
		return libroON.getLibros();
	}
	
	@GET
	@Path("suma")
	@Produces(MediaType.APPLICATION_JSON)
	public double suma(@QueryParam("q")	double a,@QueryParam("b") double b) {
		return a+b;
	}
}
