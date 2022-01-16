package ec.edu.uce.modelo;

public class PersonalAdicional {

	private int id;
	private String nombre;
	private String apellido;
	private String cargo;
	private int aniosServicio;
	
	//set y get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAniosServicio() {
		return aniosServicio;
	}
	public void setAniosServicio(int aniosServicio) {
		this.aniosServicio = aniosServicio;
	}
	
	//to string
	@Override
	public String toString() {
		return "PersonalAdicional [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo
				+ ", aniosServicio=" + aniosServicio + "]";
	}
	
	
	
	
}
