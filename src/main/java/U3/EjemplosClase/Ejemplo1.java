package U3.EjemplosClase;

import java.util.Date;
import java.util.Calendar;


public class Ejemplo1 {
    public static void main(String[] args) {
// Obtenemos la fecha actual
        Date fechaActual = new Date();
// Obtenemos el calendario actual
        Calendar calendario = Calendar.getInstance();
// Imprimimos la fecha y la hora actual
        System.out.println(fechaActual);
        System.out.println(calendario.getTime());
    }
}
