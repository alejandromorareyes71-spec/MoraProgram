package U3.Dado;

public class Dado2 {
    private int valor;

    public Dado2() {
        this.valor = 1;
    }

    public int lanzar() {
        this.valor = (int) (Math.random() * 6) + 1;
        return this.valor;
    }
}
