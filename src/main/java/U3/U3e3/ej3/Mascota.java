package U3.U3e3.ej3;

public class Mascota {
   private String nombre;
   private int vida;
   private int ataque;
    public Mascota() {}
    public Mascota(String nombre, int vida, int ataque){
    setNombre(nombre);
    setVida(vida);
    setAtaque(ataque);
    }
    public Mascota(int vida, int ataque, String nombre){
        setVida(vida);
        setAtaque(ataque);
        setNombre(nombre);

    }
    public Mascota(int ataque, String nombre, int vida){
        setAtaque(ataque);
        setNombre(nombre);
        setVida(vida);

    }


    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    //Métodos






    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque ;
    }
}
