package modelo;

public class EventoTransito {
    private String idExpediente;
    private String origen;
    private String destino;

    public EventoTransito(String idExpediente, String origen, String destino) {
        this.idExpediente = idExpediente;
        this.origen = origen;
        this.destino = destino;
    }

    // Getters y Setters
    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
