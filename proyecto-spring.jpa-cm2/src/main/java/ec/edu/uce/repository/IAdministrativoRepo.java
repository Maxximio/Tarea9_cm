package ec.edu.uce.repository;

import ec.edu.uce.modelo.Administrativo;

public interface IAdministrativoRepo {

	void insertarAdministrativo(Administrativo admin);
	
	Administrativo buscarAdministrativo(Integer ci);
	
	void actualizarAdministrativo(Administrativo admin);
	
	void borrarAdministrativo(Integer ci);
	
}
