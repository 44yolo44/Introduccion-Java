package Empleado;

public class app {

	public static void main(String[] args) {
		
		try {
			Empresa empresa = new Empresa( 123, "leche" );
			
			Empleado empleado1 = new Empleado("73112357", "Mauricio", 22, Departamento.INFORMATICA, true, empresa);
			Empleado empleado2 = new Empleado("28932125", "fabian", 30, Departamento.DIRECCION, false, empresa);
			
			System.out.println("sueldo 1 : "+empleado1.calcularSueldo());
			System.out.println("sueldo 1 : "+empleado2.calcularSueldo());
			
			Empleado.setSalarioBase(2000);
			
			System.out.println("sueldo 1 : "+empleado1.calcularSueldo());
			System.out.println("sueldo 1 : "+empleado2.calcularSueldo());
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
