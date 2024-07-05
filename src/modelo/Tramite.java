
package modelo;

import java.util.Date;

public class Tramite {
    private String idExpediente;
    private String dni; // Nuevo campo para el DNI
    private Date fechaInicio;
    private Date fechaFin;
    private String documentoProducto;

    public Tramite(String idExpediente, String dni, Date fechaInicio, Date fechaFin, String documentoProducto) {
        this.idExpediente = idExpediente;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.documentoProducto = documentoProducto;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public String getDni() {
        return dni;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDocumentoProducto() {
        return documentoProducto;
    }

    public void setDocumentoProducto(String documentoProducto) {
        this.documentoProducto = documentoProducto;
    }
}
