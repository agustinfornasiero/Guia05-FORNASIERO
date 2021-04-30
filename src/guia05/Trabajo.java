package guia05;

import java.time.*;
import java.util.ArrayList;

public class Trabajo {
	//Atributes
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private Oficio oficioRequiere;
	ArrayList<Servicio>listaServicios;
	
	//Methods and Constructors
	public Trabajo(LocalDate fechaInicio, Oficio oficio) {
		this.fechaIni = fechaInicio;
		this.oficioRequiere = oficio;
		this.listaServicios=new ArrayList<Servicio>();
	}
	
	public boolean finalizado() {
		return fechaFin!=null;
	}

	
	public Double costo() {
		Double totalCosto=0d;
		for(Servicio s: listaServicios) {
			totalCosto+=s.costo();
		}
		
		return totalCosto;
		
	}
	
	public void agregarServicio(Servicio s) throws ServicioNoCoincideException {
		if(this.oficioRequiere.equals(s.getTipo()))
			this.listaServicios.add(s);
		else {
			throw new ServicioNoCoincideException();
		}
	}
	
	public LocalDate getFechaInicio() {
		return fechaIni;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate f) {
		this.fechaFin = f;
	}

	public Oficio getOficioRequerido() {
		return oficioRequiere;
	}
	public void setOficioRequerido(Oficio oficioRequerido) {
		this.oficioRequiere = oficioRequerido;
	}
}
