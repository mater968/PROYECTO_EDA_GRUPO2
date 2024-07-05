package main;

import modelo.*;
import servicio.GestionTramite;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestionTramite gestionTramite = new GestionTramite();

        // Registrar algunos expedientes
        Expediente exp1 = new Expediente("EXP001", 1, "12345678", "Solicitud de Certificado", "DocRef001");
        Expediente exp2 = new Expediente("EXP002", 2, "87654321", "Reclamacion", "DocRef002");

        gestionTramite.registrarExpediente(exp1);
        gestionTramite.registrarExpediente(exp2);
        System.out.println("-------------------------------------------------------");

        // Procesar el primer expediente
        gestionTramite.procesarSiguienteExpediente();
        gestionTramite.iniciarTramite("EXP001");

        // Finalizar el trámite con una fecha de finalización proporcionada por el administrador
        Date fechaFin = new Date();  // Aquí puedes usar cualquier fecha deseada
        gestionTramite.finalizarTramite("EXP001", "DocumentoFinalizado001", fechaFin);

        gestionTramite.registrarMovimiento("EXP001", "Administracion", "Secretaria");
        System.out.println("------------------------------------------------------");

        // Procesar el segundo expediente
        gestionTramite.procesarSiguienteExpediente();
        gestionTramite.iniciarTramite("EXP002");

        // Finalizar el trámite con una fecha de finalización proporcionada por el administrador
        fechaFin = new Date();  // Aquí puedes usar cualquier fecha deseada
        gestionTramite.finalizarTramite("EXP002", "DocumentoFinalizado002", fechaFin);

        gestionTramite.registrarMovimiento("EXP002", "Secretaria", "Administracion");
    }
}
