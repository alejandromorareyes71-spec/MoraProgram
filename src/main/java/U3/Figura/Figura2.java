package U3.Figura;

public class Figura2 {
    private int numLados;
    private String color;
    public Figura2(int numLados, String color){
        setNumLados(numLados);
        setColor(color);
    }
    public Figura2(int numLados){
       this.numLados=4;
    }

    public Figura2(String color) {
        this.color = "color";
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        //Si el número de lados es menor a 0 numLados vale 1
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
        return "Figura2: " +
                "numLados=" + numLados +
                " color=" + color ;
    }
}


