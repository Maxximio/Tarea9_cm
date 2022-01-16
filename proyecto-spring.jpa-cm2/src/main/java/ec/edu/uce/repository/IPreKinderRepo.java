package ec.edu.uce.repository;

import ec.edu.uce.modelo.Prekinder;

public interface IPreKinderRepo {

	void insertarPreKinder(Prekinder pre);
	
	Prekinder buscarPreKinder(String nombre);
	
	void actualizarPreKinder(Prekinder pre);
	
	void borrarPreKinder(String nombre);
	
}
