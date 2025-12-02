package U3.EjemplosClase.Circulo;

public class CirculoPrincipal {

    public static void main(String[] args) {

    Circulo c1 = new Circulo(4.5, 3);
        System.out.println(c1.getNumLados());

        System.out.println(c1.getRadio());

        double perimetro=2*3.14* c1.getRadio();
        System.out.println("El perimetro es: " + perimetro);
    }
}