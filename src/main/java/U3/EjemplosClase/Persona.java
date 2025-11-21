package U3.EjemplosClase;

public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " +
                edad + " años.");
    }

    public void setEdad(int edadNueva) {
        if (edadNueva< 0) {
            System.out.println("La edad debe ser un número positivo");
            edad = 0;
        } else {
            edad = edadNueva;
            }
        }
    }
