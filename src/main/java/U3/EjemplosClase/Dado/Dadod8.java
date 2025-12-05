package U3.EjemplosClase.Dado;

public class Dadod8 {
    private int valor;
    private int numCaras=6;

    public Dadod8() {
        this.valor = 1;

    }
    public Dadod8(int numCaras){
    this.valor=1;
    this.numCaras=numCaras;

    }
    public int lanzarD8(){
        this.valor = (int) (Math.random() * numCaras) + 1;
        return this.valor;
    }


    }
