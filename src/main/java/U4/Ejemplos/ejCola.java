package U4.Ejemplos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ejCola {
    public static void main(String[] args) {
        // Crear la cola de clientes (FIFO)
        Queue<String> colaClientes = new LinkedList<>();
        colaClientes.add("Ana");
        colaClientes.add("Carlos");
        colaClientes.add("Elena");
        colaClientes.add("Javier");
        colaClientes.add("Lucía");

        // Crear la pila de documentos (LIFO)
        Stack<String> pilaDocumentos = new Stack<>();
        Stack<Integer> pila2=new Stack<Integer>();
        // Atender clientes y procesar documentos
        System.out.println("Atendiendo clientes:");
        int contador = 0;
        while (!colaClientes.isEmpty()) {
            String cliente = colaClientes.poll(); // Eliminar el primer cliente en la cola
            System.out.println("Atendiendo a: " + cliente);
            // Simular procesamiento de un documento para el cliente
            String documento = "Documento de " + cliente;
            pilaDocumentos.push(documento);
            System.out.println("Procesado: " + documento);
            contador++;
        }
        System.out.println("Se han atendido a "+contador+" clientes");
        // Mostrar el último documento procesado (LIFO)
        System.out.println("\nÚltimo documento procesado: " + pilaDocumentos.peek());
        // Deshacer el último procesamiento
        System.out.println("\nDeshaciendo el último procesamiento...");
        pilaDocumentos.pop();


        System.out.println("Trabajo por hacer "+pilaDocumentos.size());


        // Mostrar el estado final de la pila de documentos
        System.out.println("\nDocumentos restantes en la pila:");
        for (String doc : pilaDocumentos) {
            System.out.println(doc);
        }
    }

}
