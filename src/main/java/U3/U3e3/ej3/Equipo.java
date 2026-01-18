package U3.U3e3.ej3;

public class Equipo {

    // Mascotas
    private Mascota mascota1;
    private Mascota mascota2;
    private Mascota mascota3;

    // Constructor
    public Equipo(Mascota m1, Mascota m2, Mascota m3) {
        mascota1 = m1;
        mascota2 = m2;
        mascota3 = m3;
    }

    // Devuelve la primera mascota que siga con vida depdendiendo del orden
    public Mascota getMascotaActual() {
        if (mascota1.estaViva()) {
            return mascota1;
        } else if (mascota2.estaViva()) {
            return mascota2;
        } else if (mascota3.estaViva()) {
            return mascota3;
        }
        return null;
    }

    // Comprueba si todas están muertas
    public boolean todasDerrotadas() {
        return !mascota1.estaViva() &&
                !mascota2.estaViva() &&
                !mascota3.estaViva();
    }

    @Override
    public String toString() {
        return "Equipo:\n" +
                mascota1 + "\n" +
                mascota2 + "\n" +
                mascota3;
    }
}

