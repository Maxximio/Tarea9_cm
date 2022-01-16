package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Colegio;
import ec.edu.uce.modelo.Jardin;

@Repository
public class JardinRepoImpl implements IJardinRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarJardin(Jardin jardin) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {jardin.getNombre(),jardin.getUbicacion(),jardin.getNumEstudiantes(),jardin.getNumProfesores(),jardin.getTipo()};
		this.jdbcTemplate.update("insert into jardin(nombre,ubicacion,numestudiantes,numprofesores,tipo) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Jardin buscarJardin(String nombre) {
		Object[] datoABuscar =new Object[] {nombre};
		return this.jdbcTemplate.queryForObject("select * from jardin where nombre=?",datoABuscar,new BeanPropertyRowMapper<Jardin>(Jardin.class));
	}

	@Override
	public void actualizarJardin(Jardin jardin) {
		Object[] datosAActualizar =new Object[] {jardin.getNombre(),jardin.getUbicacion(),jardin.getNumEstudiantes(),jardin.getNumProfesores(),jardin.getTipo(),jardin.getNombre()};
		this.jdbcTemplate.update("UPDATE jardin SET nombre = ?,ubicacion=?,numestudiantes=?,numprofesores=?,tipo=? WHERE nombre = ?;",datosAActualizar);
	}

	@Override
	public void borrarJardin(String nombre) {
		Object[] datoABorrar =new Object[] {nombre};
		this.jdbcTemplate.update("delete from jardin where nombre=?",datoABorrar);
	}
	
	

}
