package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void InsertarPacienteServicio(Paciente paciente) {
		
		this.pacienteRepo.insertarPaciente(paciente);
	}

	@Override
	public Paciente buscarPacienteServicio(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPaciente(id);
	}

	@Override
	public void actualizarPacienteServicio(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.actualizarPaciente(paciente);
	}

	@Override
	public void borrarPacienteServicio(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepo.borrarPaciente(id);
	}

}
