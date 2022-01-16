package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.modelo.Paciente;

@Repository
public class AdministrativoRepoImpl implements IAdministrativoRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarAdministrativo(Administrativo admin) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {admin.getCi(),admin.getNombre(),admin.getApellido(),admin.getFuncion(),admin.getAniosServicio()};
		this.jdbcTemplate.update("insert into administrativo(ci,nombre,apellido,funcion,aniosservicio) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Administrativo buscarAdministrativo(Integer ci) {
		Object[] datoABuscar =new Object[] {ci};
		return this.jdbcTemplate.queryForObject("select * from administrativo where ci=?",datoABuscar,new BeanPropertyRowMapper<Administrativo>(Administrativo.class));
	}

	@Override
	public void actualizarAdministrativo(Administrativo admin) {
		Object[] datosAActualizar =new Object[] {admin.getCi(),admin.getNombre(),admin.getApellido(),admin.getFuncion(),admin.getAniosServicio(),admin.getCi()};
		this.jdbcTemplate.update("UPDATE administrativo SET ci = ?,nombre=?,apellido=?,funcion=?,aniosservicio=? WHERE ci = ?;",datosAActualizar);
	}

	@Override
	public void borrarAdministrativo(Integer ci) {
		Object[] datoABorrar =new Object[] {ci};
		this.jdbcTemplate.update("delete from administrativo where ci=?",datoABorrar);
	}
	
	

}
