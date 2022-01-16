package ec.edu.uce.repository;

import ec.edu.uce.modelo.Autobus;

public interface IAutobusRepo {

	void insertarAutobus(Autobus auto);
	
	Autobus buscarAutobus(String matricula);
	
	void actualizarAutobus(Autobus auto);
	
	void borrarAutobus(String matricula);
	
}
