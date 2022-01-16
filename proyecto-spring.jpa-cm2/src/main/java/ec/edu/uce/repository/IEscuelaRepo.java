package ec.edu.uce.repository;

import ec.edu.uce.modelo.Escuela;

public interface IEscuelaRepo {

	void insertarEscuela(Escuela escuela);
	
	Escuela buscarEscuela(String nombre);
	
	void actualizarEscuela(Escuela escuela);
	
	void borrarEscuela(String nombre);
	
}
