package ec.edu.uce.repository;

import ec.edu.uce.modelo.PersonalAdicional;

public interface IPersonalAdicionalRepo {

	void insertarPersonalAdicional(PersonalAdicional person);
	
	PersonalAdicional buscarPersonalAdicional(Integer id);
	
	void actualizarPersonalAdicional(PersonalAdicional person);
	
	void borrarPersonalAdicional(Integer id);
	
}

