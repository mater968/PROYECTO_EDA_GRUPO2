
package tda;

// Clase Nodo
public class Nodo<T> {
    private T elemento;
    private Nodo<T> sgteNodo;

    public Nodo(T elemento, Nodo<T> sgteNodo) {
        this.elemento = elemento;
        this.sgteNodo = sgteNodo;
    }

    public T getElemento() {
        return elemento;
    }

    public Nodo<T> getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo<T> sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
}
