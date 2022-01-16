package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	void InsertarEstudianteServicio(Estudiante estu);
	
	Estudiante buscarEstudianteServicio(Integer ci);
	
	void actualizarEstudianteServicio(Estudiante estu);
	
	void borrarEstudianteServicio(Integer ci);
	
}
