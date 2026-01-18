package U3.U3e3.ej2;

public class Main {

    public static void main(String[] args) {

        Guerrera g = new Guerrera();
        int enemigosDerrotados = 0;

        while (g.getVida() > 0) {

            int nivelEnemigo;

            if (enemigosDerrotados < 3) {
                nivelEnemigo = 1;
            } else {
                nivelEnemigo = 2;
            }

            Enemigo e = new Enemigo(nivelEnemigo);
            System.out.println("\n⚔️ Aparece un enemigo: " + e);

            // Combate
            while (g.getVida() > 0 && e.getVida() > 0) {

                // Ataca la guerrera
                int ataqueG = g.atacar();
                e.setVida(e.getVida() - ataqueG);
                System.out.println("Guerrera ataca con " + ataqueG +
                        " | Vida enemigo: " + e.getVida());

                // Ataca el enemigo si sigue vivo
                if (e.getVida() > 0) {
                    int ataqueE = e.atacar();
                    g.setVida(g.getVida() - ataqueE);
                    System.out.println("Enemigo ataca con " + ataqueE +
                            " | Vida guerrera: " + g.getVida());
                }
            }

            // Si la guerrera gana
            if (g.getVida() > 0) {
                enemigosDerrotados++;

                if (e.getNivel() == 1) {
                    g.incExperiencia(2);
                } else {
                    g.incExperiencia(3);
                }

                System.out.println("✅ Enemigo derrotado");
                System.out.println(g);
            }
        }

        // Final del juego
        System.out.println("\n💀 La guerrera ha muerto");
        System.out.println("Nivel final: " + g.getNivel());
        System.out.println("Experiencia final: " + g.getExperiencia());
        System.out.println("Enemigos derrotados: " + enemigosDerrotados);
    }
}
