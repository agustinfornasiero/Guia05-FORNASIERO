package guia05;

public class ServicioEstandar extends Servicio {
	//Atributes
	private Double costoFijo;
	private Double comision;
	
	//Methods and Constructors
	public ServicioEstandar(Oficio tipo, Double monto, Double comis, boolean urg) {
		this.tipoOficio = tipo;
		this.costoFijo = monto;
		this.comision = comis;
		this.esUrgente = urg;
	}
	
	@Override
	public Double costo() {
		Double costo = this.costoFijo + this.costoFijo*comision;
		if(this.esUrgente)
			return costo+costo*0.5;
		return costo; 
	}

	public Double getCostoFijo() {
		return costoFijo;
	}

	public void setMontoFijo(Double costoFijo) {
		this.costoFijo = costoFijo;
	}

	public Double getComisionTrabajador() {
		return comision;
	}

	public void setComisionTrabajador(Double comis) {
		this.comision = comis;
	}
}
