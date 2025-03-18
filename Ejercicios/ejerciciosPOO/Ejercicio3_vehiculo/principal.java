/*
Ejercicio 3: Construir un programa que dada una serie de 
vehículos caracterizados por su marca,modelo y precio, 
imprima las propiedades del vehículo más barato. Para ello, 
se deberán leer por teclado las características de cada vehículo 
y crear una clase que represente a cada uno de ellos.

y determinar el mas barato de los vehiculos

*/

package Ejercicio3_vehiculo;

import javax.swing.JOptionPane;

public class principal {

    public static int indiceMasBarato(vehiculo[] vehiculos) {
        float precio;
        int indice = 0;
        precio = vehiculos[0].getPrecio();

        for (int i = 1; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Cuantos vehiculos desea ingresar?");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos"));

        vehiculo[] vehiculos = new vehiculo[n];
        float precio;

        //ingresar los datos

        for (int i = 0; i < vehiculos.length; i++) {

            String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo " + (i + 1));
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo " + (i + 1));
            precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del vehiculo " + (i + 1)));
            
            vehiculos[i] = new vehiculo(marca, modelo, precio);
        }


        //mostrar datos

        JOptionPane.showMessageDialog(null, "Los Datos de los vehiculos ingresados son: ");

        for (int i = 0; i < vehiculos.length; i++) {
            JOptionPane.showMessageDialog(null, "Vehiculo " + (i + 1) + "\n" + vehiculos[i].getDatos());
        }

        //buscar el mas barato

        int indiceBarato = indiceMasBarato(vehiculos);
        JOptionPane.showMessageDialog(null, "El vehiculo mas barato es: \n" + vehiculos[indiceBarato].getDatos());






    }

}


