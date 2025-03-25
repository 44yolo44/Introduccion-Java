/*
Queremos representar con programación orientada a objetos, un aula con estudiantes y un profesor.

Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10)  y del profesor que materia da.

Las materias disponibles son matemáticas, filosofía y física.

Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van a clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su sitio).

El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.)

Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).

El aula debe tener un identificador numérico, el número máximo de estudiantes y  para que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.

Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el profesor de la materia correspondiente en el aula correspondiente (un profesor de filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.

El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase, teniendo en cuenta las condiciones antes dichas.

Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) están aprobados de momento (imaginad que les están entregando las notas).

NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).
*/


package parte2;

import java.util.Random;

public class principal {

	public static void main(String[] args) {
		
		//nombres aleatorios 
		String[] nombresMasculinos = {"Juan", "Pedro", "Pablo", "Luis", "Carlos", "Fernando", "Javier", "Manuel", "Antonio", "Jose"};   
        
        String[] nombresFemeninos = {"Maria", "Laura", "Ana", "Sara", "Elena", "Carmen", "Rosa", "Isabel", "Lucia", "Sofia"};   

        String[] apellidos = {"Garcia", "Rodriguez", "Gonzalez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Martin"};



        Random r = new Random();

        


        //crear profesor
        //sexo aleatorio
        String sexo = r.nextBoolean() ? "H" : "M";
        //nombre aleatorio
        String nombre = sexo.equals("H") ? nombresMasculinos[r.nextInt(nombresMasculinos.length)] : nombresFemeninos[r.nextInt(nombresFemeninos.length)];
        //apellido aleatorio
        String apellido = apellidos[r.nextInt(apellidos.length)];
        //edad aleatoria
        int edad = r.nextInt(50)+20;
        //curso aleatorio
        
        //CURSOS 
        String[] cursos = {"Matematicas", "Filosofia", "Fisica"};

        String curso = cursos[r.nextInt(cursos.length)];



        Profesor profe = new Profesor(nombre + " " + apellido, sexo, edad, curso);

        //crear alumnos

        int n = (int)(Math.random()*10)+10;

        Alumno[] alumnos = new Alumno[n];

        for (int i = 0; i < alumnos.length; i++) {
            //sexo aleatorio
            sexo = r.nextBoolean() ? "H" : "M";
            //nombre aleatorio
            nombre = sexo.equals("H") ? nombresMasculinos[r.nextInt(nombresMasculinos.length)] : nombresFemeninos[r.nextInt(nombresFemeninos.length)];
            //apellido aleatorio
            apellido = apellidos[r.nextInt(apellidos.length)];
            //edad aleatoria
            edad = r.nextInt(10)+15;
            //calificacion aleatoria
            int calificacion = r.nextInt(11);

            alumnos[i] = new Alumno(nombre + " " + apellido, sexo, edad, calificacion);
        }

        //crear aula
        //curso aleatorio
        
        String cursoAula;
        
        int AulaAleatorio = (int)(Math.random()*100);
        if (AulaAleatorio > 33) {
           cursoAula = profe.getCurso();
        } else {
            cursoAula = cursos[r.nextInt(cursos.length)];
        } 

        //id aleatorio
        int id = r.nextInt(1000);

        Aula aula = new Aula(alumnos, profe, id, cursoAula);

        //mostar clase

        System.out.println("Id aula: " + aula.getId());

        System.out.println("Curso aula: " + aula.getCurso());

        System.out.println("Profesor: " + profe.toString());

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + i + ": " + alumnos[i].toString());
        }

        System.out.println("Numero de alumnos: " + aula.DameNumeroAlumnos());

        System.out.println("Numero de alumnos que vinieron: " + aula.DameAsistencia());

        System.out.println("vino el profesor: " + aula.DameAsistenciaProfesor());


        if (aula.DameHayClase()) {
            System.out.println("\nHay clase");
            System.out.println("\nNumero de alumnos varones aprobados: " + aula.NumeroAlumnosVaronesAprobados());
            System.out.println("Numero de alumnas aprobadas: " + aula.NumeroAlumnosMujeresAprobadas());
        } else {
            System.out.println("No hay clase");
        }

        


    }
}



