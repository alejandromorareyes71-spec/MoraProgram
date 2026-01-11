import java.util.Arrays;

public class ej1 {
   public static void main(String[] args) {
        int [] n1 = new int [10];

        n1[0]=0;
     //  System.out.printf(Arrays.toString(n));


       for (int i =0;i<10; i++){
           int n2=101;
           n1[i]=n2+i;

           System.out.println("n["+i+"] ="+n1[i]);
       }
    }
}
