package U4.Ejemplos.src;

public class ej3 {
    public static void main(String[] args) {
        // 1. DECLARACIÓN: n1 tiene 10 espacios, n2 tiene 15.
        int [] n1 = new int[10];
        int [] n2 = new int[15];

        int numero = 2;

        // 2. EL PELIGRO: El bucle intenta dar 15 vueltas (n2.length es 15)
        for (int i = 0; i < n2.length; i++){
            if (i<10){
                n1[i] = numero; //10 primeros pares
                System.out.println("n1="+n1[i]);

            }

            n2[i] = numero - 1; //15 primeros impares
            numero += 2;
            System.out.println("n2="+n2[i]);
        }
    }
}