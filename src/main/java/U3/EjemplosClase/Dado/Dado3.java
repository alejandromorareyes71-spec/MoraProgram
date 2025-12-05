package U3.EjemplosClase.Dado;

public class Dado3 {
    private int valor;

    public Dado3() {
        this.valor = 1;
    }

    public int lanzar() {
        this.valor = (int) (Math.random() * 6) + 1;
        return this.valor;
    }

}