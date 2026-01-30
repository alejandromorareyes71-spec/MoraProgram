package U4.E3;

public class Main {
    public static void main(String[] args) {
        Carta[] baraja = new Carta[12];

        // Creamos 2 cartas de cada tipo [1, 2]
        baraja [0] = new Carta("esbirro", new String[]{"Soldado esqueleto; Daño 2", "Espectro oscuro; Daño 4", "Acólito del vacío; Daño 6"});
        baraja[3] = new Carta("esbirro", new String[]{"Orco; Daño 3", "Lobo; Daño 2", "Zombi; Daño 5"});
        baraja[4] = new Carta("descanso", new String[]{"Hoguera", "Cama", "Comida"});
        baraja[5] = new Carta("descanso", new String[]{"Fuente curativa", "Refugio", "Meditación"});
        baraja[6] = new Carta("tesoro", new String[]{"Cofre pequeño", "Oro", "Poción"});
        baraja[7] = new Carta("tesoro", new String[]{"Cofre grande", "Arma", "Armadura"});
        baraja[2] = new Carta("comerciante", new String[]{"Mercader ambulante", "Tienda", "Trueque"});
        baraja[8] = new Carta("comerciante", new String[]{"Buhonero", "Subasta", "Suministros"});
        baraja[1] = new Carta("evento", new String[]{"Encuentro", "Emboscada", "Hallazgo"});
        baraja[11] = new Carta("evento", new String[]{"Misterio", "Portal", "Estatua"});
        baraja[9] = new Carta("trampa", new String[]{"Foso", "Flechas", "Gas"});
        baraja[10] = new Carta("trampa", new String[]{"Pinchos", "Red", "Hielo"});

        Zona miZona = new Zona(1, true);

        int cartasColocadas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // La última posición (2,2) debe ser el "AMO" [1]
                if (i == 2 && j == 2) {
                    miZona.setMcarta(i, j, new Carta("AMO", new String[]{"Rey de las Sombras", "Poder 10", "Final"}));
                } else {
                    // Seleccionamos una carta aleatoria de las 12 creadas [1]
                    int indiceAleatorio = (int) (Math.random() * 12);
                    miZona.setMcarta(i, j, baraja[indiceAleatorio]);
                }
            }
        }

        System.out.println("NIVEL DE LA ZONA: " + miZona.getNivel());
        System.out.println("¿TIENE JEFE FINAL?: " + (miZona.isJefe() ? "Sí" : "No"));
        System.out.println("--- CARTAS EN LA MAZMORRA ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Carta c = miZona.getMcarta()[i][j];
                System.out.println("Posición [" + i + "][" + j + "] - Tipo: " + c.getTipo());
                System.out.println("   Info: " + String.join(", ", c.getInformacion()));
            }
        }
    }
}