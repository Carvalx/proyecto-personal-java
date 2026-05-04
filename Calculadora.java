
import java.util.Scanner;

public class Calculadora {
    public static double sumar(double a, double b) {
            return a + b;
        }
    public static double restar(double a, double b) {
            return a - b;
        }
    public static double multiplicacion(double a, double b) {
            return a * b;
        }
    public static double  division(double a, double b) {
            return a / b;
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int i = -1;
        while (i != 0) {
            System.out.println("1. Suma");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            i = scanner.nextInt();

            //Suma
            if (i == 1) {
                System.out.println("Primer digito");
                double a = scanner.nextDouble();
                System.out.println("Segundo digito");
                double b = scanner.nextDouble();
                System.out.println(sumar(a, b));
            }

            //Resta
            else if (i == 2) {
                System.out.println("Primer digito");
                double a = scanner.nextDouble();
                System.out.println("Segundo digito");
                double b = scanner.nextDouble();
                System.out.println(restar(a, b));
            }

            //Multiplicacion
            else if (i == 3) {
                System.out.println("Primer digito");
                double a = scanner.nextDouble();
                System.out.println("Segundo digito");
                double b = scanner.nextDouble();
                System.out.println(multiplicacion(a, b));
            }

            //Division
            else if (i == 4) {
                System.out.println("Primer digito");
                double a = scanner.nextDouble();
                System.out.println("Segundo digito");
                double b = scanner.nextDouble();

                if(b==0) {
                    System.out.println("Error: no se puede dividir entre 0");
                }else {
                    System.out.println(division(a, b));
                }
            }

            // Si el usuario inserta otro entero que no es de la lista
            else {
                System.out.println("Por favor introducir un digito valido de la lista.");
            }
        }
        // Cierra el scanner
        scanner.close();
    }
    
}
