package EDD_Java_Filas;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        //out do método adiciona
        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        //out do método remove
        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);

        //método do java
        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Mauricio");
        String x2 = filaDoJava.poll();
    }
}
