import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        int[] numerosEnteros = {1, 2, 3, 4, 5};

        for (int i=0; i<5; i++) {
            if(numerosEnteros[i] > 3){
                System.out.println(numerosEnteros[i]);
            }
        }

            ArrayList<String> nombresEstudiantes = new ArrayList<>();
            nombresEstudiantes.add("Juan");
            nombresEstudiantes.add("Giro");
            nombresEstudiantes.add("Emma");
            nombresEstudiantes.remove("Giro");

            for (String estudiante : nombresEstudiantes) {
                System.out.println(estudiante);
            }
    }
}
