package servicio;

import tda.*;
import modelo.*;

import java.util.Date;

public class GestionTramite {
    private Lista<Tramite> listaTramites;
    private Lista<EventoTransito> listaEventos;
    private Cola<Expediente> colaExpedientes;

    public GestionTramite() {
        this.listaTramites = new Lista<>();
        this.listaEventos = new Lista<>();
        this.colaExpedientes = new Cola<>();
    }

    public void registrarExpediente(Expediente expediente) {
        colaExpedientes.encolar(expediente);
        System.out.println("Expediente registrado en la cola de espera: " + expediente.getIdExpediente());
    }

    public void procesarSiguienteExpediente() {
        if (!colaExpedientes.estaVacia()) {
            Expediente expediente = colaExpedientes.desencolar();
            Tramite tramite = new Tramite(expediente.getIdExpediente(), expediente.getDni(), null, null, null);
            listaTramites.agregar(tramite);
            System.out.println("Procesando expediente: " + expediente.getIdExpediente());
        } else {
            System.out.println("No hay expedientes en la cola de espera.");
        }
    }

    public void iniciarTramite(String idExpediente) {
        Tramite tramite = buscarTramite(idExpediente);
        if (tramite != null) {
            tramite.setFechaInicio(new Date());
            actualizarTramite(tramite);
            System.out.println("Tramite iniciado para el expediente: " + idExpediente);
            System.out.println("DNI: " + tramite.getDni());
            System.out.println("Hora de inicio: " + tramite.getFechaInicio());
        } else {
            System.out.println("Expediente no encontrado.");
        }
    }

    public void finalizarTramite(String idExpediente, String documentoProducto, Date fechaFin) {
        Tramite tramite = buscarTramite(idExpediente);
        if (tramite != null) {
            tramite.setFechaFin(fechaFin);
            tramite.setDocumentoProducto(documentoProducto);
            actualizarTramite(tramite);
            System.out.println("Tramite finalizado para el expediente: " + idExpediente);
            System.out.println("Hora de finalizacion: " + tramite.getFechaFin());
        } else {
            System.out.println("Expediente no encontrado.");
        }
    }

    public void registrarMovimiento(String idExpediente, String origen, String destino) {
        EventoTransito evento = new EventoTransito(idExpediente, origen, destino);
        listaEventos.agregar(evento);
        System.out.println("Movimiento registrado: " + idExpediente + " de " + origen + " a " + destino);
    }

    private Tramite buscarTramite(String idExpediente) {
        for (int i = 0; i < listaTramites.longitud(); i++) {
            Tramite tramite = listaTramites.obtener(i);
            if (tramite.getIdExpediente().equals(idExpediente)) {
                return tramite;
            }
        }
        return null;
    }

    private void actualizarTramite(Tramite tramiteActualizado) {
        for (int i = 0; i < listaTramites.longitud(); i++) {
            Tramite tramite = listaTramites.obtener(i);
            if (tramite.getIdExpediente().equals(tramiteActualizado.getIdExpediente())) {
                listaTramites.eliminar(i);
                listaTramites.agregar(tramiteActualizado);
                break;
            }
        }
    }
}

