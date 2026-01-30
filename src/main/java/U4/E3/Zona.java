package U4.E3;

public class Zona {

    // Atributos
    private int nivel;
    private boolean jefe;
    private Carta[][] Mcarta;

    // Constructor
    public Zona(int nivel, boolean jefe) {
        this.nivel = nivel;
        this.jefe = jefe;
        this.Mcarta = new Carta[3][3];
    }

    // Métodos Getter y Setter
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

    public void setMcarta(int fila, int columna, Carta carta) {
        // Implementación del método basado en la estructura de la fuente [1, 4]
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            this.Mcarta[fila][columna] = carta;
        }
    }
}