package Empleado;

import java.util.Objects;

public class Empleado {
	
	private String DNI ; //para poder validar con matches
	private String nombre;
	private int edad;
	private Departamento Departamento;
	private boolean teletrabajo ;
	private Empresa empresa;
	private static double SalarioBase = 1000;
	
	public Empleado(String dNI, String nombre, int edad, Departamento Departamento, boolean teletrabajo,
			Empresa empresa) {
		
		try {
			validator.ValidarDni(dNI);
		} catch (Exception e) {

			throw new IllegalArgumentException(e.getMessage());
		}
		
		if(empresa == null) {
			throw new IllegalArgumentException("la empresa es obligatoria");
		}
		
		DNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.Departamento = Departamento;
		this.teletrabajo = teletrabajo;
		this.empresa = empresa;
	}
	
	
	public double calcularSueldo () {
		double salario = SalarioBase;
		
		if(edad > 30 ) {
			salario +=200;
		}
		
		salario += Departamento.getPlus();
		
		if(isTeletrabajo()) {
			salario +=30;
		}
		
		return salario;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Departamento getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(Departamento Departamento) {
		this.Departamento = Departamento;
	}

	public boolean isTeletrabajo() {
		return teletrabajo;
	}

	public void setTeletrabajo(boolean teletrabajo) {
		this.teletrabajo = teletrabajo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	
	

	public static double getSalarioBase() {
		return SalarioBase;
	}


	public static void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}


	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return DNI == other.DNI;
	}

	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + Departamento
				+ ", teletrabajo=" + teletrabajo + ", empresa=" + empresa + ", SalarioBase=" + SalarioBase + "]";
	}
	
	
	
	

}
