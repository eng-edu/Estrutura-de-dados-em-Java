package estrutura.de.dados;

public class Pilha {

    private int size;
    private Object pilha[];
    private int top;
 


    public Pilha(int size) {
        this.size = size; 
        this.pilha = new Object[size];
        this.top = 0;
       
    }

    public int size(){return this.top;}   
    public boolean isEmpty(){return top == 0;}
    public boolean isFull(){return size == top;}
    
    public void push(Object object){
        if(isFull()){
            System.out.println("Pilha cheia");
        }else{
            this.pilha[top] = object;
            top++;
            
        }
    }
    
    public Object top(){
        if(isEmpty()){
            System.out.println("Pilha vazia");
        }else{
           return this.pilha[top-1];
        }
        return null;
    }
    
    public void pop(){
        
        if(isEmpty()){
           System.out.println("Pilha vazia");  
        }else{
            top--;
            this.pilha[top] = null;
        }
    }
    
    
    public void print(){
        for(int i= size-1; i >= 0; i--){
            System.out.println(this.pilha[i]);
        }
    }

    
    
    
    public static void main(String[] args) {
        
        Pilha p = new Pilha(11);
        p.push("eduardo lima");
        p.push("elane lima");
        p.pop();
        p.print();
    }
    
};
    
