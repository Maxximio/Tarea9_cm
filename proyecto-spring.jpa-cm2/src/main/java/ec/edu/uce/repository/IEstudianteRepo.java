package ec.edu.uce.repository;

import ec.edu.uce.modelo.Estudiante;
public interface IEstudianteRepo {

	void insertarEstudiante(Estudiante estu);
	
	Estudiante buscarEstudiante(Integer ci);
	
	void actualizarEstudiante(Estudiante estu);
	
	void borrarEstudiante(Integer ci);
	
}

