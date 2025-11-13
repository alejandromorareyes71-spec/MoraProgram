package U2;
import java.util.Scanner;
public class Pexam_ej2 {
    public static void main(String[] args) {
        // Objeto Scanner para capturar la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine(); // Lee la frase inicial del usuario.

        int opcion = 0;
        do {
            // 1. Pide al usuario que seleccione una opción del menú.
            opcion = pedirOpcion(scanner, frase);

            // 2. Ejecuta la acción correspondiente a la opción elegida.
            procesarOpcion(opcion, frase, scanner);

        }while(opcion != 4); // El bucle continúa hasta que la opción elegida sea 4 (Salir).

        System.out.println("¡Gracias por usar el programa! Saliendo...");
        // Cerramos el objeto Scanner para liberar recursos.
        scanner.close();
    }

    /**
     * Ejecuta la lógica asociada a la opción del menú seleccionada por el usuario.
     * @param opcion El número de opción elegido (1, 2, 3 o 4).
     * @param frase La frase introducida por el usuario para ser procesada.
     * @param scanner El objeto Scanner.
     */
    public static void procesarOpcion(int opcion, String frase, Scanner scanner) {

        switch (opcion) {
            case 1:
                // IMPLEMENTACIÓN COMPLETA: Contar Vocales.
                int numVocales = contarVocales(frase);
                System.out.println("Resultado de Contar Vocales:");
                System.out.println("La frase tiene " + numVocales + " vocales.");
                break;

            case 2:
                // Lógica pendiente: Contar Consonantes.
                System.out.println("\nLa opción 2 (Contar Consonantes) aún no está implementada.");
                // int numConsonantes = contarConsonantes(frase);
                // System.out.println("La frase tiene " + numConsonantes + " consonantes.");
                break;

            case 3:
                // Lógica pendiente: Invertir Palabras.
                System.out.println("\nLa opción 3 (Invertir Palabras) aún no está implementada.");
                // String fraseInvertida = invertirPalabras(frase);
                // System.out.println("Frase invertida: " + fraseInvertida);
                break;

            case 4:
                // Salir: No se necesita lógica aquí, el bucle 'do-while' se encargará de la salida.
                break;

            default:
                // Opción por defecto para manejar números fuera del rango 1-4.
                if (opcion != 0) { // El 0 se usa para manejar errores de entrada no numérica.
                    System.out.println("Opción " + opcion + " no es válida. Por favor, seleccione un número del 1 al 4.");
                }
                break;
        }
    }

    /**
     * Método stub: Debería invertir las palabras de la frase.
     * @param frase La cadena de texto a invertir.
     * @return La frase con el orden de sus palabras invertido.
     */
    public static String invertirPalabras(String frase) {
        String invertida = "";
        return invertida;
    }

    /**
     * Muestra el menú de opciones y pide al usuario que elija una.
     * Gestiona la lectura de la opción y maneja entradas inválidas.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @param frase La frase introducida (mostrada como contexto).
     * @return El número de opción elegido por el usuario (o 0 si la entrada es inválida).
     */
    public static int pedirOpcion(Scanner scanner, String frase) {
        int opcion = 0;

        System.out.println("--- Menú de Operaciones ---");
        System.out.println("Frase actual:" + frase);
        System.out.println("1. Contar Vocales");
        System.out.println("2. Contar Consonantes");
        System.out.println("3. Invertir Palabras");
        System.out.println("4. Salir del programa");
        System.out.print("Ingrese el número de opción: ");

        // Comprueba si la próxima entrada es un entero para evitar errores
        if (scanner.hasNextInt()) {
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea pendiente
        } else {
            // Manejo de error si el usuario introduce texto en lugar de número
            System.out.println("Error: Solo se admiten números para las opciones.");
            scanner.nextLine(); // Limpiar el buffer de entrada
            opcion = 0; // Devolver 0 para que el bucle se repita
        }

        return opcion;
    }

    /**
     * IMPLEMENTACIÓN COMPLETA:
     * Cuenta el número total de vocales (a, e, i, o, u) en la frase,
     * incluyendo las vocales acentuadas.
     * @param frase La cadena de texto a analizar.
     * @return El número total de vocales encontradas.
     */
    public static int contarVocales(String frase) {
        int vocales = 0; // Contador inicializado a cero.

        // Normalizamos la frase a minúsculas para simplificar la comparación.
        String fraseMinusculas = frase.toLowerCase();

        // Iteramos sobre cada carácter de la frase normalizada.
        for (int i = 0; i < fraseMinusculas.length(); i++) {

            char caracter = fraseMinusculas.charAt(i);

            // Verificamos si el carácter es una vocal (incluyendo tildes y 'ü').
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'á':
                case 'é':
                case 'í':
                case 'ó':
                case 'ú':
                case 'ü':
                    vocales++; // Si es una vocal, incrementamos el contador.
                    break;
                default:
                    // Si no es vocal, pasamos al siguiente carácter.
                    break;
            }
        }

        return vocales; // Devolvemos el resultado final.
    }

    /**
     * Método stub: Debería contar el número total de consonantes.
     * @param frase La cadena de texto a analizar.
     * @return El número total de consonantes.
     */
    public static int contarConsonantes(String frase) {
        int consonantes = 0;
        return consonantes;
    }
}

