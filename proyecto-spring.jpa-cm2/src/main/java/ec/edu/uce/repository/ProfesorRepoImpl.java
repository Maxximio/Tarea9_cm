package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.modelo.Profesor;

@Repository
public class ProfesorRepoImpl implements IProfesorRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarProfesor(Profesor profe) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {profe.getCi(),profe.getNombre(),profe.getApellido(),profe.getAsignatura(),profe.getTitulo()};
		this.jdbcTemplate.update("insert into profesor(ci,nombre,apellido,asignatura,titulo) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Profesor buscarProfesor(Integer ci) {
		Object[] datoABuscar =new Object[] {ci};
		return this.jdbcTemplate.queryForObject("select * from profesor where ci=?",datoABuscar,new BeanPropertyRowMapper<Profesor>(Profesor.class));
	}

	@Override
	public void actualizarProfesor(Profesor profe) {
		Object[] datosAActualizar =new Object[] {profe.getCi(),profe.getNombre(),profe.getApellido(),profe.getAsignatura(),profe.getTitulo(),profe.getCi()};
		this.jdbcTemplate.update("UPDATE profesor SET ci = ?,nombre=?,apellido=?,asignatura=?,titulo=? WHERE ci = ?;",datosAActualizar);
	}

	@Override
	public void borrarProfesor(Integer ci) {
		Object[] datoABorrar =new Object[] {ci};
		this.jdbcTemplate.update("delete from profesor where ci=?",datoABorrar);
	}

	

}
