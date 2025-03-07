package poo;

public class Prueba {

    public static void main(String[] args) {
        // Método principal donde se ejecuta el programa
        
        // Creación de instancias de la clase empleados
        empleados trabajador1 = new empleados("Paco");
        empleados trabajador2 = new empleados("Ana");
        empleados trabajador3 = new empleados("Antonio");
        empleados trabajador4 = new empleados("Maria");
        
        // Cambio de la sección del trabajador1
        trabajador1.cambiaSeccion("RR.HH");
        //trabajador1.cambiaNombre("maria");
        
        // Obtener y mostrar los datos de los trabajadores
        /*System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
        System.out.println(trabajador4.getDatos());*/
        
        // Mostrar los datos de todos los trabajadores en una sola línea
        System.out.println(trabajador1.getDatos()+"\n"+trabajador2.getDatos()
        +"\n"+trabajador3.getDatos()+"\n"+trabajador4.getDatos());
        
        // Mostrar el ID siguiente disponible
        System.out.println(empleados.getIdSiguiente());
    }
}

class empleados {
    
    // Constructor de la clase empleados
    public empleados (String nom ) {
        nombre = nom; // Asignación del nombre
        seccion = "administracion"; // Sección por defecto
        id = idSiguiente; // Asignación del ID único
        idSiguiente++; // Incremento del ID estático para el siguiente empleado
    }
    
    // Método para cambiar la sección del empleado
    public void cambiaSeccion (String seccion) { // setter
        this.seccion = seccion;
        // El 'this' se refiere al campo de clase
    }
    
    /*public void cambiaNombre(String nombre) { // setter
        this.nombre = nombre;
        // Esto no tiene sentido, una persona no cambia de nombre
    }*/
    
    // Método para obtener los datos del empleado
    public String getDatos() {
        return "El nombre es: " + nombre + " y la seccion es: " + seccion + " y el Id es: " + id;
    }
    
    // Método estático para obtener el ID siguiente
    public static String getIdSiguiente() {
        return "El ID siguiente es: " + idSiguiente;
    }
    
    // Campos de clase
    private final String nombre; // Constante, no cambia
    private String seccion; // Sección del empleado
    private int id; // ID del empleado
    
    // Variable de clase (por el static)
    private static int idSiguiente = 1; // ID estático para asignar IDs únicos
}
