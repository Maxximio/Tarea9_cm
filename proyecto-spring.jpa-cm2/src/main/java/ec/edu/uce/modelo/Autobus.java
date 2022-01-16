package ec.edu.uce.modelo;

public class Autobus {

	private String matricula;
	private String chofer;
	private String recorrido;
	private int aniosServicio;
	private int asientos;
	
	//set y get
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getChofer() {
		return chofer;
	}
	public void setChofer(String chofer) {
		this.chofer = chofer;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(String recorrido) {
		this.recorrido = recorrido;
	}
	public int getAniosServicio() {
		return aniosServicio;
	}
	public void setAniosServicio(int aniosServicio) {
		this.aniosServicio = aniosServicio;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	
	//to string
	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", chofer=" + chofer + ", recorrido=" + recorrido
				+ ", aniosServicio=" + aniosServicio + ", asientos=" + asientos + "]";
	}
	
	
	
	
}
