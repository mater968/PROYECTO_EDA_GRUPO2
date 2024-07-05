
package modelo;
/**
 *
 * @author HP
 */
public class Empleado {
    private String id;
    private String nombre;
    private Dependencia dependencia;

    public Empleado(String id, String nombre, Dependencia dependencia) {
        this.id = id;
        this.nombre = nombre;
        this.dependencia = dependencia;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }
}
