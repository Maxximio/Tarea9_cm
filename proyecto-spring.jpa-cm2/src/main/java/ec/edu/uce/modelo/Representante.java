package ec.edu.uce.modelo;

public class Representante {

	private int ci;
	private String nombre;
	private String apellido;
	private String apoderado;
	private String quintil;
	
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
	public String getApoderado() {
		return apoderado;
	}
	public void setApoderado(String apoderado) {
		this.apoderado = apoderado;
	}
	public String getQuintil() {
		return quintil;
	}
	public void setQuintil(String quintil) {
		this.quintil = quintil;
	}
	
	//to string
	@Override
	public String toString() {
		return "Representante [ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", apoderado=" + apoderado
				+ ", quintil=" + quintil + "]";
	}
	
	
	
	
}
