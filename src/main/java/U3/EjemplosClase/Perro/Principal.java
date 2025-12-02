package U3.EjemplosClase.Perro;

public class Principal {
 public static void main(String[] args) {
        Perro3 p1=new Perro3("dalmata",3);
        Perro3 p2=new Perro3("dddd",5);
        System.out.println(p1);
     p1.pasear();
     System.out.println(p1);
     p1.contento();
     System.out.println(p1);
     System.out.println(p2);

     p1.imprimirPerros();
     System.out.println(Perro3.num_perros);
     //Methodos static
     String imprimir =Perro3.comer(800);
     System.out.println(imprimir);


     Perro3.comidaDouble(99.9);

    }
}
