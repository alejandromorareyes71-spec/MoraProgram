package U2; // Define el paquete al que pertenece la clase.

import java.util.Scanner; // Importa la clase Scanner, necesaria para leer la entrada del usuario.

public class Pexam_ej1 { // Definición de la clase principal.

    // Enumeración (Enum) para definir los posibles estados o tipos de usuario.
    public enum Usuario {
        REGISTRADO,   // Estado: El usuario está registrado.
        NO_REGISTRADO, // Estado: El usuario no está registrado (pero tal vez puede crear una cuenta).
        INVITADO;     // Estado: El usuario está navegando sin identificarse.
    }

    // Método principal: El punto de inicio de la ejecución del programa.
    public static void main(String[] args) {

        // 1. Inicialización
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para capturar datos de la consola.

        // Llama al método para obtener el tipo de usuario.
        // Actualmente, este método SIEMPRE devuelve 'Usuario.INVITADO'.
        Usuario user = obtenerTipoUsuario(sc);

        String opcion = ""; // Inicializa la variable que almacenará la opción seleccionada del menú.

        // 2. Bucle principal del programa (Menú)
        do {
            // Llama al método que debería mostrar el menú y obtener la opción del usuario.
            // Actualmente, este método SIEMPRE devuelve una cadena vacía "".
            opcion = opcionMenu(sc, user);

            // Llama al método para procesar y mostrar el resultado de la opción elegida.
            // Actualmente, este método NO CONTIENE CÓDIGO (no hace nada).
            mostrarResultado(opcion);

        } while(!opcion.equals("SALIR")); // Condición de salida: el bucle se repite hasta que la opción sea "SALIR".
        // ATENCIÓN: Como 'opcion' es siempre "", el bucle se ejecuta INDEFINIDAMENTE (loop infinito).
    }

    // --- Métodos de Ayuda ---

    /**
     * Método stub: Debería procesar la opción seleccionada (p. ej., mostrar información, hacer cálculos).
     * @param opcion La opción elegida por el usuario (ej. "OPCION1", "SALIR").
     */
    public static void mostrarResultado(String opcion) {
        // Lógica pendiente: Aquí debería ir el código para manejar cada opción (p. ej., con un switch).
    }

    /**
     * Método stub: Debería mostrar el menú de opciones al usuario y leer su selección.
     * @param sc El objeto Scanner para leer la entrada.
     * @param user El tipo de usuario actual para adaptar las opciones del menú.
     * @return La opción de menú que el usuario ha escrito.
     */
    public static String opcionMenu(Scanner sc, Usuario user) {
        String opcionSalida = ""; // Inicializa la variable de retorno.

        // Lógica pendiente: Aquí debería ir el código para:
        // 1. Imprimir las opciones del menú.
        // 2. Leer la entrada del usuario con el Scanner 'sc'.

        return opcionSalida; // Actualmente, SIEMPRE devuelve una cadena vacía "".
    }

    /**
     * Método stub: Debería determinar y devolver el tipo de usuario.
     * @param scan El objeto Scanner (actualmente no se utiliza).
     * @return El tipo de usuario.
     */
    public static Usuario obtenerTipoUsuario(Scanner scan){
        Usuario salida = Usuario.INVITADO; // Asigna por defecto el tipo INVITADO.
        Usuario salida2= Usuario.NO_REGISTRADO;
        Usuario salida3=Usuario.REGISTRADO;
        // Lógica: pendiente Aquí podría ir código para pedir al usuario que se registre/identifique.

        return salida; // Actualmente, SIEMPRE devuelve Usuario.INVITADO.
    }
}