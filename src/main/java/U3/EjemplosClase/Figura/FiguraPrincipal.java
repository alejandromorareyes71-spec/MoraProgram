package U3.EjemplosClase.Figura;

public class FiguraPrincipal {
    static void main(String[] args) {

        Figura f1=new Figura(1,"amarillo");
        Figura2 f2= new Figura2(-100,"amarillo");
        Figura3 f3=new Figura3(1,"amarillo");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);




        //Comparación

        Figura figura1 = new Figura(4, "rojo");
        Figura figura2 = new Figura(8, "rojo");
        if (figura1.getColor().equals(figura2.getColor()) &&  figura1.getNumLados()== figura2.getNumLados()){
            System.out.println("El color y el numero de lados es el mismo");
        } else if (figura1.getColor().equals(figura2.getColor())) {
            System.out.println("el color es igual");
        } else if (figura1.getNumLados()== figura2.getNumLados()) {
            System.out.println("El numero de lados es igual");
        }else {
            System.out.println("No son iguales");
        }
    }


    }
