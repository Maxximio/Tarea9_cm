package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estuRepo;

	@Override
	public void InsertarEstudianteServicio(Estudiante estu) {
		// TODO Auto-generated method stub
		this.estuRepo.insertarEstudiante(estu);
	}

	@Override
	public Estudiante buscarEstudianteServicio(Integer ci) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarEstudiante(ci);
	}

	@Override
	public void actualizarEstudianteServicio(Estudiante estu) {
		// TODO Auto-generated method stub
		this.estuRepo.actualizarEstudiante(estu);
	}

	@Override
	public void borrarEstudianteServicio(Integer ci) {
		// TODO Auto-generated method stub
		this.estuRepo.borrarEstudiante(ci);
	}

}
