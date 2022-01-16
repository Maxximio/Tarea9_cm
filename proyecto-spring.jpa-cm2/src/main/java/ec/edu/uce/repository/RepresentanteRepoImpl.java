package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.modelo.Representante;

@Repository
public class RepresentanteRepoImpl implements IRepresentanteRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarRepresentante(Representante rep) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {rep.getCi(),rep.getNombre(),rep.getApellido(),rep.getApoderado(),rep.getQuintil()};
		this.jdbcTemplate.update("insert into representante(ci,nombre,apellido,apoderado,quintil) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Representante buscarRepresentante(Integer ci) {
		Object[] datoABuscar =new Object[] {ci};
		return this.jdbcTemplate.queryForObject("select * from representante where ci=?",datoABuscar,new BeanPropertyRowMapper<Representante>(Representante.class));
	}

	@Override
	public void actualizarRepresentante(Representante rep) {
		Object[] datosAActualizar =new Object[] {rep.getCi(),rep.getNombre(),rep.getApellido(),rep.getApoderado(),rep.getQuintil(),rep.getCi()};
		this.jdbcTemplate.update("UPDATE representante SET ci = ?,nombre=?,apellido=?,apoderado=?,quintil=? WHERE ci = ?;",datosAActualizar);
	}

	@Override
	public void borrarRepresentante(Integer ci) {
		Object[] datoABorrar =new Object[] {ci};
		this.jdbcTemplate.update("delete from representante where ci=?",datoABorrar);
	}

}
