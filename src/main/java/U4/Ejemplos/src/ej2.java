package U4.Ejemplos.src;

public class ej2 {
   public static void main(String[] args) {
       int par=2;
       int impar=1;
       int [] n1= new int[21];
       int [] n2= new int[21];
       System.out.println("Par");
       for (int i =0;i<10; i++) {
           n1[i]=par;
           par+=2;
           System.out.println("n["+i+"] ="+n1[i]);
       }
       //impar
       System.out.println("Impar");
       for (int i =0;i<10; i++) {
       n1[i]=impar;
       impar+=2;
       System.out.println("n["+i+"] ="+n1[i]);
    }
       int numero=2;
       for (int i=0; i<10; i++){
           n1[i]= numero;
           n2[i]= numero-1;
           numero+=2;
           System.out.println(n1[i]);
       }
   }
}
