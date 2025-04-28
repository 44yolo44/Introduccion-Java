public class ArgumentosVariables {
    public static void main(String[] args) {

        inmprimirNumero(1, 2, 3, 4, 5); // Llamada al método usando argumentos variables (varargs)

    }

    // Este método utiliza "varargs", permitiendo recibir una cantidad variable de argumentos.
    // Internamente, Java convierte los argumentos en un array de tipo int[].
    // Así, podemos recorrerlos como cualquier arreglo normal.
    private static void inmprimirNumero(int... numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}
