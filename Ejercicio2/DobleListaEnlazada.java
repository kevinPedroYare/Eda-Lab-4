public class DobleListaEnlazada<E extends Comparable <E>> {
    private Node<E> cabeza;
    private Node<E> cola;
    
    public DobleListaEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }
    
    public void insertarAlInicio(E valor) {
        Node<E> nuevoNodo = new Node<>(valor);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setNextNode(cabeza);
            cabeza.setPreviousNode(nuevoNodo);
            cabeza = nuevoNodo;
        }
    }
    
    public void insertarAlFinal(E valor) {
        Node<E> nuevoNodo = new Node<>(valor);
        
        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setPreviousNode(cola);
            cola.setNextNode(nuevoNodo);
            cola = nuevoNodo;
        }
    }
    
    public Node<E> getCabeza(){
        return cabeza;

    }
    public void SetCabeza(Node<E> cabeza){
        this.cabeza= cabeza;

    }
     public Node<E> getCola(){
        return cola;

    }
    public void setCola(Node<E> cola){
        this.cola= cola;

    }
    public void ordenarPorInsercion() {
        if (cabeza == null || cabeza.getNextNode() == null) {
            // La lista está vacía o tiene solo un elemento, no es necesario ordenar
            return;
        }
        
        Node<E> nodoActual = cabeza.getNextNode();
        
        while (nodoActual != null) {
            E valorActual = nodoActual.getData();
            Node<E> nodoAnterior = nodoActual.getPreviousNode();
            
            while (nodoAnterior != null && valorActual.compareTo(nodoAnterior.getData()) < 0) {
                // Intercambiar los valores entre el nodo actual y el nodo anterior
                nodoActual.setValor(nodoAnterior.getData());
                nodoAnterior.setValor(valorActual);
                
                nodoActual = nodoAnterior;
                nodoAnterior = nodoAnterior.getPreviousNode();
            }
            
            nodoActual = nodoActual.getNextNode();
        }

    }
    }
