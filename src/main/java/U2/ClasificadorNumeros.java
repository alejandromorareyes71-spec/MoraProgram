import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase ClasificadorNumeros
 * Permite introducir tres números y clasificarlos para averiguar cuál es el mayor, el mediano y el mininmo.
 *
 * @author Alejandro Mora Reyes
 * @version 1.0
 */
public class ClasificadorNumeros {

    // --- Funciones de Clasificación ---

    /**
     * --- Función mayor ---
     * Compara con un if los numeros y devuelve el número mas grande.
     * @param n1 El primer número a comparar.
     * @param n2 El segundo número a comparar.
     * @param n3 El tercer número a comparar.
     * @return El valor entero que es el mayor de los tres.
     */
    public static int mayor(int n1, int n2, int n3) {
        /** Caso 1: n1 es el más grande
         * Esto ocurre si n1 es mayor o igual que n2 Y n1 es mayor o igual que n3.
         * @return n1
         */
        if (n1 > n2 && n1 > n3) {
            return n1;
        }

        /** Caso 2: n2 es el más grande
         * Esto ocurre si n2 es mayor o igual que n1 Y n2 es mayor o igual que n3.
         * @return n2
         */
        else if (n2 > n1 && n2 > n3) {
            return n2;
        }

        /** Caso 3: n3 es el más grande
         * Si n1 y n2 no son el máximo, por descarte, n3 debe ser el máximo.
         * @return n3
         */
        else {
            return n3;
        }
    }

    /**
     * Compara con un if los numeros y devuelve el número mas pequeño.
     * @param n1 El primer número a comparar.
     * @param n2 El segundo número a comparar.
     * @param n3 El tercer número a comparar.
     * @return El valor entero que es el menor de los tres.
     */
    public static int minimo(int n1, int n2, int n3) {
        /** Esto ocurre si n1 es menor o igual que n2 Y n1 es menor o igual que n3.
         *@return n1
         */
        if (n1 < n2 && n1 < n3) {
            return n1;
        }

        /** Caso 2: n2 es el más pequeño
         * Esto ocurre si n2 es menor o igual que n1 Y n2 es menor o igual que n3.
         */
        else if (n2 < n1 && n2 < n3) {
            return n2;
        }

        /** Caso 3: n3 es el más pequeño
         * Si n1 y n2 no son el mínimo, por descarte, n3 debe ser el mínimo.
         * (Esto también cubre el caso donde los tres son iguales).
         */
        else {
            return n3;
        }
    }

    /**
     * --- Función mediano ---
     * Compara con un if los numeros y devuelve el número mediano.
     * @param n1 El primer número.
     * @param n2 El segundo número.
     * @param n3 El tercer número.
     * @return El número introducido que se encuentra entre el número mayor y el número pequeño.
     */
    public static int mediano(int n1, int n2, int n3) {

        /** Caso 1: n1 es el mediano
         * Esto ocurre si n1 está entre n2 y n3
         * @return n1
         */
        if ((n2 < n1 && n1 < n3) || (n3 < n1 && n1 < n2)) {
            return n1;
        }

        /** Caso 2: n2 es el mediano
         * Esto ocurre si n2 está entre n1 y n3.
         * @return n2
         */
        else if ((n1 < n2 && n2 < n3) || (n3 < n2 && n2 < n1)) {
            return n2;
        }

        /** CASO 3: n3 es el mediano
         *  Si n1 no es el mediano y n2 no es el mediano, por descarte, n3 debe ser el mediano.
         * @return n3
         */

        else {
            return n3;
        }
    }

    /**  --- Función Principal (Main) ---
     * Metodo principal que gestiona la entrada de datos, validación y el menú de usuario.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        boolean entradaCorrecta = false;

        /** 1. Pedir los tres números por teclado
         * Comprueba que los numeros introducidos son positivos enteros
         * Si no es correcto muestra un mensaje de error
         * Limpia la entrada por teclado y vuelve a pedir los datos hasta que la entrada sea correcta
         */
        System.out.println("--- Introduce tres numeros positivos ---");

        while (!entradaCorrecta) {
            try {
                System.out.print("Introduce el primer: ");
                num1 = teclado.nextInt();
                System.out.print("Introduce el segundo número: ");
                num2 = teclado.nextInt();
                System.out.print("Introduce el tercer número: ");
                num3 = teclado.nextInt();

                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.err.println("¡Error de entrada! Por favor, introduce solo números enteros.");
                teclado.next(); // Limpia el teclado
            }
        }

        /** --- ASERCIÓN 1  ---
         * Validar que sean positivos
         */
        assert num1 >= 0 && num2 >= 0 && num3 >= 0 : "Error No se permiten números negativos.";

        // 2. Llamar a las funciones
        int resultadoMayor = mayor(num1, num2, num3);
        int resultadoMediano = mediano(num1, num2, num3);
        int resultadoMinimo = minimo(num1, num2, num3);

        /** --- ASERCIÓN 2 --
         * Verificamos que el mayor sea realmente mayor o igual al pequeño.
         */
        assert resultadoMayor >= resultadoMinimo : "Error Lógico: El número mayor no puede ser menor que el pequeño.";

        System.out.println("Números ingresados correctamente: " + num1 + ", " + num2 + ", " + num3);

        /**
         *Comprueba que los tres números introducidos coinciden y dan la información al usuario dependiendo de que numeros coinciden.
         */
        if (resultadoMayor == resultadoMediano && resultadoMayor == resultadoMinimo) {
            System.out.println("Los tres numeros son iguales."); // Se imprime si los 3 son iguales
        } else if (resultadoMayor == resultadoMinimo) {
            System.out.println("El numero mayor y el pequeño son iguales");
        } else if (resultadoMayor == resultadoMediano) {
            System.out.println("El numero mayor y el mediano son iguales");
        } else if (resultadoMediano == resultadoMinimo) {
            System.out.println("El numero mediano y el pequeño son iguales");
        } else {
            System.out.println("Los tres numeros son diferentes");
        }


        /** 3. Crear el menú de selección
         * Pide un número al usuario entre 1 y 5
         * Si el número está fuera de rango muestra un mensaje y vuelve a pedir la opcion.
         * Si lo que se introduce por teclado no es número muestra un mensaje de error limpia la entrada por teclado y vuelve a pedirlo.
         * Controla las excepciones para que lo que mete el usuario por teclado es solo un número entre 1 y 5.
         */
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("--- Elige tu opción ---");
            System.out.println("1. Mostrar el número Mayor");
            System.out.println("2. Mostrar el número Mediano");
            System.out.println("3. Mostrar el número Pequeño");
            System.out.println("4. Mostrar los tres números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("El número mayor es: " + resultadoMayor);
                        break;
                    case 2:
                        System.out.println("El número mediano es: " + resultadoMediano);
                        break;
                    case 3:
                        System.out.println("El número pequeño es: " + resultadoMinimo);
                        break;
                    case 4:
                        System.out.println("Mayor: " + resultadoMayor + " Mediano: " + resultadoMediano + " Pequeño: " + resultadoMinimo);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa....");
                        break;
                    default: // Impide introducir numeros fuera de rango
                        System.out.println("Opción desconocida. Por favor elija entre 1 y 5.");
                        break;
                }
            } else {
                //Impide introducir otra cosa que no sea un numero
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                teclado.next(); // Limpia el teclado
            }
        }
    }
}