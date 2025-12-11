package U3.EjemplosClase.EjercicioPropuesto;

public class Principal {
    static void main() {
       Guerrera g1 =new Guerrera();
       while (!(g1.getVida()>=0)){
           Enemigo e1=new Enemigo(1);
           while (!(g1.getVida()>=0&&e1.getVida()>=0)){
            int d1=  g1.atacar();
            e1.setVida(e1.getVida()-d1);
               System.out.println("El enemigo "+ e1.getVida()+ "puntos de vida");
                if (e1.getVida()<=0){
                    System.out.println("El enemigo ha muerto");
                }else {
                    int d2 = e1.ataqueEnemigo();
                    g1.setVida(g1.getVida() - d2);
                    System.out.println("La guerrera tiene " + g1.getVida() + " puntos de vida");
                }
           }
           System.out.println("El enemigo ha muerto");
       }
    }
}
