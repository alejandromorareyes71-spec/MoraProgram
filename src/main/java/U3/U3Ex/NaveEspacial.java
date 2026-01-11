package U3.U3Ex;

public class NaveEspacial {
    String nombre;
    double combustible;
    boolean enMision;

    public NaveEspacial(String nombre,double combustible, boolean enMision){
        this.setNombre(nombre);
        this.setCombustible(combustible);
        this.setEnMision(enMision);
    }

    public NaveEspacial(String nombre, double combustible){
        this.setNombre(nombre);
        this.setCombustible(combustible);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible>999.99){
            System.out.println("El limite del combustible es "+combustible);
            this.combustible=999.99;
        }
        this.combustible = combustible;
    }

    public boolean isEnMision() {
        return enMision;
    }

    public void setEnMision(boolean enMision) {
        this.enMision = enMision;
    }
    public void despegar(){
        if (getCombustible()>100) {
            setEnMision(true);
        }

    }
    public void aterrizar(){
        this.enMision=false;
    }
    public void consumirCombustible(){
        if (getCombustible()>0||getCombustible()<=999.99){
            setCombustible(combustible-1);
        } else if (getCombustible()>=0) {
            System.out.println("No te queda combustible");
        }
    }

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nombre='" + nombre + '\'' +
                ", combustible=" + combustible +
                ", enMision=" + enMision +
                '}';
    }
}
