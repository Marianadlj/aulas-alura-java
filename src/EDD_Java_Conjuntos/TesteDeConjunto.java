package EDD_Java_Conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDeConjunto {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

        conjunto.remove("Mauricio");
        System.out.println(conjunto);

        Set<String> conjuntoDoJava = new HashSet<String>();

        conjuntoDoJava.add("Mauricio");

        String x = "Guilherme";
        x.hashCode();

    }
}
