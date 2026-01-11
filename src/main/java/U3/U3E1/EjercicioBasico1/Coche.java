package U3.U3E1.EjercicioBasico1;

public class Coche {
    private String marca;
    private String modelo;
    private int año;


    public Coche() {
        this("marca", "modelo", 0);
    }

    public Coche(String marca, String modelo, int año) {
        setMarca(marca);
        setModelo(modelo);
        setAño(año);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        //imperdir que año sea negativo
        if (año<0){
            //pasa un numero negativo a positivo
            año=Math.abs(año);
        }else {
            this.año = año;
        }
    }

    @Override
    public String toString() {
        return "marca:" + marca + " modelo:" + modelo + " año:" + año;
    }
}
