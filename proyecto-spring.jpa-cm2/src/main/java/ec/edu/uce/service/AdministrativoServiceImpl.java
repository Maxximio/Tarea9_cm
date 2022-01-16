package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.repository.IAdministrativoRepo;

@Service
public class AdministrativoServiceImpl implements IAdministrativoService{

	@Autowired
	private IAdministrativoRepo adminRepo;

	@Override
	public void InsertarPacienteServicio(Administrativo admin) {
		// TODO Auto-generated method stub
		this.adminRepo.insertarAdministrativo(admin);
	}

	@Override
	public Administrativo buscarPacienteServicio(Integer ci) {
		// TODO Auto-generated method stub
		return this.adminRepo.buscarAdministrativo(ci);
	}

	@Override
	public void actualizarPacienteServicio(Administrativo admin) {
		// TODO Auto-generated method stub
		this.adminRepo.actualizarAdministrativo(admin);
	}

	@Override
	public void borrarPacienteServicio(Integer ci) {
		// TODO Auto-generated method stub
		this.adminRepo.borrarAdministrativo(ci);
	}
}
