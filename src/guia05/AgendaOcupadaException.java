package guia05;

public class AgendaOcupadaException extends Throwable  {

	public AgendaOcupadaException(String nombreTrabajador) {
		super("El trabajador"+nombreTrabajador+" est� realizando un trabajo");

	}

}
