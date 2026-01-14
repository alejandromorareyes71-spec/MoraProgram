package U3.U3e3.ej2;

public class Main {
    public static void main(String[] args) {
        Guerrera g1= new Guerrera();
        Enemigo e1=new Enemigo(1);
       while (g1.getVida()<0 || e1.getVida()<0){
           g1.atacar();
           e1.atacar();
           System.out.println(g1);
           System.out.println(e1);

       }
       Enemigo e2=new Enemigo(1,2,3);
    }
}
