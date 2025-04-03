package Empleado;

public class validator {
	
	public static void ValidarDni(String dni) throws Exception {
		if (!dni.matches("^[1-9][0-9]{7}$")) {
			throw new Exception("El formato del dni es incorrecto");
		}
	}

}
