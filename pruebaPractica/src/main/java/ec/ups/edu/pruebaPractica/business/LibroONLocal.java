package ec.ups.edu.pruebaPractica.business;

import java.util.List;

import javax.ejb.Local;

import ec.ups.edu.pruebaPractica.model.Libro;

@Local
public interface LibroONLocal {
	public void insertarLibro(Libro p) throws Exception;
	public List<Libro> getLibros();
	public Libro buscarP(int id);

}
