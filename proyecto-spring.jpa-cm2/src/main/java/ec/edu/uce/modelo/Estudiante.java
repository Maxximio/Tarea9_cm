package ec.edu.uce.modelo;

public class Estudiante {

	private int ci;
	private String nombre;
	private String apellido;
	private String paralelo;
	private int grado;
	
	
	///set y get
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
	public String getParalelo() {
		return paralelo;
	}
	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	//to string
	@Override
	public String toString() {
		return "Estudiante [ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", paralelo=" + paralelo
				+ ", grado=" + grado + "]";
	}
	
	
	
}
