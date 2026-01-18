package U3.U3e3.ej1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JuegoN6 juego = new JuegoN6();

        boolean acertado = false;

        while (!acertado) {

            byte num = -1;
            boolean numeroValido = false;

            // Pedir número entre 0 y 63
            while (!numeroValido) {
                try {
                    System.out.print("Introduce un número entre 0 y 63: ");
                    int aux = sc.nextInt();
                    if (aux >= 0 && aux <= 63) {
                        num = (byte) aux;
                        numeroValido = true;
                    } else {
                        System.out.println("Número fuera de rango.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada no válida.");
                    sc.next();
                }
            }

            if (num == juego.getObjetivo()) {
                acertado = true;

                System.out.println("\n¡Has acertado!");
                System.out.println("Número objetivo (binario): " + PasarAstring(juego.getObjetivo()));
                System.out.println("Pistas tipo 1 usadas: " + juego.getP1());
                System.out.println("Pistas tipo 2 usadas: " + juego.getP2());
                System.out.println("Total de pistas usadas: " + juego.getPistasGastadas());

            } else {
                boolean pistaValida = false;

                while (!pistaValida) {
                    try {
                        System.out.print("Elige pista (1 o 2): ");
                        int tipo = sc.nextInt();

                        if (tipo == 1) {
                            boolean res = juego.pistaUno(num);
                            System.out.println("¿Mismo número de unos?: " + res);
                            pistaValida = true;
                        } else if (tipo == 2) {
                            int res = juego.pistaDos(num);
                            System.out.println("Unos en posición correcta: " + res);
                            pistaValida = true;
                        } else {
                            System.out.println("Pista incorrecta.");
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada no válida.");
                        sc.next();
                    }
                }
            }
        }
        sc.close();
    }

    // Conversión a binario SIN usar Strings intermedios
    private static String PasarAstring(byte num) {
        String bin = "";
        for (int i = 5; i >= 0; i--) {
            bin += ((num >> i) & 1);
        }
        return bin;
    }
}

