package ec.edu.uce.repository;

import ec.edu.uce.modelo.Profesor;

public interface IProfesorRepo {

	void insertarProfesor(Profesor profe);
	
	Profesor buscarProfesor(Integer ci);
	
	void actualizarProfesor(Profesor profe);
	
	void borrarProfesor(Integer ci);
	
}

