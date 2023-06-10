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
}
