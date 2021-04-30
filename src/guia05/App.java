package guia05;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		//Creating Objects
		
		//Oficio
		Oficio oficio1 = new Oficio("Plomero");
		Oficio oficio2 = new Oficio("Gasista");
		
		//Usuario
		Usuario user1 = new Usuario("Jorge Salas", "jsalas@gmail.com", 39215415);
		
		//Trabajador
		Trabajador trabajador1 = new Trabajador("Roberto Robles",oficio1,200.5,0.10);
		Trabajador trabajador2 = new Trabajador("Juan Perez",oficio2,150.0,0.15);
		
		//Trabajo
		Trabajo trabajo1 =  new Trabajo(LocalDate.of(2021, 8, 1), new Oficio("Plomero"));
		//Servicio
		Servicio servicio1 = new ServicioEstandar(new Oficio("Gasista"), 50.0, 0.15,true);
		
		try {
			trabajo1.agregarServicio(servicio1);
		}
		catch(ServicioNoCoincideException e) {
			System.out.println("Por favor, asigne un servicio que corresponde con el oficio del trabajo");
		}
		
		servicio1.setTipo(oficio1);
		Servicio servicio2 = new ServicioPersonalizado(oficio1,300.0,200.50,90.0,false);
		try {
			trabajo1.agregarServicio(servicio1);
			trabajo1.agregarServicio(servicio2);
		}
		catch(ServicioNoCoincideException e) {
			System.out.println("Por favor, asigne un servicio que corrresponde con el oficio del trabajo");
		}
		
		System.out.println("El trabajo 1 cuesta: "+trabajo1.costo());
		
		//Exception because of incompatibility Oficio..
		try {
			trabajador1.AgregarTarea(trabajo1);
		}
		catch(OficioNoCoincideException e) {
			System.out.println("Por favor, asignar un servicio que compatible con el oficio");
		}
		catch(AgendaOcupadaException e) {
			System.out.println("En la fecha, el trabajador no puede realizar el trabajo, agenda ocupada");
		}
		
		//Is available?
		System.out.println("El trabajador "+trabajador1.getNombre()+" esta disponible? " +(trabajador1.disponible()? "si":"no"));
		System.out.println("El trabajador "+trabajador2.getNombre()+" esta disponible? " +(trabajador2.disponible()? "si":"no"));
		
		//Alquiler
		Alquiler alquiler1 = new Alquiler("Taladro Eléctrico",LocalDate.now(),LocalDate.of(2021,5,30),300.0);
		Alquiler alquiler2 = new Alquiler("Termofusora",LocalDate.of(2021,2,26),LocalDate.of(2021,3,5),1500.00);
		Alquiler alquiler3 = new Alquiler("Destornillador",LocalDate.of(2021, 1, 2),LocalDate.now(),150.0);
		
		//Mora Debt
		System.out.println("El alquiler nro 3 se ha abonado? "+alquiler3.finalizado());
		alquiler3.setFechaDevolucion(LocalDate.now());
		System.out.println("El alquiler 3 cuesta $"+alquiler3.costo());
		System.out.println("el alquiler 3 se devolvio en tiempo y forma? "+alquiler3.enMora());
		
		//Hiring a Service
		user1.contratar(servicio1);
		try {
			user1.contratar(alquiler1);
			user1.contratar(alquiler2);
			user1.contratar(alquiler3);
		}
		
		//Exception because of a Debt..
		catch (AlquilerNoEntregadoException e){
			System.out.println("El usuario "+user1.getNombre()+" ya debe 2 alquileres, por lo tanto no puede contratar");
		}
		
		System.out.println("El usuario "+user1.getNombre()+" ha gastado un total de $"+user1.totalConsumido());
		
		
		
		
		
		
	}
}
