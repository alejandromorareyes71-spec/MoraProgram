package U3.Circulo;

public class Circulo {
    private double radio;
    private int numLados;
    private String color;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio<0){
            this.radio=Double.MIN_VALUE;
        }else {
                this.radio = radio;}
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

    public Circulo (double radio, int numLados){
        setRadio(radio);
        this.numLados=numLados;




    }
}
