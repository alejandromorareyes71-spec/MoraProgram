package U4.E3;

import java.util.Arrays;

public class Carta {
    String  tipo= new String;
    String [] informacion;

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
        this.tipo = tipo;
    }

    public String[] getInformacion() {
        return informacion;
    }

    public void setInformacion(String[] informacion) {
        this.informacion = informacion;
    }
}
}



