package ec.edu.uce.service;

import ec.edu.uce.modelo.Colegio;

public interface IColegioService {
	
	void InsertarColegioServicio(Colegio cole);
	
	Colegio buscarAutobusServicio(String nombre);
	
	void actualizarColegioServicio(Colegio cole);
	
	void borrarColegioServicio(String nombre);
	
}
