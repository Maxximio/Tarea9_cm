package ec.edu.uce.service;

import ec.edu.uce.modelo.Profesor;

public interface IProfesorService {
	
	void InsertarProfesorServicio(Profesor profe);
	
	Profesor buscarProfesorServicio(Integer ci);
	
	void actualizarProfesorServicio(Profesor profe);
	
	void borrarProfesorServicio(Integer ci);
	
}
