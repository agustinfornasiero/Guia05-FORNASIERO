package guia05;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trabajador {
	//Atributes
	private ArrayList<Trabajo> trabajos;
	private String nombre;
	private String email;
	private Oficio oficio;
	private Double costoPorHora;
	private Double comision;
	
	//Methods and Constructors
	public Trabajador(String nombre, Oficio oficio, Double costoPorHora, Double comision) {
		this.nombre = nombre;
		this.oficio = oficio;
		this.costoPorHora = costoPorHora;
		this.comision = comision;
		this.trabajos = new ArrayList<Trabajo>();
	}
	
	public Trabajador(String nombre, String email, Oficio oficio, Double costoPorHora, Double comision) {
		this.nombre = nombre;
		this.email = email;
		this.oficio = oficio;
		this.costoPorHora = costoPorHora;
		this.comision = comision;
		this.trabajos = new ArrayList<Trabajo>();
	}
	
	public void AgregarTarea(Trabajo t) throws OficioNoCoincideException,AgendaOcupadaException{
		
		if(!t.getOficioRequerido().equals(this.oficio)) {
			throw new OficioNoCoincideException(t.getOficioRequerido().getTipo(),this.oficio.getTipo());
		}
		else if(!this.disponible()) {
			throw new AgendaOcupadaException(this.nombre);
		}
		else {
			this.trabajos.add(t);
		}
	}
	
	public boolean disponible() {
		
		if(this.trabajos.isEmpty()) return true;
		
		//The current Service hasn't finished yet.
		return this.trabajos.get(this.trabajos.size()-1).finalizado();
	}
	
	public void marcarTareaFinalizada(Trabajo t) {
		Integer index = this.trabajos.indexOf(t);
		this.trabajos.get(index).setFechaFin(LocalDate.now());
	}
	
	public ArrayList<Trabajo> getTrabajos() {
		return trabajos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public Oficio getOficio() {
		return oficio;
	}
	public Double getCostoPorHora() {
		return costoPorHora;
	}
	public Double getComision() {
		return comision;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}

	public void setCostoPorHora(Double costoPorHora) {
		this.costoPorHora = costoPorHora;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

}
