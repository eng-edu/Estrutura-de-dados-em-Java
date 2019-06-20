package estrutura.de.dados;

import javafx.print.Printer;

/**
 * lista define-se como uma sequência de elementos: onde cada elemento é
 * caracterizado por uma estrutura com dois atributos: I um valor do elemento
 * corrente (e.g. inteiro, objecto, etc), e I uma referência para elemento
 * seguinte. e um conjunto de operações a realizar sobre a sequência:
 * addFirst(val) inserir val no início da lista addLast(val) inserir val no fim
 * da lista add(val, index) inserir val na posição index removeFirst() remover o
 * primeiro elemento remove(index) remover o elemento na posição index
 * removeLast() remover o último elemento get(index) retornar o elemento na
 * posição index indexOf(val) retorna a posição da 1a ocorrência de val empty()
 * verificar se a lista está vazia
 *
 */
public class ListaEncadeada {

    private int tamanho;
    private No primeiro;
    private int capacidade;

    public ListaEncadeada() {
        this.tamanho = 0;
        this.primeiro = null;
    }

    public void adiciona(Object elemento) {
        primeiro = new No(elemento, primeiro);
        tamanho++;
    }

    public void print() {

        No cursor = primeiro;

        while (cursor != null) {
            System.out.println(cursor.dado);
            cursor = cursor.proximo;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            primeiro = new No(elemento, primeiro);
        } else {
            No cursor = primeiro;
            for (int i = 0; i < posicao-1; i++) {
                cursor = cursor.proximo;
            }

            cursor.proximo = new No(elemento, cursor.proximo);
        }

        tamanho++;

    }

    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
    }

    public int tamanho() {
        return 0;
    }

    public boolean contem(Object o) {
        return false;
    }

    public void adicionaNoComeco(Object elemento) {
    }

    public void removeDoComeco() {
    }

    public void removeDoFim() {
    }

    public static void main(String[] args) {
        ListaEncadeada l = new ListaEncadeada();
        l.adiciona("eduardo");
        l.adiciona("leo");
        l.adiciona("elane");
        l.adiciona("telma");
        l.adiciona("nanada");
        l.adiciona(4, "teste");
        l.print();

    }

}

class No {

    Object dado; //valor do elemento
    No proximo; //referencia para o proximo

    public No(Object dado, No proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }

}
