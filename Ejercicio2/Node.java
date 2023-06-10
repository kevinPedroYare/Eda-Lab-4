public class Node <E>{
    private E data;
    private Node<E> nextNode;
    private Node<E> previousNode;

    
Node () {
this . data = null ;
this . nextNode = null ;
this . previousNode = null ;
}
Node ( E data ) {
this . data = data ;
this . nextNode = null ;
this . previousNode = null ;
}
Node ( E data , Node <E > nextNode ) {
this . data = data ;
this . nextNode = nextNode ;
this . previousNode = null ;
}
Node ( E data , Node <E > nextNode , Node <E > previousNode ) {
this . data = data ;
this . nextNode = nextNode ;
this . previousNode = previousNode ;
}

public E getData() {
        return data;
    }
    
    public void setValor(E valor) {
        this.data = valor;
    }
    
    public Node<E> getNextNode() {
        return nextNode;
    }
    
    public void setNextNode(Node<E> siguiente) {
        this.nextNode = siguiente;
    }
    
    public Node<E> getPreviousNode() {
        return previousNode;
    }
    
    public void setPreviousNode(Node<E> anterior) {
        this.previousNode = anterior;
    }
}