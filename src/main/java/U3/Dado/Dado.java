package U3.Dado;

public class Dado {
    private int valor;

    public Dado() {
        this.valor = 1;
    }

    public int lanzar() {
        this.valor = (int) (Math.random() * 6) + 1;
        return this.valor;
    }
    public static int SumarDados(Dado d1, Dado2 d2){
        int valor1 = d2.lanzar();
        int valor2= d1.lanzar();
        int suma=valor1+valor2;
        return suma;
    }
}
