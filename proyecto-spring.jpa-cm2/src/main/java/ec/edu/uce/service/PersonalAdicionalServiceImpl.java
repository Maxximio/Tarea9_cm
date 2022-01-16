package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.PersonalAdicional;
import ec.edu.uce.repository.IPersonalAdicionalRepo;

@Service
public class PersonalAdicionalServiceImpl implements IPersonalAdicionalService{

	@Autowired
	private IPersonalAdicionalRepo personalRepo;

	@Override
	public void InsertarPersonalAdicionalServicio(PersonalAdicional personal) {
		// TODO Auto-generated method stub
		this.personalRepo.insertarPersonalAdicional(personal);
	}

	@Override
	public PersonalAdicional buscarPersonalAdicionalServicio(Integer id) {
		// TODO Auto-generated method stub
		return this.personalRepo.buscarPersonalAdicional(id);
	}

	@Override
	public void actualizarPersonalAdicionalServicio(PersonalAdicional personal) {
		// TODO Auto-generated method stub
		this.personalRepo.actualizarPersonalAdicional(personal);
	}

	@Override
	public void borrarPersonalAdicionalServicio(Integer id) {
		// TODO Auto-generated method stub
		this.personalRepo.borrarPersonalAdicional(id);
	}

	
}
