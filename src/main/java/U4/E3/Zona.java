package U4.E3;

public class Zona {
    private int nivel;
    private boolean jefe;
    private Carta[][] Mcarta=new Carta[3][3];

    public Zona(int nivel,boolean jefe, Carta[][] Mcarta){
        this.nivel=nivel;
        this.jefe=jefe;
        this.Mcarta=new Carta[3][3];
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isJefe() {
        return jefe;
    }

    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }

    public Carta[][] getMcarta() {
        return Mcarta;
    }

    public void setMcarta(int fila,int columna,Carta mcarta) {
       // mcarta[fila][columna]=mcarta;
    }



}



