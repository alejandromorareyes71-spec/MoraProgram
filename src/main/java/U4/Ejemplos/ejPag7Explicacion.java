package U4.Ejemplos;

import java.util.Arrays;

public class ejPag7Explicacion {
    public static void main(String[] args) {

        // 1. Definimos el array de origen (el que tiene todos los datos)
        int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 2. Usamos Arrays.copyOfRange para extraer una porción
        // Parámetros: (arrayOriginal, desdeDonde, hastaDonde)
        int[] m2 = Arrays.copyOfRange(m1, 1, 3);

        /* EXPLICACIÓN DE LOS ÍNDICES:
           Índice 1: Es el valor 2 (SÍ se incluye)
           Índice 3: Es el valor 4 (NO se incluye, es el límite)
           Resultado esperado: {2, 3}
        */

        // 3. Imprimimos el resultado para verificar
        System.out.println("Array original: " + Arrays.toString(m1));
        System.out.println("Nuevo array (rango 1 a 3): " + Arrays.toString(m2));

        // Ejemplo extra: Si quisiéramos copiar del índice 0 al 5
        // int[] grades3 = Arrays.copyOfRange(grades1, 0, 5); // Daría: {1, 2, 3, 4, 5}
        /*
        for (int i =0; i<(grades2.length+i++){
            System.out.print(grades2[i]+" ");
        }

         */
    }

}
