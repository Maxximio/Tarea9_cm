package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Profesor;
import ec.edu.uce.repository.IProfesorRepo;

@Service
public class ProfesorServiceImpl implements IProfesorService{

	@Autowired
	private IProfesorRepo profeRepo;

	@Override
	public void InsertarProfesorServicio(Profesor profe) {
		// TODO Auto-generated method stub
		this.profeRepo.insertarProfesor(profe);
	}

	@Override
	public Profesor buscarProfesorServicio(Integer ci) {
		// TODO Auto-generated method stub
		return this.profeRepo.buscarProfesor(ci);
	}

	@Override
	public void actualizarProfesorServicio(Profesor profe) {
		// TODO Auto-generated method stub
		this.profeRepo.actualizarProfesor(profe);
	}

	@Override
	public void borrarProfesorServicio(Integer ci) {
		// TODO Auto-generated method stub
		this.profeRepo.borrarProfesor(ci);
	}

}
