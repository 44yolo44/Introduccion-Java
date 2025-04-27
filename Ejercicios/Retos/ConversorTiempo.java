/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime horaActual = LocalTime.now(); //para la hora
        LocalDate fechaActual = LocalDate.now(); //para el dia

        System.out.println("Dia: "+fechaActual.getDayOfMonth());
        System.out.println("Hora: "+horaActual.withNano(0));

        int dias = fechaActual.getDayOfMonth();
        int horas = horaActual.getHour();
        int minutos = horaActual.getMinute();
        int segundos = horaActual.getSecond();


        System.out.println("La Fecha en milisegundos es(usando la funcion propia) : ");
        System.out.println(conversorTiempo(dias, horas, minutos, segundos));


    }

     public static long conversorTiempo (int dias , int horas , int minutos , int segundos ){
             long milisegundos =
                     (long)dias * 24 * 60 * 60 * 1000
                   + (long)horas * 60 * 60 * 1000
                   + (long)minutos * 60 * 1000 
                   + (long)segundos * 1000;

             return milisegundos;
         }

}
