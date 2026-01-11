package U3.Perro;

public class Perro {
    String raza;
    int numPatas;
    String color;
    public Perro(String raza){
        this.raza=raza;
        this.numPatas=4;
        this.color="azul";
    }
   public Perro(){}


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
