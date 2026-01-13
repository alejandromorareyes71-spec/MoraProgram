package U3.U3e3.ej2;

public class Guerrera {
    int vida= 20;
    int experiencia =0;
    int nivel=1;

    public Guerrera(){

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int atacar() {
        int dañoTotal = 0;
        // "i" cuenta desde 0 hasta llegar a tu nivel.
        // Si nivel es 3, el bucle da 3 vueltas.
        for (int i = 0; i < this.nivel; i++) {
            int d6 = (int) (Math.random() * 6) + 1;
            dañoTotal += d6;
        }
        return dañoTotal;
    }
    public void incExperiencia(){
        if (this.experiencia>=8){
            this.nivel=2;
        } else if (this.experiencia>17) {
            this.nivel=3;
        }
    }
}
