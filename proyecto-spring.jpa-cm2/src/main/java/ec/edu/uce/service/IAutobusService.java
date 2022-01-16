package ec.edu.uce.service;

import ec.edu.uce.modelo.Autobus;

public interface IAutobusService {
	
	void InsertarAutobusServicio(Autobus auto);
	
	Autobus buscarAutobusServicio(String matricula);
	
	void actualizarAutobusServicio(Autobus auto);
	
	void borrarAutobusServicio(String matricula);
	
}
