package estrutura.de.dados;

/**
Uma fila difere de uma pilha na medida em que opera na base de um FIFO
(first-in-first-out). Assim,
1 adicionamos novos elementos ao fim da fila, e
2 removemos sempre do princípio da fila.
* Um TAD-fila é uma sequência de elementos, F = [a1, a2, . . . , an], em
que a1 é o primeiro elemento da fila e an é o último, juntamente com
as seguintes operações (asseguram que funciona como um FIFO):
1. init() inicializa a fila em vazio;
2. isEmpty() verifica se a fila está vazia;
3. isFull() verifica se a fila está cheia;
4. add(x) adiciona x na última posição da fila;
5. peek() retorna o valor do 1° elemento da fila;
2. remove() remove o 1º elemento da fila e retorna esse valor;
 */
public class Fila {
    
    private Object fila[];
    private int tamanho;
    private int primeiro;
    private int ultlimo;
    private int capacidade;

    //iniciando a fila
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Object[this.capacidade];
        this.tamanho = 0;
        this.primeiro = 0;
        this.ultlimo = 0;
    }
    
    //verifica se esta vazia
    public boolean estaVazia(){return tamanho == 0;}
    
    //varifica se esta cheia
    public boolean estaCheia(){return tamanho == capacidade;}
    
    //retorna o priemiro da fila
    public Object primeiroDaFila(){
        if(!estaVazia()){
            return this.fila[primeiro];
        }
        
        return  null;
    }
    
    
    //adiciona na fila
    public void adicionarNaFila(Object object){
        if(!estaCheia()){
            this.fila[ultlimo] = object;
            ultlimo ++;
            tamanho ++;
   
        }
    }
    
    //remove da fila
    public void removerDaFila(){
        if(!estaVazia()){
            this.fila[primeiro] = null;
            primeiro ++;
            tamanho --;
        }
    }
    
    //main
    public static void main(String[] args) {
      
        Fila f = new Fila(10);
      
        f.adicionarNaFila("eduardo");
        f.adicionarNaFila("elane");
        f.removerDaFila();
        f.removerDaFila();
        f.adicionarNaFila("leo");
        
        System.out.println(f.primeiroDaFila());
       
    }
    
    
}
