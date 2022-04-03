package EDD_Java_Listas;

public class TesteListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);

        //teste do método adiciona
        lista.adiciona("marcelo");
        System.out.println(lista);

        //out do método pegaCelula
        lista.adiciona(2, "gabriel");
        System.out.println(lista);

        //out do método pega
        Object x = lista.pega(2);
        System.out.println(x);

        //out do método tamanho
        System.out.println(lista.tamanho());

        //out do método removeDoComeco
        lista.removeDoComeco();
        System.out.println(lista);

        //out do método removeDoFim
        lista.removeDoFim();
        System.out.println(lista);

        //out do método remove
        lista.remove(2);
        System.out.println(lista);

        //out do método contem
        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("danilo"));
    }
}
