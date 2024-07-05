package tda;

// Clase Pila
public class Pila<T> {
    private Nodo<T> cima;
    private int n; 

    public Pila() {
        cima = null;
        n = 0;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(T item) {
        Nodo<T> nuevoNodo = new Nodo<>(item, null);
        nuevoNodo.setSgteNodo(cima);
        cima = nuevoNodo;
        n++;
    }

    public T desapilar() {
        if (!estaVacia()) {
            T aux = cima.getElemento();
            cima = cima.getSgteNodo();
            n--;
            return aux;
        } else {
            throw new UnsupportedOperationException("La pila está vacía");
        }
    }

    public T tope() {
        return cima.getElemento();
    }

    public int longitud() {
        return n;
    }
}
