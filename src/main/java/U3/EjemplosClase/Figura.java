package U3.EjemplosClase;

public class Figura {
    private int numLados;
    private String color;
    public Figura (int numLados, String color){
        setNumLados(numLados);
        setColor(color);
    }

        public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
