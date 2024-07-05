package modelo;

public class Expediente {
    private String idExpediente;
    private int prioridad;
    private String dni; // Nuevo campo para el DNI
    private String asunto;
    private String documentoReferencia;

    public Expediente(String idExpediente, int prioridad, String dni, String asunto, String documentoReferencia) {
        this.idExpediente = idExpediente;
        this.prioridad = prioridad;
        this.dni = dni;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getDni() {
        return dni;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }
}
