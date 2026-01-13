package U4.Ejemplos.src;
// Falta el try catch
import java.util.Scanner;

public class ejPag5 {
    public static void main(String[] args) {
        Scanner teclador=new Scanner(System.in);
        System.out.println("¿Tamaño de la fila?");
        int fila= teclador.nextInt();
        System.out.println("¿Tamaño de la columna?");
        int columna= teclador.nextInt();
        int valor;
        int [][] numeros= new int [fila][columna];
        for (int i=0;i<fila;i++){
            for (int j=0; j<columna;j++) {
                System.out.println("Dime un numero para la posicion" + i + j);
                valor = teclador.nextInt();
                numeros[i][j] = valor;

            }
        }


        for (int i=0;i<fila;i++){
            for (int j=0; j<fila;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
        //buscar el mayor
        int mayor=0;
        int iMayor=0;
        int jMayor=0;
        for (int i=0; i<fila;i++){
            for (int j=0;j<columna;j++){
                if (numeros[i][j]>mayor){
                    mayor=numeros[i][j];
                    iMayor=i;
                    jMayor=j;
                }
            }
        }
        //Desplazar columnas
        int primero=numeros[0][0];
        numeros[0][0]= numeros[fila-1][columna-1];
        numeros[fila-1][columna-1]=primero;

        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                if (i==0&& j==0){
                    numeros[i][j]=numeros[fila-1][columna-1];
                }
                numeros[i][j]=numeros[i][j-1];
            }
        }


    }
}

