package EDD_Java_Vetores;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);

        //out do método tamanho
        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        //out do método contem
        System.out.println(lista.contem(a1));
        //out false do método contem
        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));

        //out do método pega
        Aluno x = lista.pega(1);
        System.out.println(x);

        lista.adiciona(1, a3);
        System.out.println(lista);

        //out do método remove
        lista.remove(1);
        System.out.println(lista);

        //testando o método gatante espaço
        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);
    }
}
