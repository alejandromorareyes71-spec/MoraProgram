package U3.EjemplosClase.Dado;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        String usuario2;
        Scanner teclado=new Scanner(System.in);
        /*
        Dado dado = new Dado();
        int d1= dado.lanzar();
        Dado2 dado2=new Dado2();
        int d2= dado2.lanzar();
        Dado3 dado3=new Dado3();
        int d3= dado3.lanzar();
        System.out.println("Dado1="+d1+" "+"Dado2="+d2+" "+"Dado3="+d3);
        int total=d1+d2+d3;
        System.out.println("El total de los dador es "+total);

         */

        int lanzo;
        System.out.println("Cuantas caras tiene tu dado");
        int  usuario= teclado.nextInt();
        Dadod8 dadod8=new Dadod8(usuario);
        int suma=0;
        int numLanzamiento=0;
        do {
            System.out.println("Lo quieres lanzar?");
            usuario2= teclado.next();
            lanzo= dadod8.lanzarD8();
            suma= suma+lanzo;
            numLanzamiento++;
            System.out.println("Resultado="+lanzo);
            System.out.println("Numero de lanzamientos"+numLanzamiento);
            System.out.println("Suma Total="+suma);
        }while (!(usuario2.equalsIgnoreCase("No")));
        System.out.println("fin del programa");
    }
}