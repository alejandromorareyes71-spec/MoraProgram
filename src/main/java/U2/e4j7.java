import java.util.Scanner;

public class e4j7 {static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double media = 0, maximo = 0, minimo = 0;
    double n1=0,n2=0,n3=0;
    /*
    System.out.println("Introduce tus nota");
    String notas= teclado.nextLine();
    String guion=notas.
    if (notas.substring(0,3).equals(-)){}
    String nota1=notas.substring()
     */
    try {
        System.out.println("Introduce tu nota");
         n1 = teclado.nextDouble();
        System.out.println("Introduce tu nota");
         n2 = teclado.nextDouble();
        System.out.println("Introduce tu nota");
         n3 = teclado.nextDouble();
    }catch (Exception e) {
        System.out.println("Introduce solo numeros positivos");
    }
    if (n1 < 0 || n1 > 10) {
        n1 = 1;
    }
    //mayor
    if (n1 > n2 && n1 > n3) {
        System.out.println("n1 es el mayor");
        maximo = n1;
    } else if (n2 > n1 && n2 > n3) {
        System.out.println("n2 es el mayor");
        maximo = n2;
    } else if (n3 > n2 && n3 > n1) {
        System.out.println("n3 es el mayor");
        maximo = n3;
    } else {
        System.out.println("los tres numeros son iguales");
    }
    //minimo
    if (n1 < n2 && n1 < n3) {
        System.out.println("n1 es el pequeño");
        minimo = n1;
    } else if (n2 < n1 && n2 < n3) {
        System.out.println("n2 es el pequeño");
        minimo = n2;
    } else if (n3 < n2 && n3 < n1) {
        System.out.println("n3 es el pequeño");
        minimo = n3;

    } else {
        System.out.println("los tres numeros son iguales");
    }
    //media
    if (n1 < n2 && n1 > n3 || n1 > n2 && n1 < n3) {
        System.out.println("n1 es el mediano");
        media = n1;

    } else if (n2 < n1 && n2 > n3 || n2 > n1 && n2 < n3) {
        System.out.println("n2 es el mediano");
        media = n2;

    } else if (n3 > n1 && n3 < n2 || n3 < n1 && n3 > n2) {
        System.out.println("n3 es el mediano");
        media = n3;
    } else {
        System.out.println("los tres numeros son iguales");
    }
    System.out.println("Quieres imprimir");
    teclado.nextLine();
    String teclado2= teclado.nextLine();
    if (teclado2.equals("si")){
        for (int i=1;i<=n1;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int o=1;o<=n2;o++){
            System.out.print("*");
        }
        System.out.println("");

        for (int p=1;p<=n3;p++){
            System.out.print("*");
        }
    }else {
        System.out.println("nota1 "+n1+" nota2: "+n2+" nota3: "+n3);
    }

}

}
