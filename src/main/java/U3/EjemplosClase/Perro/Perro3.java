package U3.EjemplosClase.Perro;

public class Perro3 {
    String raza;
    int numPatas;
    String color;
    int suciedad;
    boolean felicidad;
    int contadorPaseo;
    public static int num_perros;

    /*
    public  Perro3 (){
        this("chucho",4,"azul");
    }
    public Perro3(String raza){
        this (raza,4,"azul");
    }

     */
    //---   CONSTRUCTORES ---
    public Perro3(String raza, int numPatas, String color) {
        this.setRaza("La raza es: " + raza);
        this.setNumPatas(numPatas);
        this.setColor(color);
    }

    public Perro3(String raza, int suciedadQuemepasan) {
        this.setRaza(raza);
        this.setSuciedad(suciedadQuemepasan);
        this.setNumPatas(4);
        this.setColor("azul");
        num_perros++;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {

        this.raza = raza;
    }

    public int getNumPatas() {
        return numPatas;
    }

    //--- METODOS ---
    public void setNumPatas(int numPatas) {
        if (numPatas > 5) {
            System.out.println("ese perro es muy raro");
            numPatas = 1;
        } else {
            this.numPatas = numPatas;
        }
    }

    public int getContadorPaseo() {
        return contadorPaseo;
    }

    public void setContadorPaseo(int contadorPaseo) {
        this.contadorPaseo = contadorPaseo;
    }

    public static int getNum_perros() {
        return num_perros;
    }

    public static void setNum_perros(int num_perros) {
        Perro3.num_perros = num_perros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFelicidad() {
        return felicidad;
    }

    public void setFelicidad(boolean felicidad) {
        this.felicidad = felicidad;
    }

    public void pasear() {

        this.suciedad = this.suciedad + 10;
        this.contadorPaseo++;

    }

    public void contento() {
        if (suciedad < 20 && contadorPaseo > 0) {
            felicidad = true;
        }
    }

    public void limpiar() {
        //this.suciedad=0;
        setSuciedad(0);
    }

    public void imprimirPerros() {
        System.out.println("El numero de perros es: " + num_perros);
    }

    public static String comer(int cantidadComida) {
        String sol;
        if (cantidadComida > 100) {
            sol = "el perro ha comido suficiente";
        } else {
            sol = "La comida solo vale para un perro pequeño";
        }
        return sol;
    }
        public static  void comidaDouble (double comida){
        if (comida>100){
            System.out.println("el perro ha comido suficiente");
        }       else {
            System.out.println("La comida solo vale para un perro");
        }
        }

        @Override
        public String toString () {
            return "Perro3{" +
                    "raza='" + raza + '\'' +
                    ", numPatas=" + numPatas +
                    ", color='" + color + '\'' +
                    ", suciedad=" + suciedad +
                    ", felicidad=" + felicidad + " numero de perros: " + num_perros;

        }
    }

