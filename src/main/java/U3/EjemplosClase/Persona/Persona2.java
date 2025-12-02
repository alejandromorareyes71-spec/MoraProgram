package U3.EjemplosClase.Persona;

public class Persona2 {
    private String nombre, apellido;
    private int edad, altura;
    private float peso;
    // Constructor por defecto
    public Persona2() {
        this("", "", 0, 0, 0); // Llama al constructor más completo
    }
    // Constructor con un argumento
    public Persona2(String nombre) {
        this(nombre, "", 0, 0, 0); // Llama al constructor más completo
    }
    // Constructor con dos argumentos
    public Persona2(String nombre, String apellido) {
        this(nombre, apellido, 0, 0, 0); // Llama al constructor más completo
    }
    // Constructor con tres argumentos
    public Persona2(String nombre, String apellido, int edad) {
        this(nombre, apellido, edad, 0, 0); // Llama al constructor más completo
    }
    // Constructor más completo
    public Persona2(String nombre, String apellido, int edad, int altura, float peso) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
        /*
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
         */
    }
//Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
