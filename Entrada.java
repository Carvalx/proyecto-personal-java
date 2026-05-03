
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Dime tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre es: " + nombre + " y tu edad es: " + 
            edad + " años.");

        scanner.close();
    }
}
