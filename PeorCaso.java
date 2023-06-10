
public class PeorCaso {
    public static void main(String[] args) {
        
        
        DobleListaEnlazada<Integer> lista = new DobleListaEnlazada<>();
        
        // Generar peor caso: lista ordenada de forma descendente
        for (int i = 100; i >= 1; i--) {
            lista.insertarAlFinal(i);
        }
        
        lista.ordenarPorInsercion();

        // Mostrar la lista ordenada
        Node<Integer> nodoActual = lista.getCabeza();
        while (nodoActual != null) {
            System.out.println(nodoActual.getData());
            nodoActual = nodoActual.getNextNode();
        }
    }
    
        
}
