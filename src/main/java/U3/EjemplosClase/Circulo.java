package U3.EjemplosClase;

public class Circulo {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio>1000){
            System.out.println("no puede ser mayor a 1000");
        }
        else {this.radio = radio;}
    }
}
