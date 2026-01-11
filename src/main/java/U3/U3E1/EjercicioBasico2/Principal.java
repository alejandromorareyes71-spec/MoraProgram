package U3.U3E1.EjercicioBasico2;

public class Principal {
   public static void main() {
        Producto p1= new Producto("Manzana", 1, 10);
        double Total= p1.calcularTotal(p1.getPrecio(), p1.getCantidad());
       System.out.println("Precio: " + Total);
    }
}
