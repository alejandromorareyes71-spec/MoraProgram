package U4.Ejemplos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejPag35 {
    public static void main(String[] args) {

        Scanner leerDatos = new Scanner(System.in);
        // Pide palabras hasta que el texto introducido cumpla con el patrón
        String dato = null;
        Matcher comparaFormato = null;
        Pattern formatoInt = Pattern.compile("-?[0-9]{1,9}"); // Genera la expresión regular para enteros
        do {
            System.out.println("Introduce un entero: ");
            dato = leerDatos.next();
            comparaFormato = formatoInt.matcher(dato);
        } while (!comparaFormato.matches());
        // Convierte el texto a un int
        int numero = Integer.parseInt(dato);
        System.out.println(numero + " es un entero");
    }
}
