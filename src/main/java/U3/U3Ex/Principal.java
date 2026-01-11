package U3.U3Ex;

public class Principal {
    static void main() {
        NaveEspacial nav0=new NaveEspacial("nav0",30,false);
        NaveEspacial nav1=new NaveEspacial("nav1",20);




        //Nave 1;
        nav1.aterrizar();
        System.out.println("Nave aterrizando");
        System.out.println(nav1);

        nav1.despegar();
        System.out.println("Nave1 despegando");
        System.out.println(nav1);

        nav1.consumirCombustible();
        System.out.println("Nave1 consumiendo combustible");
        System.out.println(nav1);



    }
}
