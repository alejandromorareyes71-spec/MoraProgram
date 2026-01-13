package U4.Ejemplos.src;

import java.util.Arrays;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        /*
        int [][] numeros= new int [3][3];
        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[0][2]=3;
        numeros[1][0]=4;
        numeros[1][1]=5;
        numeros[1][2]=6;
        numeros[2][0]=7;
        numeros[2][1]=8;
        numeros[2][2]=9;
         */
/*
        int contador=1;
        for (int i=0; i<3;i++){
            for (int j=0;j<3; j++){
                numeros[i][j]=contador;
                contador++;
            }
        }

 */
        Scanner teclador=new Scanner(System.in);
        System.out.printf("¿Tamaño de la matriz?");
        int tamano= teclador.nextInt();

        int [][] numeros= new int [tamano][tamano];
        for (int i=0; i<tamano;i++){
            for (int j=0;j<tamano; j++){
                numeros[i][j]=i*tamano +j +1;
            }
        }


        for (int i=0;i<tamano;i++){
            for (int j=0; j<tamano;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }


    }
}
