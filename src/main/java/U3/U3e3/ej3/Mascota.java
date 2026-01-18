package U3.U3e3.ej3;

public class Mascota {

    // Atributos
    private String nombre;
    private int vida;
    private int ataque;

    // Constructor
    public Mascota(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    // Devuelve el daño de la mascota
    public int atacar() {
        return ataque;
    }

    // Recibe daño
    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    // Comprueba si sigue viv
    public boolean estaViva() {
        return vida > 0;
    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre +
                ", vida=" + vida +
                ", ataque=" + ataque + "]";
    }
}

