package guia05;

public class ServicioNoCoincideException extends Throwable  {
	
	public ServicioNoCoincideException() {
		super("El servicio no puede tener un oficio que no es del servicio contratado");
	}

}
