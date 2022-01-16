package ec.edu.uce.modelo;

public class Administrativo {

	private int ci;
	private String nombre;
	private String apellido;
	private String funcion;
	private int aniosServicio;
	
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
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public int getAniosServicio() {
		return aniosServicio;
	}
	public void setAniosServicio(int aniosServicio) {
		this.aniosServicio = aniosServicio;
	}
	
	
	@Override
	public String toString() {
		return "Administrativo [ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", funcion=" + funcion
				+ ", aniosServicio=" + aniosServicio + "]";
	}
	
	
	
}
