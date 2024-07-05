package tda;

// Clase Cola
public class Cola<T> {
    private Nodo<T> cabeza;
    private Nodo<T> ultimo;

    public Cola() {
        cabeza = null;
        ultimo = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void encolar(T item) {
        Nodo<T> nuevoNodo = new Nodo<>(item, null);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSgteNodo(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public T desencolar() {
        if (!estaVacia()) {
            T item = cabeza.getElemento();
            cabeza = cabeza.getSgteNodo();
            return item;
        } else {
            throw new UnsupportedOperationException("La cola está vacía");
        }
    }

    public int longitud() {
        int i = 0;
        Nodo<T> aux = cabeza;
        while (aux != null) {
            i++;
            aux = aux.getSgteNodo();
        }
        return i;
    }
}