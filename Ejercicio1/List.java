package Ejercicio1;

public class List<T> {
    //list

    private Node<T> raiz;
    private int tamaño;

    //constructor

    public List() {
        this.raiz = null;
        this.tamaño = 0;
    }

    //getters y setters

    public Node<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Node<T> raiz) {
        this.raiz = raiz;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int setTamaño(int tamaño) {
        return this.tamaño = tamaño;
    }

    //metodos

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(T data) {
        Node<T> nuevo = new Node<T>(data);
        if (isEmpty()) {
            raiz = nuevo;
        } else {
            Node<T> aux = raiz;
            while (aux.getNextNode() != null) {
                aux = aux.getNextNode();
            }
            aux.setNextNode(nuevo);
        }
        tamaño++;
    }

    public Node<T> get(int indice){
        Node<T> aux = raiz;
        for(int i = 0; i < indice; i++){
            aux = aux.getNextNode();
        }
        return aux;
    }

    public void remove(int indice){
        if(indice < tamaño){
            if(indice == 0){
                raiz = raiz.getNextNode();
            }else{
                Node<T> anterior = this.get(indice - 1);
                anterior.setNextNode(this.get(indice + 1));
            }
            tamaño--;
        }
    }

    //peores casos añade automaticamente los peores casos a la lista
    public void peoresCasos(int n){
        for(int i = n; i >= n ; i--){
            this.add((T) Integer.valueOf(i));
        }
    }

    //Insertion Sort de metodos genericos
    public long insertionSort(){
        Node<T> aux = raiz;
        Node<T> aux2 = raiz.getNextNode();
        long nano_startTime = System.nanoTime();
        while(aux2 != null){
            if(aux.getData().toString().compareTo(aux2.getData().toString()) > 0){
                T temp = aux.getData();
                aux.setData(aux2.getData());
                aux2.setData(temp);
                aux = raiz;
                aux2 = raiz.getNextNode();
            }else{
                aux = aux.getNextNode();
                aux2 = aux2.getNextNode();
            }
        }
        long nano_endTime = System.nanoTime();
        return nano_endTime - nano_startTime;
    }
}
