package U3.Figura;

public class Figura {
    private int numLados;
    private String color;
    public Figura (int numLados, String color){
        setNumLados(numLados);
        setColor(color);
    }
    public Figura(int numLados){
        setNumLados(numLados);
    }
    public Figura(String color){
        setColor(color);
    }
        public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        if (numLados<0){numLados=1;
        }else {
            this.numLados = numLados;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura1: "+
                "numLados=" + numLados +
                " color=" + color;

    }
}
