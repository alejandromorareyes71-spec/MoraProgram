package U4.E3;

public class Zona {
    private int nivel;
    private boolean jefe;
    private int [][] Mcartas=new int [3][3];
    private Carta[][] Mcarta=new Carta[3][3];

    public Zona(){
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                this.Mcartas[i][j] = (int) (Math.random() * 5);
            }
        }



    }
}
