package guia05;

public class OficioNoCoincideException extends Throwable  {
	
	public OficioNoCoincideException(String oficioTarea,String oficioTrabajador) {
		super("El oficio "+ oficioTarea+
				" requerido coincide con los servicios brindados por el Trabajador ("
				+oficioTrabajador+")");
	}


}
