package Ejercicio3_vehiculo;

public class vehiculo {

    private String marca;
    private String modelo;
    private float precio;

    public vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    

    public float getPrecio() {
        return precio;
    }

    public String getDatos() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
    }
    

}
