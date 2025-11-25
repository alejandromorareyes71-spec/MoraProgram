package U3.EjemplosClase;

public class FiguraPrincipal {
    static void main(String[] args) {


        Figura f1 = new Figura(4, "rojo");
        Figura f2 = new Figura(8, "amarillo");



        if (f1.getColor().equals(f2.getColor())){
            System.out.println("El color es el mismo");
        }
        if (f1.getNumLados()== f2.getNumLados()){
            System.out.println("El numero de lados es el mismo");
        }


    }
}