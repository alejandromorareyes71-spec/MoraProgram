package U4.Ejemplos;

import java.util.Arrays;

public class ejPag7 {
    public static void main(String[] args) {
        int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] m8 = Arrays.copyOfRange(m1,2,4);
        int[] m4 = {1, 2, 3, 4};


        int [] m3= pasarA8(m4,0,4);
        for (int j=0;j<m3.length;j++){
            System.out.print(m3[j]+" ");
        }

    }
    public static int[] pasarA8 (int []m1otro, int inicio, int ultimo){
        int [] aux= Arrays.copyOfRange(m1otro,inicio,ultimo);
        //rellenar aux con 8
        int num=8;
        for (int i=0;i<ultimo;i++){
            aux[i]=num;

        }
        return aux;
    }

    public  static  int[] copia(int[]m1otro ,int inicio, int ultimo){
        int []aux= new int[ultimo-inicio];
        int contador=0;
        for (int i=inicio;i<ultimo;i++){
            aux[contador]=m1otro[i];
            contador++;
        }
        return aux;
    }
}