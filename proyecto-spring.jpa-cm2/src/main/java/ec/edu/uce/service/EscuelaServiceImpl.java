package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Escuela;
import ec.edu.uce.repository.IEscuelaRepo;

@Service
public class EscuelaServiceImpl implements IEscuelaService{

	@Autowired
	private IEscuelaRepo escuRepo;

	@Override
	public void InsertarEscuelaServicio(Escuela escuela) {
		// TODO Auto-generated method stub
		this.escuRepo.insertarEscuela(escuela);
	}

	@Override
	public Escuela buscarEscuelaServicio(String nombre) {
		// TODO Auto-generated method stub
		return this.escuRepo.buscarEscuela(nombre);
	}

	@Override
	public void actualizarEscuelaServicio(Escuela escuela) {
		// TODO Auto-generated method stub
		this.escuRepo.actualizarEscuela(escuela);
	}

	@Override
	public void borrarEscuelaServicio(String nombre) {
		// TODO Auto-generated method stub
		this.escuRepo.borrarEscuela(nombre);
	}

	

}
