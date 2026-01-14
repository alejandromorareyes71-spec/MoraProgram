package U3.U3e3.ej2;

public class Enemigo {
   private int vida;
   private int danio;
   private int nivel;



    public Enemigo(int vida, int danio, int nivel) {
        this.vida = vida;
        this.danio = danio;
        this.nivel = nivel;
    }

    public Enemigo(int nivel){
        if (nivel==2){
            this.nivel=2;
            this.vida=12;
            this.danio=5;
        }else {
            this.nivel = 1;
            this.vida = 6;
            this.danio = 2;
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

    //Funciones
    public int atacar() {
        int d6 =(int)(Math.random()*6)+1;
        if (d6==1){
        return 0;
        }else {
            return this.danio;
        }
    }

    @Override
    public String toString() {
        return "Enemigo" +
                "\n vida=" + vida +
                "\n danio=" + danio +
                "\n nivel=" + nivel;
    }
}
