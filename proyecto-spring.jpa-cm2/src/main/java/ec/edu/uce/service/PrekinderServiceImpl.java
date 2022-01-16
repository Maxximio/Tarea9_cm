package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Prekinder;
import ec.edu.uce.repository.IPreKinderRepo;

@Service
public class PrekinderServiceImpl implements IPrekinderService{

	@Autowired
	private IPreKinderRepo preRepo;

	@Override
	public void InsertarPrekinderServicio(Prekinder pre) {
		// TODO Auto-generated method stub
		this.preRepo.insertarPreKinder(pre);
	}

	@Override
	public Prekinder buscarPrekinderServicio(String nombre) {
		// TODO Auto-generated method stub
		return this.preRepo.buscarPreKinder(nombre);
	}

	@Override
	public void actualizarPrekinderServicio(Prekinder pre) {
		// TODO Auto-generated method stub
		this.preRepo.actualizarPreKinder(pre);
	}

	@Override
	public void borrarPrekinderServicio(String nombre) {
		// TODO Auto-generated method stub
		this.preRepo.borrarPreKinder(nombre);
	}


}
