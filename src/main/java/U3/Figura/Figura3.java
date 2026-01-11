package U3.Figura;

public class Figura3 {
    private int numLados;
    private String color;
    public Figura3(int numLados, String color){
       setColor(color);
       setNumLados(numLados);
    }
    public Figura3(int numLados){
        setNumLados(4);
    }
    public Figura3(String color){
        setColor("azul");
    }
    public Figura3(){
        this(6,"amarillo");
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
        return "Figura3: " +
                "numLados=" + numLados +
                " color=" + color ;
    }
}


