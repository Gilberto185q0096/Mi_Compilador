package didi.itsco;

public class SemanticException extends Exception
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int VARIABLES_NO_DECLARADAS = 10;
	public static final int VARIABLES_DUPLICADAS = 20;
	public static final int VARIABLES_NO_INICIALIZADAS = 30;
	public static final int TIPOS_NO_COINCIDEN = 40;

	public SemanticException()
	{
		super();
	}
	
	public SemanticException (String variable, int tipoExcepcion)
	{
		super(getMensaje(variable,tipoExcepcion));
	}
	
	private static String getMensaje(String variable, int tipoExcepcion)
	{
		String msg = null;
		switch (tipoExcepcion)
		{
		case VARIABLES_NO_DECLARADAS:
			msg = "La variable \""+variable+"\" no ha sido declarada";
			break;
		case VARIABLES_DUPLICADAS:
			msg = "La variable \""+variable+"\" ya ha sido declarada";
			break;
		case VARIABLES_NO_INICIALIZADAS:
			msg = "La variable \""+variable+"\" no ha sido inicializada";
			break;
		case TIPOS_NO_COINCIDEN:
			msg = "El tipo de dato no coincide con el tipo de la variable "+
						"\""+variable+"\".";
			break;
		}
		
		return msg;
	}
}
