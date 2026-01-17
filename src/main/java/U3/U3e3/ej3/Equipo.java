package U3.U3e3.ej3;

public class Equipo {
    Mascota mascota1= new Mascota();
    Mascota mascota2=new Mascota();
    Mascota mascota3=new Mascota();
public Equipo(){

}

    public Mascota getMascota1() {
        return mascota1;
    }

    public void setMascota1(Mascota mascota1) {
        this.mascota1 = mascota1;
    }

    public Mascota getMascota2() {
        return mascota2;
    }

    public void setMascota2(Mascota mascota2) {
        this.mascota2 = mascota2;
    }

    public Mascota getMascota3() {
        return mascota3;
    }

    public void setMascota3(Mascota mascota3) {
        this.mascota3 = mascota3;
    }

    //Metodos
    public void MascotaActual(){
        if (getMascota1().getVida()>getMascota2().getVida()&&getMascota1().getVida()>getMascota3().getVida()){
            System.out.println("Tu mascota actual es la Mascota1");
        } else if (getMascota2().getVida()> getMascota1().getVida()&&getMascota2().getVida()> getMascota3().getVida()) {
            System.out.println("Tu mascota actual es la Mascota2");
        } else {
            System.out.println("Tu mascota actual es la Mascota3");
        }
    }
    public boolean todasDerrotadas(){
        boolean derrota=false;
        if (getMascota1().getVida()==0&&getMascota2().getVida()==0&&getMascota3().getVida()==0){
            derrota=true;
        }
        return derrota;
    }
    public void combate(Equipo equipo1, Equipo equipo2){
        //equipo1.mascota1.setAtaque();
    }


    @Override
    public String toString() {
        return "Equipo:" +
                "\nmascota1=" + mascota1 +
                "\nmascota2=" + mascota2 +
                "\nmascota3=" + mascota3 ;
    }
}
