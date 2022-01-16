package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Autobus;
import ec.edu.uce.repository.IAutobusRepo;

@Service
public class AutobusServiceImpl implements IAutobusService{

	@Autowired
	private IAutobusRepo autoRepo;

	@Override
	public void InsertarAutobusServicio(Autobus auto) {
		// TODO Auto-generated method stub
		this.autoRepo.insertarAutobus(auto);
	}

	@Override
	public Autobus buscarAutobusServicio(String matricula) {
		// TODO Auto-generated method stub
		return this.autoRepo.buscarAutobus(matricula);
	}

	@Override
	public void actualizarAutobusServicio(Autobus auto) {
		// TODO Auto-generated method stub
		this.autoRepo.actualizarAutobus(auto);
	}

	@Override
	public void borrarAutobusServicio(String matricula) {
		// TODO Auto-generated method stub
		this.autoRepo.borrarAutobus(matricula);
	}

	
}