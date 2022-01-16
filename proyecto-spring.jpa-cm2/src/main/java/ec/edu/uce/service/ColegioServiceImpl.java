package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Colegio;
import ec.edu.uce.repository.IColegioRepo;

@Service
public class ColegioServiceImpl implements IColegioService{

	@Autowired
	private IColegioRepo coleRepo;

	@Override
	public void InsertarColegioServicio(Colegio cole) {
		// TODO Auto-generated method stub
		this.coleRepo.insertarColegio(cole);
	}

	@Override
	public Colegio buscarAutobusServicio(String nombre) {
		// TODO Auto-generated method stub
		return this.coleRepo.buscarColegio(nombre);
	}

	@Override
	public void actualizarColegioServicio(Colegio cole) {
		// TODO Auto-generated method stub
		this.coleRepo.actualizarColegio(cole);
	}

	@Override
	public void borrarColegioServicio(String nombre) {
		// TODO Auto-generated method stub
		this.coleRepo.borrarColegio(nombre);
	}


	

}
