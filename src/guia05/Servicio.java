package guia05;

public abstract class Servicio implements Contratable{
	//Atributes
	protected Oficio tipoOficio;
	protected boolean esUrgente;
	
	//Methods
	public Oficio getTipo() {
		return tipoOficio;
	}
	public void setTipo(Oficio tipo) {
		this.tipoOficio = tipo;
	}
	public boolean Urgente() {
		return esUrgente;
	}
	public void setUrgente(boolean esUrgente) {
		this.esUrgente = esUrgente;
	}
	
}
