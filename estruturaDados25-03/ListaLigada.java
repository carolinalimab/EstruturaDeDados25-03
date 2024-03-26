public class ListaLigada {
    No cab;

    //função para remover os n primeiros nós da lista
    public ListaLigada removerNPrimeiros(int n) {
        ListaLigada nova = new ListaLigada();

        if (n <= 0 || cab == null) {
            return nova;
        }

        No atual = cab;
        int contador = 0;

        //remover os primeiros n nós
        while (atual != null && contador < n - 1) {
            atual = atual.prox;
            contador++;
        }

        if (atual != null) {
            nova.cab = atual.prox;
            atual.prox = null;
        }

        return nova;
    }

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.cab = new No(1);
        lista.cab.prox = new No(2);
        lista.cab.prox.prox = new No(3);
        lista.cab.prox.prox.prox = new No(4);
        lista.cab.prox.prox.prox.prox = new No(5);

        //testar a função removerNPrimeiros
        int n = 3;
        ListaLigada novaLista = lista.removerNPrimeiros(n);

        //exibir a lista
        No atual = novaLista.cab;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
    }
}
