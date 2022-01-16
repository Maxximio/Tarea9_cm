package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Colegio;
import ec.edu.uce.modelo.Escuela;

@Repository
public class EscuelaRepoImpl implements IEscuelaRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarEscuela(Escuela escuela) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {escuela.getNombre(),escuela.getUbicacion(),escuela.getNumEstudiantes(),escuela.getNumProfesores(),escuela.getTipo()};
		this.jdbcTemplate.update("insert into escuela(nombre,ubicacion,numestudiantes,numprofesores,tipo) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Escuela buscarEscuela(String nombre) {
		Object[] datoABuscar =new Object[] {nombre};
		return this.jdbcTemplate.queryForObject("select * from escuela where nombre=?",datoABuscar,new BeanPropertyRowMapper<Escuela>(Escuela.class));
	}

	@Override
	public void actualizarEscuela(Escuela escuela) {
		Object[] datosAActualizar =new Object[] {escuela.getNombre(),escuela.getUbicacion(),escuela.getNumEstudiantes(),escuela.getNumProfesores(),escuela.getTipo(),escuela.getNombre()};
		this.jdbcTemplate.update("UPDATE escuela SET nombre = ?,ubicacion=?,numestudiantes=?,numprofesores=?,tipo=? WHERE nombre = ?;",datosAActualizar);
	}

	@Override
	public void borrarEscuela(String nombre) {
		Object[] datoABorrar =new Object[] {nombre};
		this.jdbcTemplate.update("delete from escuela where nombre=?",datoABorrar);
	}

	

}
