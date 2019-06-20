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

    //inicia a lista
    public ListaEncadeada() {
        this.tamanho = 0;
        this.primeiro = null;
    }

    //adciona na lista
    public void add(Object elemento) {
        primeiro = new No(elemento, primeiro);
        tamanho++;
    }

    //percorre a lista 
    public void print() {
        No cursor = primeiro;
        while (cursor != null) {
            System.out.println(cursor.dado);
            cursor = cursor.next;
        }
    }

    //adiciona em uma posição especifica
    public void add(int posicao, Object elemento) {
        if (posicao == 0) {
            primeiro = new No(elemento, primeiro);
        } else {
            No cursor = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                cursor = cursor.next;
            }
            cursor.next = new No(elemento, cursor.next);
        }
        tamanho++;
    }

    //retrona o indice de um determinado elemento
    public Object indexOf(Object dado) {

        int index = 0;
        No cursor = primeiro;
        for (int i = 0; i < tamanho; i++) {

            if (cursor.dado == dado) {
                return index;
            }
            cursor = cursor.next;
            index++;
        }

        return -1;
    }

    public void remove(int posicao) {
        if (posicao == 0) {
            primeiro = primeiro.next;
        } else {
            No cursor = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                cursor = cursor.next;
            }

            cursor.next = cursor.next.next;
        }

        tamanho--;
    }

    public Object get(int posicao) {
        No cursor = primeiro;
        for (int i = 0; i < posicao; i++) {
            cursor = cursor.next;
        }

        return cursor.dado;
    }

    public static void main(String[] args) {
        ListaEncadeada l = new ListaEncadeada();
        l.add("eduardo");
        l.add("leo");
        l.remove(0);
        l.add("elane");
        l.add(0, "teste");
        System.out.println("indexOf: " + l.indexOf("elane"));
        System.out.println("get: " + l.get(0));
        l.print();

    }

}

class No {

    Object dado; //valor do elemento
    No next; //referencia para o proximo

    public No(Object dado, No next) {
        this.dado = dado;
        this.next = next;
    }

}
