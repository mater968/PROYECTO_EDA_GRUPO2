
package tda;

public class Lista<T> {
    private Nodo<T> cabeza;
    private int longitud;

    // Constructor
    public Lista() {
        this.cabeza = null;
        this.longitud = 0;
    }

    // Método para agregar un elemento a la lista
    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento, null);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.getSgteNodo() != null) {
                actual = actual.getSgteNodo();
            }
            actual.setSgteNodo(nuevoNodo);
        }
        longitud++;
    }

    // Método para obtener un elemento de la lista
    public T obtener(int indice) {
        if (indice >= 0 && indice < longitud) {
            Nodo<T> actual = cabeza;
            for (int i = 0; i < indice; i++) {
                actual = actual.getSgteNodo();
            }
            return actual.getElemento();
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    // Método para eliminar un elemento de la lista
    public void eliminar(int indice) {
        if (indice >= 0 && indice < longitud) {
            if (indice == 0) {
                cabeza = cabeza.getSgteNodo();
            } else {
                Nodo<T> actual = cabeza;
                for (int i = 0; i < indice - 1; i++) {
                    actual = actual.getSgteNodo();
                }
                actual.setSgteNodo(actual.getSgteNodo().getSgteNodo());
            }
            longitud--;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    // Método para obtener la longitud de la lista
    public int longitud() {
        return longitud;
    }
}
