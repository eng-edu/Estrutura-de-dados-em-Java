package estrutura.de.dados;

/**
Um TAD-pilha é uma sequência de elementos, S = [a1, a2, . . . , an], em que
an é o elemento mais recente da sequência (ou elemento do topo da
pilha), juntamente com as operações:
1. x = pop(S) remove e retorna o elemento no topo de S
2. push(x, S) insere x no topo de S
3. top(S) retorna an, o elemento no topo de S (mas não altera S)
4. isEmpty(S) retorna true se S estiver vazio, false caso contrário.
5. isFull(S) retorna true se S estiver cheio, false caso contrário.
**/
public class Pilha {

    //A pilha é uma das estruturas de dados e trabalha com o formato LIFO (o último a entrar é o primeiro a sair, “Last In, First Out”, em inglês).
    
    private int capacidade; //capacidade maxima da pilha
    private Object pilha[]; //pilha em formato de vetor de objetos
    private int topo;//grava o quantidade elementos que existe na pilha
 

    //contrutor para inicializar a pilha
    public Pilha(int size) {
        this.capacidade = size; 
        this.pilha = new Object[size];
        this.topo = 0;
       
    }

   
    //verifica se esta vazia
    public boolean estaVazia(){return topo == 0;}
    
    //verifica se estar cheia
    public boolean estaCheia(){return capacidade == topo;}
    
    
    //insere no topo da pilha
    public void insereNoTopo(Object object){
        if(estaCheia()){
            System.out.println("Pilha cheia");
        }else{
            this.pilha[topo] = object;
            topo++;
            
        }
    }
    
    //observa o top da 
    public Object verTopo(){
        if(estaVazia()){
            System.out.println("Pilha vazia");
        }else{
           return this.pilha[topo-1];
        }
        return null;
    }
    
    
     //remove do topo da pilha
    public void removeDoTopo(){
        
        if(estaVazia()){
           System.out.println("Pilha vazia");  
        }else{
            topo--;
            this.pilha[topo] = null;
        }
    }
    


    //main
    public static void main(String[] args) {
        
        Pilha p = new Pilha(11);
        p.insereNoTopo("eduardo lima");
        p.insereNoTopo("elane lima");
        p.removeDoTopo();
        System.out.println(p.verTopo());
    }
    
};
    
