package U3.EjemplosClase.U3E1.EjercicioAvanzado6;

import java.awt.*;

enum Palo{
    Corazones, Diamante, Trebol, Picas
}

public class CartaPueblo {
    private  int numero;
    private Palo tipo;



     CartaPueblo (int numero, String palo){
        setNumero(numero);
        setTipo(Palo.valueOf(palo));
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
         if (numero>=2&&numero<=10) {
             this.numero = numero;
         }else {
             System.out.println("El numero no vale se procede a poner un numero aleatorio");
         }   this.numero=(int)(Math.random()*9)+2;
            /*  Evitar que el numero sea negativo
                if (numero<0){
                Math.abs(this.numero=numero);
                }
            */
    }

    public Palo getTipo() {
        return Palo.valueOf("El palo es" + tipo);
    }

    public void setTipo(Palo tipo) {
        this.tipo = tipo;
    }

    public int calcularDaño() {
        if (getTipo().equals(Palo.Trebol)) {
            int doble = getNumero() * 2;
            return doble;
        }
        return  getNumero();
    }

    public String obtenerEfecto(){
         String efecto;
         if (getTipo().equals(Palo.Corazones)){
             efecto="curacion";
         } else if (getTipo().equals(Palo.Diamante)) {
             efecto = "robar";
         } else if (getTipo().equals(Palo.Trebol)) {
             efecto = "daño doble";
         } else if (getTipo().equals(Palo.Picas)) {
             efecto = "escudo";
         }else {
             efecto="no tiene ningun efecto";
         }
         return efecto;
    }

}
                    /*
                    * if (!tipo.equals(Palo.Trebol)||
                          !tipo.equals(Palo.Corazones)||
                          !tipo.equals(Palo.Diamante)||
                          !tipo.equals(Palo.Picas)){

                        }else {
                            System.out.println("El tipo de palo es desconocido");
                        } */