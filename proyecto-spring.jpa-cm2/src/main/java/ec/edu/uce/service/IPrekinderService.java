package ec.edu.uce.service;

import ec.edu.uce.modelo.Prekinder;

public interface IPrekinderService {
	
	void InsertarPrekinderServicio(Prekinder pre);
	
	Prekinder buscarPrekinderServicio(String nombre);
	
	void actualizarPrekinderServicio(Prekinder pre);
	
	void borrarPrekinderServicio(String nombre);
	
}
