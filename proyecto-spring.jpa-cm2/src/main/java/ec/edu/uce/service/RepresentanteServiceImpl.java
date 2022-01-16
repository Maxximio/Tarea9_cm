package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Representante;
import ec.edu.uce.repository.IRepresentanteRepo;

@Service
public class RepresentanteServiceImpl implements IRepresententeService{

	@Autowired
	private IRepresentanteRepo repRepo;

	@Override
	public void InsertarRepresentanteServicio(Representante rep) {
		// TODO Auto-generated method stub
		this.repRepo.insertarRepresentante(rep);
	}

	@Override
	public Representante buscarRepresentanteServicio(Integer ci) {
		// TODO Auto-generated method stub
		return this.repRepo.buscarRepresentante(ci);
	}

	@Override
	public void actualizarRepresentanteServicio(Representante rep) {
		// TODO Auto-generated method stub
		this.repRepo.actualizarRepresentante(rep);
	}

	@Override
	public void borrarRepresentanteServicio(Integer ci) {
		// TODO Auto-generated method stub
		this.repRepo.borrarRepresentante(ci);
	}

	

}
