package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Jardin;
import ec.edu.uce.repository.IJardinRepo;

@Service
public class JardinServiceImpl implements IJardinService{

	@Autowired
	private IJardinRepo jardinRepo;

	@Override
	public void InsertarJardinServicio(Jardin jardin) {
		// TODO Auto-generated method stub
		this.jardinRepo.insertarJardin(jardin);
	}

	@Override
	public Jardin buscarJardinServicio(String nombre) {
		// TODO Auto-generated method stub
		return this.jardinRepo.buscarJardin(nombre);
	}

	@Override
	public void actualizarJardinServicio(Jardin jardin) {
		// TODO Auto-generated method stub
		this.jardinRepo.actualizarJardin(jardin);
	}

	@Override
	public void borrarJardinServicio(String nombre) {
		// TODO Auto-generated method stub
		this.jardinRepo.borrarJardin(nombre);
	}

	

}
