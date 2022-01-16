package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Colegio;
import ec.edu.uce.modelo.Paciente;

@Repository
public class ColegioRepoImpl implements IColegioRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarColegio(Colegio cole) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {cole.getNombre(),cole.getUbicacion(),cole.getNumEstudiantes(),cole.getNumProfesores(),cole.getTipo()};
		this.jdbcTemplate.update("insert into colegio(nombre,ubicacion,numestudiantes,numprofesores,tipo) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Colegio buscarColegio(String nombre) {
		Object[] datoABuscar =new Object[] {nombre};
		return this.jdbcTemplate.queryForObject("select * from colegio where nombre=?",datoABuscar,new BeanPropertyRowMapper<Colegio>(Colegio.class));
	}

	@Override
	public void actualizarColegio(Colegio cole) {
		Object[] datosAActualizar =new Object[] {cole.getNombre(),cole.getUbicacion(),cole.getNumEstudiantes(),cole.getNumProfesores(),cole.getTipo(),cole.getNombre()};
		this.jdbcTemplate.update("UPDATE colegio SET nombre = ?,ubicacion=?,numestudiantes=?,numprofesores=?,tipo=? WHERE nombre = ?;",datosAActualizar);
	}

	@Override
	public void borrarColegio(String nombre) {
		Object[] datoABorrar =new Object[] {nombre};
		this.jdbcTemplate.update("delete from colegio where nombre=?",datoABorrar);
	}

}
