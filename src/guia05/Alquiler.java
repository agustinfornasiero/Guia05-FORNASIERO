package guia05;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Contratable {
	//Atributes
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaDevolucion;
	private Double costoPorDia;
	
	//Methods and Constructors
	public Alquiler(String nombre, LocalDate fechaInicio,LocalDate fechaFin ,Double costoPorDia) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoPorDia = costoPorDia;
	}
	

	public Double costo() {
		if(!this.finalizado()) return 0d;
		return costoPorDia*ChronoUnit.DAYS.between(fechaInicio,fechaDevolucion);
	}
	
	public boolean enMora() {
		return fechaFin.compareTo(fechaFin) > 0;
	}
	
	public boolean finalizado() {
		return fechaDevolucion!=null;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Double getCostoPorDia() {
		return costoPorDia;
	}

	public void setCostoPorDia(Double costoPorDia) {
		this.costoPorDia = costoPorDia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
