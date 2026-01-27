package U4.E3;

import java.util.Arrays;

public class Carta {
    String  tipo;
    String [] informacion= new String[12];

    public Carta(String tipo, String []informacion){
        setTipo(tipo);
        setInformacion(informacion);
    }
    public Carta (String tipo){
        this(tipo, new String[]{""});
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("ESBIRRO")||tipo.equalsIgnoreCase("TRAMPA")||tipo.equalsIgnoreCase("COMERCIANTE")){
            this.tipo = tipo;
        }else {
            System.out.println("tipo no valido, se establece valor por defecto");
            this.tipo="ESBIRRO";
        }
    }

    public String[] getInformacion() {
        return informacion;
    }

    public void setInformacion(String[] informacion) {
        this.informacion = informacion;
    }

    //HACER METODO TOSTRING


}




