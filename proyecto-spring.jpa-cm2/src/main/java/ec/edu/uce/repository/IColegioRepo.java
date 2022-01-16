package ec.edu.uce.repository;

import ec.edu.uce.modelo.Colegio;

public interface IColegioRepo {

	void insertarColegio(Colegio cole);
	
	Colegio buscarColegio(String nombre);
	
	void actualizarColegio(Colegio cole);
	
	void borrarColegio(String nombre);
	
}
