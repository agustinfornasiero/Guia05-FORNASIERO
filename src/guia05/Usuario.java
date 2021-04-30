package guia05;

import java.util.ArrayList;

public class Usuario {
	//Atributes
	private String nombre;
	private Integer dni;
	private Integer alquileresSinDevolver;
	private ArrayList<Contratable> contratados;
	
	//Methods
	public Usuario(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.alquileresSinDevolver = 0;
		this.contratados = new ArrayList<Contratable>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getCantAlquileresNoDevueltos() {
		return alquileresSinDevolver;
	}
	
	public ArrayList<Contratable> getContratados() {
		return contratados;
	}

	public void contratar(Servicio s) {		
		this.contratados.add(s);
	}
	public void contratar(Alquiler a) throws AlquilerNoEntregadoException{
		if(alquileresSinDevolver>1) {
			throw new AlquilerNoEntregadoException();
		}
		else {
			this.contratados.add((Contratable) a); // Maybe the Casting is not correct!
			this.alquileresSinDevolver++;
		}
	}
	
	public Double totalConsumido() {
		Double t = 0d;
		for(Contratable c: this.contratados) {
			t+=c.costo();
		}
		return t;
	}
	
}
