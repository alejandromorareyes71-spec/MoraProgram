package U3.U3e3.ej1;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JuegoN6 j1=new JuegoN6();
        System.out.println("Introduce un número del 0-63");
        try {
            int num=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Entrada no valida");
        }
        String s2=Integer.toBinaryString(j1.getObjetivo());
        System.out.println(s2);
    }
}
