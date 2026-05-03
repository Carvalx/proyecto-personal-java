public class Enemigo {
    String nombre;
    int vida;
    int velocidad;

    public Enemigo (String nombre, int vida, int velocidad){
        this.nombre = nombre;
        this.vida = vida;
        this.velocidad = velocidad;
    }

    public void recibirDanio(int danio) {
        vida = vida - danio;
    }

    public boolean  estaVivo(){
        return vida > 0;
    }

    public void verVida() {
        System.out.println(vida);
    }
}
