package U4.Ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class ejPag29 {
    public static void main(String[] args) {
        //Lista de numeros
        ArrayList<Integer> numeros= new ArrayList<>(50);
        ArrayList<Integer> auxNumeros=new ArrayList<>();
        for (int i=0;i<numeros.size();i++) {
            numeros.add((int) (Math.random() * 50));
        }


        //Lista de letras
        ArrayList<String> letras= new ArrayList<>();
        for (int i=0;i<50;i++) {
            String s1="";
            int numAleatorio=((int) (Math.random() * 122)+65);
            char pasarLetra= (char) ('a'+numAleatorio);
            letras.add(s1+pasarLetra);
        }
        System.out.println("Listas");
        System.out.println(numeros);
        System.out.println(letras);


        System.out.println("lista ordenadas");
        Collections.sort(letras);
        System.out.println(letras);
        Collections.sort(numeros);
        System.out.println(numeros);

        System.out.println("Listas reversa");
        Collections.reverse(numeros);
        Collections.reverse(letras);
        System.out.println(numeros);
        System.out.println(letras);

    }
}
