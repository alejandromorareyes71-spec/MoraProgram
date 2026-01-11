package U3.U3E1.EjercicioBasico1;

public class Principal {
   public static void main() {
       Coche c0=new Coche();
       Coche c1=new Coche("BMW","A21",2002);

       System.out.println(c0);

       //comparar
       if (c0.getModelo().equals(c1.getModelo())){
           System.out.println("el modelo es igual");
       }else {
           System.out.println("el modelo no es igual");
       }
       if (c0.getMarca().equals(c1.getMarca())){
           System.out.println("la marca es igual");
       }else {
           System.out.println("la marca no es igual");
       }
       if (c0.getAño()== c1.getAño()){
           System.out.println("El año es igual");
       }else{
           System.out.println("El año no es igual");
       }
    }
}
