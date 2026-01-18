package U3.U3e3.ej1;

import java.util.Random;

public class JuegoN6 {

    // Atributos
    private byte objetivo;
    private int pistasGastadas;
    private int p1;
    private int p2;

    // Constructor por defecto
    public JuegoN6() {
        Random r = new Random();
        this.objetivo = (byte) r.nextInt(64); // 0 a 63
        this.pistasGastadas = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    // Getters
    public byte getObjetivo() {
        return objetivo;
    }

    public int getPistasGastadas() {
        return pistasGastadas;
    }

    public int getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }


    // Pista tipo 1: mismo número de bits a 1
    public boolean pistaUno(byte num) {
        pistasGastadas++;
        p1++;
        return contarUnos(objetivo) == contarUnos(num);
    }

    // Pista tipo 2: bits a 1 en la misma posición
    public int pistaDos(byte num) {
        pistasGastadas++;
        p2++;

        int contador = 0;
        byte resultado = (byte) (objetivo & num);

        for (int i = 0; i < 6; i++) {
            if ((resultado & 1) == 1) {
                contador++;
            }
            resultado >>= 1;
        }
        return contador;
    }

    // contar bits que tienen 1
    private int contarUnos(byte num) {
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            if ((num & 1) == 1) {
                contador++;
            }
            num >>= 1;
        }
        return contador;
    }


}
