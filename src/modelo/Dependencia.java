package modelo;
/**
 *
 * @author HP
 */
public class Dependencia {
    private String id;
    private String nombre;

    public Dependencia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}