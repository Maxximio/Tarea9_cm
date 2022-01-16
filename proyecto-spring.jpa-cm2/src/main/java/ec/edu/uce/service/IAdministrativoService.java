package ec.edu.uce.service;

import ec.edu.uce.modelo.Administrativo;

public interface IAdministrativoService {
	
	void InsertarPacienteServicio(Administrativo admin);
	
	Administrativo buscarPacienteServicio(Integer ci);
	
	void actualizarPacienteServicio(Administrativo admin);
	
	void borrarPacienteServicio(Integer ci);
	
}
