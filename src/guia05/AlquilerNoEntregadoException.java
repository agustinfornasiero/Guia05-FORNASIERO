package guia05;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("El usuario no puede alquilar debido a que no entreg� lo que ya ha alquilado");
	}

}
