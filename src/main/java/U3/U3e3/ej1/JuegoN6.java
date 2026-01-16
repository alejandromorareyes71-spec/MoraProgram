package U3.U3e3.ej1;

public class JuegoN6 {
    private byte objetivo;
    private static int pistasGastadas;
    private static int p1;
    private static int p2;


    public JuegoN6(){
        setObjetivo((byte) (Math.random()*64));
    }

    public byte getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(byte objetivo) {
        this.objetivo = objetivo;
    }

    public static int getPistasGastadas() {
        return pistasGastadas;
    }

    public static void setPistasGastadas(int pistasGastadas) {
        JuegoN6.pistasGastadas = pistasGastadas;
    }

    public static int getP1() {
        return p1;
    }

    public static void setP1(int p1) {
        JuegoN6.p1 = p1;
    }

    public static int getP2() {
        return p2;
    }

    public static void setP2(int p2) {
        JuegoN6.p2 = p2;
    }

    public boolean pistaUno(byte num){
        boolean b1=false;
        String s1=Integer.toBinaryString(objetivo);
        String s2=Integer.toBinaryString(num);
        int contador1=0;
        int contador2=0;
        for (int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            if (c1=='1'){
                contador1++;
            }
        }
        for (int i=0;i<s2.length();i++){
            char c1=s2.charAt(i);
            if (c1=='1'){
                contador2++;
            }
        }
        if (contador1==contador2){
            b1=true;
        }

        p1++;
        pistasGastadas++;
        return b1;
    }

    public int pistaDos(byte num){
        int n1=0;
        String num1="";
        String num1Objetivo="";
        String s1=Integer.toBinaryString(objetivo);
        String s2=Integer.toBinaryString(num);

        for (int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            if (c1=='1'){



            }
        }
        for (int i=0;i<s2.length();i++){
            char c1=s2.charAt(i);
            if (c1=='1'){
            }
        }




        pistasGastadas++;
        p2++;
        return n1;
    }

    @Override
    public String toString() {
        return "JuegoN6{" +
                "objetivo=" + objetivo +
                '}';
    }
}
