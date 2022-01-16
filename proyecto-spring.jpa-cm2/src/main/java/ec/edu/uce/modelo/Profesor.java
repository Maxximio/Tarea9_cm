package ec.edu.uce.modelo;

public class Profesor {

	private int ci;
	private String nombre;
	private String apellido;
	private String asignatura;
	private String titulo;
	
	//set y get
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//to string
	@Override
	public String toString() {
		return "Profesor [ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", asignatura=" + asignatura
				+ ", titulo=" + titulo + "]";
	}
	
	
}
