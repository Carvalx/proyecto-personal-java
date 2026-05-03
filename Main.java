public class Main {
    public static void main(String[]args) {
        Enemigo enemigo1 = new Enemigo("Vibora", 95, 15);
        Enemigo enemigo2 = new Enemigo("Estribo", 100, 14);

        enemigo1.recibirDanio(35);
        enemigo1.estaVivo();
        enemigo1.recibirDanio(35);
        enemigo1.recibirDanio(35);
        System.out.println(enemigo1.estaVivo());

        enemigo2.recibirDanio(45);
        enemigo2.recibirDanio(35);
        System.out.println(enemigo2.estaVivo());
    }
}