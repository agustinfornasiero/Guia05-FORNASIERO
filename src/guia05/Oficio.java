package guia05;

public class Oficio {
	//Atributes
	private String tipoOficio;

	//Methods
	public Oficio(String tipo) {
		this.tipoOficio = tipo;
	}
	
	public String getTipo() {
		return tipoOficio;
	}
	public void setTipo(String tipo) {
		this.tipoOficio = tipo;
	}
	
	public boolean equals(Oficio o) {
		return this.tipoOficio.equalsIgnoreCase(o.getTipo());
	}
}
