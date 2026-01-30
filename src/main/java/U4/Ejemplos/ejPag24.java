package U4.Ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class ejPag24 {
    /*
    Codificar en java un programa que pregunte al usuario 5 números diferentes
    (almacenándolos en un ArrayList), y que después calcule la suma de los mismos
    (usando un bucle for-each).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>listaNum= new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.println("Introduce un numero");
            int n1= sc.nextInt();
            listaNum.add(n1);
        }
        int suma=0;
        //igual pero con un iteradoor
        for (int num: listaNum){
            suma+=num;
        }
    }
}
