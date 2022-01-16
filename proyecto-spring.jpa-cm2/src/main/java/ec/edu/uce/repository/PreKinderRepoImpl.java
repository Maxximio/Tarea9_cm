package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Colegio;
import ec.edu.uce.modelo.Prekinder;

@Repository
public class PreKinderRepoImpl implements IPreKinderRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarPreKinder(Prekinder pre) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {pre.getNombre(),pre.getUbicacion(),pre.getNumEstudiantes(),pre.getNumProfesores(),pre.getTipo()};
		this.jdbcTemplate.update("insert into prekinder(nombre,ubicacion,numestudiantes,numprofesores,tipo) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Prekinder buscarPreKinder(String nombre) {
		Object[] datoABuscar =new Object[] {nombre};
		return this.jdbcTemplate.queryForObject("select * from prekinder where nombre=?",datoABuscar,new BeanPropertyRowMapper<Prekinder>(Prekinder.class));
	}

	@Override
	public void actualizarPreKinder(Prekinder pre) {
		Object[] datosAActualizar =new Object[] {pre.getNombre(),pre.getUbicacion(),pre.getNumEstudiantes(),pre.getNumProfesores(),pre.getTipo(),pre.getNombre()};
		this.jdbcTemplate.update("UPDATE prekinder SET nombre = ?,ubicacion=?,numestudiantes=?,numprofesores=?,tipo=? WHERE nombre = ?;",datosAActualizar);
	}

	@Override
	public void borrarPreKinder(String nombre) {
		Object[] datoABorrar =new Object[] {nombre};
		this.jdbcTemplate.update("delete from prekinder where nombre=?",datoABorrar);
	}

	
	
	

}
