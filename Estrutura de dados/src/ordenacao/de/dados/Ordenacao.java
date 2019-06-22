package ordenacao.de.dados;

public class Ordenacao {

    public static void main(String[] args) {

        int vetor[] = {9, 0, 4, 2, 3, 8, 7, 1, 6, 5};
        System.out.println("Vetor não ordenado:");
        mostraVetor(vetor);

        System.out.println("Bubble Sort:");
        mostraVetor(bubbleSort(vetor));

        System.out.println("Selection Sort:");
        mostraVetor(selectionSort(vetor));

        System.out.println("Insertion Sort:");
        mostraVetor(insertionSort(vetor));

        System.out.println("Merge Sort:");
        mostraVetor(mergeSort(vetor, 0, vetor.length - 1));

        System.out.println("Quick Sort:");
        mostraVetor(quickSort(vetor, 0, vetor.length - 1));
    }

    //borbulhar os elementos empurrando os maiores para o fim do vetor
    public static int[] bubbleSort(int vetor[]) {
        int trocas = 0;
        for (int i = 0; i < vetor.length - 1; i++) { //perccore o vetor
            if (vetor[i] > vetor[i + 1]) { //se v[i] maior que v[i] + 1
                int temp = vetor[i]; // 
                vetor[i] = vetor[i + 1]; // faz a troca do v[i] com v[i+1]
                vetor[i + 1] = temp;
                trocas++;
            }
        }

        //faz chamada recursiva até que não exista mais trocas
        if (trocas != 0) {
            bubbleSort(vetor);
        }
        return vetor;
    }

    //seleciona o menor elemento e add na primeira posição...
    //seleciona o segundo menor elemento e add na segunda posição..
    //faça isso até 
    public static int[] selectionSort(int v[]) {

        //percorre o vetor
        for (int i = 0; i < v.length; i++) {

            //posicao do menor elemento
            int menor = i;

            //percorre o vetor a partir da posicao i + 1
            for (int j = i + 1; j < v.length; j++) {

                //verifica se v[j] é menor que v[menor]
                if (v[j] < v[menor]) {
                    menor = j; //se sim, novo valor de menor e atribuido
                }

            }

            //apos definodo qual o valor menor faço a troca das posiçoes
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;

        }

        return v;
    }

    //metodo de cartas do baralho
    public static int[] insertionSort(int v[]) {

        int i, j, aux;

        //assumimor que  vetor na posição 0 já está ordenado, pos o seu antecessor nao existe.
        for (i = 1; i < v.length; i++) { //percorre o vetor
            aux = v[i]; // tama um elemento em v[i]
            j = i - 1; //armazena a posição do elemento anterior a v[i]
            while ((j >= 0) && (aux < v[j])) { // j>= 0 -> verifica se já está no inicio do vetor. aux > v[j] -> verifica se o elemento v[i] e menor que o elemento anterior v[j]

                //caso as condiçõe sejam aceitas
                v[j + 1] = v[j]; //colocamos v[j] na posição v[j+1]
                j--; //decremeta o j para andar de forma reversa no vetor
            }

            //termnidar de empurrar todos os elemntos
            //inserir 
            v[j + 1] = aux;

        }
        return v;
    }

    public static void merge(int vetor[], int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;
        int Inicial[] = new int[n1];
        int Final[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            Inicial[i] = vetor[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            Final[j] = vetor[meio + 1 + j];
        }
        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (Inicial[i] <= Final[j]) {
                vetor[k] = Inicial[i];
                i++;
            } else {
                vetor[k] = Final[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            vetor[k] = Inicial[i];
            i++;
            k++;
        }
        while (j < n2) {
            vetor[k] = Final[j];
            j++;
            k++;
        }
    }

    public static int[] mergeSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }

        return vetor;
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int[] quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

        return arr;
    }

    public static void mostraVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("");
    }
}
