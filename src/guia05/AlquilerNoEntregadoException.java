package guia05;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("El usuario no puede alquilar debido a que no entregó lo que ya ha alquilado");
	}

}
