package U3.EjemplosClase.Ej1.EjercicioNivelAvanzado5;

// La definición del enum debe estar accesible para la clase Perfume
enum ingrediente {
    AZAHAR,
    PACHULI,
    VAINILLA
}
 enum olor{
   NORMAL,
   BUENO,
   MALO
}
public class Perfume {
    private int identificador;
    private ingrediente ingrediente1;
    private ingrediente ingrediente2;
    private ingrediente ingrediente3;
    private olor olor2;

    public Perfume(int identificador) {
        setIdentificador(identificador);
        setIngrediente1(null);
        setIngrediente2(ingrediente2);
        setIngrediente3(ingrediente3);
        setOlor2(olor.NORMAL);
    }

    public Perfume(int identificador, ingrediente ing1) {
        setIdentificador(identificador);
        setIngrediente1(ing1);
        setOlor2(olor.NORMAL);


    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        if (identificador < 0) {
            identificador = Math.abs(identificador);
        }
        this.identificador = identificador;
    }

    public ingrediente getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(ingrediente ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public ingrediente getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(ingrediente ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public ingrediente getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(ingrediente ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public olor getOlor2() {
        return olor2;
    }

    public void setOlor2(olor olor2) {
        this.olor2 = olor2;
    }

    public void prepararPerfume(String ingrediente2, String ingrediente3) {
        int contadorPachuli = 0;
        int contadorAzahar = 0;
        String olorFinal;
        setIngrediente3(ingrediente.valueOf(ingrediente3));
        String miingrediente1 = String.valueOf(ingrediente1);
        String miIngrediente2 = ingrediente2;
        String miIngrediente3 = ingrediente3;

        if (miingrediente1.equalsIgnoreCase(String.valueOf(ingrediente.PACHULI))) {
            contadorPachuli++;
        }
        if (miIngrediente2.equalsIgnoreCase(String.valueOf(ingrediente.PACHULI))) {
            contadorPachuli++;
        }
        if (miIngrediente3.equalsIgnoreCase(String.valueOf(ingrediente.PACHULI))) {
            contadorPachuli++;
        }
        if (contadorPachuli >= 2) {
            olorFinal = "MALO";
        }
        if (miingrediente1.equalsIgnoreCase(String.valueOf(ingrediente.AZAHAR))){
            contadorPachuli++;
        }
        if (miIngrediente2.equalsIgnoreCase(String.valueOf(ingrediente.AZAHAR))) {
            contadorPachuli++;
        }
        if (miIngrediente3.equalsIgnoreCase(String.valueOf(ingrediente.AZAHAR))) {
            contadorPachuli++;
        }
        if (contadorAzahar >= 2) {
            olorFinal = String.valueOf(olor.BUENO);
        }

    }

}