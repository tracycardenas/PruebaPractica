package ec.ups.edu.pruebaPractica.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.pruebaPractica.dao.LibroDAO;
import ec.ups.edu.pruebaPractica.model.Libro;

@Stateless
public class LibroON implements LibroONLocal {
	
	@Inject
	private LibroDAO libroDao;
	
	public void insertarLibro(Libro p) throws Exception {
		libroDao.insert(p);	
	}
	
	public List<Libro> getLibros(){
		return libroDao.getList();
	}
	
	public Libro buscarP(int id) {
		Libro p = libroDao.read(id);
		return p;
	}
}
