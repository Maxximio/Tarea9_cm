package ec.edu.uce.service;

import ec.edu.uce.modelo.Escuela;

public interface IEscuelaService {
	
	void InsertarEscuelaServicio(Escuela escuela);
	
	Escuela buscarEscuelaServicio(String nombre);
	
	void actualizarEscuelaServicio(Escuela escuela);
	
	void borrarEscuelaServicio(String nombre);
	
}
