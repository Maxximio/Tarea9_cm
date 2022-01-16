package ec.edu.uce.repository;

import ec.edu.uce.modelo.Jardin;

public interface IJardinRepo {

	void insertarJardin(Jardin jardin);
	
	Jardin buscarJardin(String nombre);
	
	void actualizarJardin(Jardin jardin);
	
	void borrarJardin(String nombre);
	
}

