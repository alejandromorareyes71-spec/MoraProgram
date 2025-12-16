package U3.EjemplosClase.juego;

public class Enemigo {
    private int vida;
    private int danio;
    private int nivel;

    public Enemigo(int nivel){
        setNivel(nivel);
        if (nivel==1){
            setVida(6);
            setDanio(2);
        }else if (nivel==2) {
            setVida(12);
            setDanio(5);
        }else {
            //nivel=0
            System.out.println("Nivel no configurado");
        }
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public  int ataqueEnemigo() {
        int d6 = 0;
        int danio=0;
        d6 = (int) (Math.random() * 6) + 1;
        if (d6 == 1) {
            System.out.println("tu ataque no hace daño");
        } else {
            danio=getDanio();
        }
        return danio;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "vida=" + vida +
                ", danio=" + danio +
                ", nivel=" + nivel +
                '}';
    }
}