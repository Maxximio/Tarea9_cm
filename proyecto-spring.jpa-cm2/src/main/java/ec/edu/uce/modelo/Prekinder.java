package ec.edu.uce.modelo;

public class Prekinder {

	private String nombre;
	private String ubicacion;
	private int numEstudiantes;
	private int numProfesores;
	private String tipo;
	
	
	//set y get
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getUbicacion() {
			return ubicacion;
		}
		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
		public int getNumEstudiantes() {
			return numEstudiantes;
		}
		public void setNumEstudiantes(int numEstudiantes) {
			this.numEstudiantes = numEstudiantes;
		}
		public int getNumProfesores() {
			return numProfesores;
		}
		public void setNumProfesores(int numProfesores) {
			this.numProfesores = numProfesores;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		//to string
		@Override
		public String toString() {
			return "Prekinder [nombre=" + nombre + ", ubicacion=" + ubicacion + ", numEstudiantes=" + numEstudiantes
					+ ", numProfesores=" + numProfesores + ", tipo=" + tipo + "]";
		}
}
