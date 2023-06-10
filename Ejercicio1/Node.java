package Ejercicio1;

public class Node<T> {
    //node
    private T data;
    private Node<T> next;

    //constructor 
    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    //getters y setters
    public T getData() {
        return data;
    }

    public T setData(T data) {
        return this.data = data;
    }

    public Node<T> getNextNode() {
        return next;
    }

    public Node<T> setNextNode(Node<T> next) {
        return this.next = next;
    }
}
