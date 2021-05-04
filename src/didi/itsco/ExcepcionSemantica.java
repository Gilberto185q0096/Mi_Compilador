package didi.itsco;

public class ExcepcionSemantica extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Tipo 
	{
		VARIABLE_NO_DEFINIDA, VARIABLE_NO_INICIALIZADA,
		VARIABLE_DUPLICADA, TIPOS_NO_COINCIDEN
	}
	
	public ExcepcionSemantica() 
	{
		super();
	}
	
	public ExcepcionSemantica(Variable variable, Tipo tipo)
	{
		super(obtenerMensaje(variable, tipo));
	}
	
	private static String obtenerMensaje(Variable variable, Tipo tipo)
	{
		String mensaje = null;
		switch (tipo)
		{
		case VARIABLE_DUPLICADA:
			mensaje = "La variable "+variable.getId()+" ya está declarada";
			break;
		case VARIABLE_NO_DEFINIDA:
			mensaje = "La variable "+variable.getId()+" no se ha declarado";
			break;
		case VARIABLE_NO_INICIALIZADA:
			mensaje = "La variable "+variable.getId()+" no se ha inicializado";
			break;
		case TIPOS_NO_COINCIDEN:
			mensaje = "Los tipos de datos no coinciden con la variable "+variable.getId();
			break;
		}
		return mensaje;
	}
}
