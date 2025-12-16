package U3.EjemplosClase.juego;

public class Guerrera {
  private   int vida;
  private   int experiencia;
  private   int nivel;

public Guerrera(){
    setVida(20);
    setExperiencia(0);
    setNivel(1);
}
public Guerrera (int vida, int experiencia, int nivel){
    setNivel(vida);
    setVida(vida);
    setExperiencia(experiencia);
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
        int d6=0;
        int danio=0;
        for (int x=0; x<nivel;x++){
            danio=(int) (Math.random()*6)+1;
            System.out.println("has hecho "+danio+" puntos de daño");
            d6+=danio;
        }
        return d6;
    }
    public void incExperiencia(int num){
    experiencia +=num;
    if (nivel==1){
        if (experiencia > 8) {
            nivel++;
            System.out.println("Subiste al nivel 2");
        }
        }
if (nivel==2){
    if (experiencia>=17){

}
}
    }

    @Override
    public String toString() {
        return "Guerrera{" +
                "vida=" + vida +
                ", experiencia=" + experiencia +
                ", nivel=" + nivel +
                '}';
    }
}
