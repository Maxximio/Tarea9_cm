package ec.edu.uce.service;

import ec.edu.uce.modelo.PersonalAdicional;

public interface IPersonalAdicionalService {
	
	void InsertarPersonalAdicionalServicio(PersonalAdicional personal);
	
	PersonalAdicional buscarPersonalAdicionalServicio(Integer id);
	
	void actualizarPersonalAdicionalServicio(PersonalAdicional personal);
	
	void borrarPersonalAdicionalServicio(Integer id);
	
}
