package U4.e1;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del array");

        int n1= sc.nextInt();
        int [] listaNum= new int [n1];

        for (int i=0;i<n1;i++){
            int numAleatorio=listaNum[i]= (int) ((Math.random()*51)+50);
        }
        //imprimir();
    }
    public int[] intercambiar(int []numAleatorio){
        int  [] intercambiar= new int [numAleatorio.length];
        int contador=numAleatorio.length-1 ;
        for (int i=0; i<numAleatorio.length;i++) {
            intercambiar[i] = numAleatorio[contador];
        contador--;
        }


        return intercambiar;
    }
    public static void imprimir(int [] numAleatorio){
        System.out.print("Array original: [");
        for (int i=0;i<numAleatorio.length;i++){
            if (i==0){
                System.out.print(numAleatorio[i]);

            }else {
                System.out.println(","+numAleatorio[i]);
            }
        }
        System.out.print("]");
    }
}
