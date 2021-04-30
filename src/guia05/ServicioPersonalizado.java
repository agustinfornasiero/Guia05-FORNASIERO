package guia05;

public class ServicioPersonalizado extends Servicio {
	//Atributes
	private Double presupuesto;
	private Double materialesCosto;
	private Double transporteCosto;
	
	//Methods and Constructors
	public ServicioPersonalizado(Oficio tipoOficio, Double pres, Double costoM, Double costoTrans, boolean urg) {
		this.presupuesto = pres;
		this.materialesCosto = costoM;
		this.transporteCosto = costoTrans;
		this.tipoOficio = tipoOficio;
		this.esUrgente=urg;
	}
	
	@Override
	public Double costo() {
		Double costo = presupuesto + materialesCosto + transporteCosto;
		if(this.esUrgente)
			return costo+costo*0.5;
		return costo;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double pres) {
		this.presupuesto = pres;
	}

	public Double getCostoMateriales() {
		return materialesCosto;
	}

	public void setCostoMateriales(Double costoMats) {
		this.materialesCosto = costoMats;
	}

	public Double getCostoTransporte() {
		return transporteCosto;
	}

	public void setCostoTransporte(Double costoTrans) {
		this.transporteCosto = costoTrans;
	}

}
