package U4.Ejemplos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ejCola {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        cola.add("Cliente1");
        cola.add("Cliente2");
        cola.add("Cliente3");
        System.out.println(cola);
        Stack<String> pila =new Stack<>();
        pila.add("Cliente1");
        pila.add("Cliente2");
        pila.add("Cliente3");
        System.out.println(pila);
    }
}
