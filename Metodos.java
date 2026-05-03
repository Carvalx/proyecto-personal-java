public class Metodos {
    public static int sumar(int a, int b) {
        return a + b;
    } 

    public static boolean mayorEdad(int a) {
        return a >= 18;
    }

    public static void despedir(String nombre) {
        System.out.println("Hasta luego " + nombre);
    }

    public static void main(String[] args) {
        int resultadoSuma = sumar(1, 6);
        System.out.println(resultadoSuma);

        boolean esMayor = mayorEdad(17);
        System.out.println(esMayor);

        despedir("Carlos");
    }
}
