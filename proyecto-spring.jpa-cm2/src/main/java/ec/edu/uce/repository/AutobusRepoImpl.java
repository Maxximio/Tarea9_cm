package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Autobus;
import ec.edu.uce.modelo.Paciente;

@Repository
public class AutobusRepoImpl implements IAutobusRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarAutobus(Autobus auto) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {auto.getMatricula(),auto.getChofer(),auto.getRecorrido(),auto.getAniosServicio(),auto.getAsientos()};
		this.jdbcTemplate.update("insert into autobus(matricula,chofer,recorrido,aniosservicio,asientos) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Autobus buscarAutobus(String matricula) {
		Object[] datoABuscar =new Object[] {matricula};
		return this.jdbcTemplate.queryForObject("select * from autobus where matricula=?",datoABuscar,new BeanPropertyRowMapper<Autobus>(Autobus.class));
	}

	@Override
	public void actualizarAutobus(Autobus auto) {
		Object[] datosAActualizar =new Object[] {auto.getMatricula(),auto.getChofer(),auto.getRecorrido(),auto.getAniosServicio(),auto.getAsientos(),auto.getMatricula()};
		this.jdbcTemplate.update("UPDATE autobus SET matricula = ?,chofer=?,recorrido=?,aniosservicio=?,asientos=? WHERE matricula = ?;",datosAActualizar);
	}

	@Override
	public void borrarAutobus(String matricula) {
		Object[] datoABorrar =new Object[] {matricula};
		this.jdbcTemplate.update("delete from autobus where matricula=?",datoABorrar);
	}

	
	
	

}
