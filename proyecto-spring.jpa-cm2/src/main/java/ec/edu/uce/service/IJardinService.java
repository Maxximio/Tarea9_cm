package ec.edu.uce.service;

import ec.edu.uce.modelo.Jardin;

public interface IJardinService {
	
	void InsertarJardinServicio(Jardin jardin);
	
	Jardin buscarJardinServicio(String nombre);
	
	void actualizarJardinServicio(Jardin jardin);
	
	void borrarJardinServicio(String nombre);
	
}
