package ec.edu.uce.service;

import ec.edu.uce.modelo.Representante;

public interface IRepresententeService {
	
	void InsertarRepresentanteServicio(Representante rep);
	
	Representante buscarRepresentanteServicio(Integer ci);
	
	void actualizarRepresentanteServicio(Representante rep);
	
	void borrarRepresentanteServicio(Integer ci);
	
}
