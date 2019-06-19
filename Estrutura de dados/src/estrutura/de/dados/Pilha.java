package estrutura.de.dados;

public class Pilha {

    //A pilha é uma das estruturas de dados e trabalha com o formato LIFO (o último a entrar é o primeiro a sair, “Last In, First Out”, em inglês).
    
    private int capacidade; //capacidade maxima da pilha
    private Object pilha[]; //pilha em formato de vetor de objetos
    private int top;//grava o quantidade elementos que existe na pilha
 

    //contrutor para inicializar a pilha
    public Pilha(int size) {
        this.capacidade = size; 
        this.pilha = new Object[size];
        this.top = 0;
       
    }

   
    //verifica se esta vazia
    public boolean isEmpty(){return top == 0;}
    
    //verifica se estar cheia
    public boolean isFull(){return capacidade == top;}
    
    
    //insere no topo da pilha
    public void push(Object object){
        if(isFull()){
            System.out.println("Pilha cheia");
        }else{
            this.pilha[top] = object;
            top++;
            
        }
    }
    
    //observa o top da 
    public Object top(){
        if(isEmpty()){
            System.out.println("Pilha vazia");
        }else{
           return this.pilha[top-1];
        }
        return null;
    }
    
    
     //remove do topo da pilha
    public void pop(){
        
        if(isEmpty()){
           System.out.println("Pilha vazia");  
        }else{
            top--;
            this.pilha[top] = null;
        }
    }
    
    
    //faz im print da pilh;
    public void print(){
        for(int i= capacidade-1; i >= 0; i--){
            System.out.println(this.pilha[i]);
        }
    }

    //main
    public static void main(String[] args) {
        
        Pilha p = new Pilha(11);
        p.push("eduardo lima");
        p.push("elane lima");
        p.pop();
        p.print(); //resultado só o eduardo lima está na pilha
    }
    
};
    
