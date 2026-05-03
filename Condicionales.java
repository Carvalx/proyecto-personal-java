public class Condicionales {
    public static void main(String[] args) {
        int hora = 21;

        if (hora < 12) {
            System.out.println("Buenos dias!");
        }
        else if (hora > 12 && hora < 20) {
            System.out.println("Buenas tardes!");
        }
        else {
            System.out.println("Buenas noches!");
        }
    }
}
