package U3.U3e3.ej3;

public class Main {

    public static void main(String[] args) {

        Equipo equipo1 = new Equipo(
                new Mascota("Dragon", 20, 5),
                new Mascota("Lobo", 15, 4),
                new Mascota("Pikachu", 10, 3)
        );

        Equipo equipo2 = new Equipo(
                new Mascota("Evee", 18, 4),
                new Mascota("Serpiente", 12, 5),
                new Mascota("Mono", 14, 3)
        );

        combate(equipo1, equipo2);
    }

    public static void combate(Equipo equipo1, Equipo equipo2) {

        while (!equipo1.todasDerrotadas() && !equipo2.todasDerrotadas()) {

            Mascota m1 = equipo1.getMascotaActual();
            Mascota m2 = equipo2.getMascotaActual();

            System.out.println("\n⚔️ Combaten:");
            System.out.println(m1);
            System.out.println(m2);

            // Ataca equipo 1
            m2.recibirDanio(m1.atacar());
            System.out.println(m1.atacar() + " daño al equipo 2");

            // Contraataque si sigue viva
            if (m2.estaViva()) {
                m1.recibirDanio(m2.atacar());
                System.out.println(m2.atacar() + " daño al equipo 1");
            }
        }

        // Resultado final
        if (equipo1.todasDerrotadas()) {
            System.out.println("\n🏆 Gana el EQUIPO 2");
            System.out.println(equipo2);
        } else {
            System.out.println("\n🏆 Gana el EQUIPO 1");
            System.out.println(equipo1);
        }
    }
}

