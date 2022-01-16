package ec.edu.uce.repository;

import ec.edu.uce.modelo.Representante;

public interface IRepresentanteRepo {

	void insertarRepresentante(Representante rep);
	
	Representante buscarRepresentante(Integer ci);
	
	void actualizarRepresentante(Representante rep);
	
	void borrarRepresentante(Integer ci);
	
}

