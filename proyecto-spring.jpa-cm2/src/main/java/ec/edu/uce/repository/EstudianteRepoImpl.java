package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Administrativo;
import ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarEstudiante(Estudiante estu) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {estu.getCi(),estu.getNombre(),estu.getApellido(),estu.getParalelo(),estu.getGrado()};
		this.jdbcTemplate.update("insert into estudiante(ci,nombre,apellido,paralelo,grado) values(?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Estudiante buscarEstudiante(Integer ci) {
		Object[] datoABuscar =new Object[] {ci};
		return this.jdbcTemplate.queryForObject("select * from estudiante where ci=?",datoABuscar,new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizarEstudiante(Estudiante estu) {
		Object[] datosAActualizar =new Object[] {estu.getCi(),estu.getNombre(),estu.getApellido(),estu.getParalelo(),estu.getGrado(),estu.getCi()};
		this.jdbcTemplate.update("UPDATE estudiante SET ci = ?,nombre=?,apellido=?,paralelo=?,grado=? WHERE ci = ?;",datosAActualizar);
	}

	@Override
	public void borrarEstudiante(Integer ci) {
		Object[] datoABorrar =new Object[] {ci};
		this.jdbcTemplate.update("delete from estudiante where ci=?",datoABorrar);
	}

}
