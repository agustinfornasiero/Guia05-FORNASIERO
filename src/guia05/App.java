package guia05;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		//Creating Objects
		Oficio oficio1 = new Oficio("Plomero");
		Oficio oficio2 = new Oficio("Gasista");
		
		Trabajador trabajador1 = new Trabajador("Roberto Robles",oficio1,200.5,0.10);
		Trabajador trabajador2 = new Trabajador("Juan Perez",oficio2,150.0,0.10);
		
		Trabajo trabajo1 =  new Trabajo(LocalDate.of(2021, 8, 1), new Oficio("Plomero"));
		Servicio servicio1 = new ServicioEstandar(new Oficio("Gasista"), 50.0, 0.10,true);
		
		
		System.out.println(oficio1);
		
	}
}
