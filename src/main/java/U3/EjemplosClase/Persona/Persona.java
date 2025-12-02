package U3.EjemplosClase.Persona;

public class Persona {
    private String nombre, apellido;
    private int edad, altura;
    private float peso;

    // Constructor por defecto
    public Persona() {
        //this("","",0,0,0);
        setNombre("David");
        setApellido("García");
        setEdad(36);
        setAltura(172);
        setPeso(66);
    }

    // Constructor con 3 argumentos
    public Persona(String nombre, String apellido, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setAltura(178);
        setPeso(88);
    }


    // Constructor con todos los argumentos
    public Persona(String nombre, String apellido, int edad, int altura, int peso) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
    }

    // TODO: Aquí estaría el código de setNombre, setApellido, setEdad, setAltura y setPeso


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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
