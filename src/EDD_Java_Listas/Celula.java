package EDD_Java_Listas;

public class Celula {
    private final Object elemento;

    private Celula proximo;
    private Celula anterior;

    public Celula (Object elemento){
        this((Object) null, (Celula) elemento);
    }

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public void setProxima(Celula nova) {
    }

    public Celula getProxima() {
        return null;
    }
}
