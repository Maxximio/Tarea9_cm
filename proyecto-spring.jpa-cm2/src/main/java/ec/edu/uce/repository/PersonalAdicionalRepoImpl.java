package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.modelo.PersonalAdicional;

@Repository
public class PersonalAdicionalRepoImpl implements IPersonalAdicionalRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarPersonalAdicional(PersonalAdicional person) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {person.getId(),person.getNombre(),person.getApellido(),person.getCargo(),person.getAniosServicio()};
		this.jdbcTemplate.update("insert into personaladicional(id,nombre,apellido,cargo,aniosservicio) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public PersonalAdicional buscarPersonalAdicional(Integer id) {
		Object[] datoABuscar =new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from personaladicional where id=?",datoABuscar,new BeanPropertyRowMapper<PersonalAdicional>(PersonalAdicional.class));
	}

	@Override
	public void actualizarPersonalAdicional(PersonalAdicional person) {
		Object[] datosAActualizar =new Object[] {person.getId(),person.getNombre(),person.getApellido(),person.getCargo(),person.getAniosServicio(),person.getId()};
		this.jdbcTemplate.update("UPDATE personaladicional SET id = ?,nombre=?,apellido=?,cargo=?,aniosservicio=? WHERE id = ?;",datosAActualizar);
	}

	@Override
	public void borrarPersonalAdicional(Integer id) {
		Object[] datoABorrar =new Object[] {id};
		this.jdbcTemplate.update("delete from personaladicional where id=?",datoABorrar);
	}
	

}
