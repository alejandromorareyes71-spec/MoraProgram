package U3.EjemplosClase.Ej1.EjercicioBasico2;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto (){
        setNombre("nombre");
        setPrecio(0.0);
        setCantidad(0);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double calcularTotal(double precio, int cantidad){
        double total=precio*cantidad;
        return total;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
