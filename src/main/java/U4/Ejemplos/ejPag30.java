package U4.Ejemplos;

public class ejPag30 {
    public static void main(String[] args) {
        String texto = "Esta es una cadena de texto con varias palabras.";
// \W+ separa por cualquier caracter que no sea una letra o un número
        String[] palabras = texto.split("\\W+");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        System.out.println(texto.length());

    }
}
