package Ejercicio2_movimiento;

public class movimiento {
    
    private int x;
    private int y;

    public movimiento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba() {
        y++;
        System.out.print("Moviendo hacia arriba");
    }

    public void moverAbajo() {
        y--;
        System.out.print("Moviendo hacia abajo");
    }

    public void moverIzquierda() {
        x--;
        System.out.print("Moviendo hacia la izquierda");
    }

    public void moverDerecha() {
        x++;
        System.out.print("Moviendo hacia la derecha");
    }

    public String mostrarPosicion() {
        return x + ", " + y;
    }

}
