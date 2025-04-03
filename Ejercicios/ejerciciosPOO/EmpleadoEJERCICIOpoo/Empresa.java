package Empleado;

public class Empresa {
	
	private int CIFF ;
	private String nombre;
	
	public Empresa(int cIFF, String nombre) {
		this.CIFF = cIFF;
		this.nombre = nombre;
	}

	public int getCIFF() {
		return CIFF;
	}

	public void setCIFF(int cIFF) {
		CIFF = cIFF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empresa [CIFF=" + CIFF + ", nombre=" + nombre + "]";
	}
	
	

}
