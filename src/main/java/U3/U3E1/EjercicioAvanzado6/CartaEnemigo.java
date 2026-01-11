package U3.U3E1.EjercicioAvanzado6;
enum nombre{
    Sota, Reina, Rey
}
public class CartaEnemigo {
    nombre tipo;
    int vida;
    int ataque;

    CartaEnemigo(nombre tipo, int vida, int ataque){
        setTipo(tipo);
        setVida(vida);
        setAtaque(ataque);
    }


    public nombre getTipo() {
        return tipo;
    }

    public void setTipo(nombre tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void recibirDaño(){

    }
    public boolean Derrotado(){
    boolean muerto= getVida()<=0?true:false;
    return muerto;
    }
}
