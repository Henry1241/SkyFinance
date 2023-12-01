/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.itson.edu.prestamo.interfaz;


/**
 * Interfaz DatoPrestamo que aplica el patron factory hacia las entidades relacionados con datos de prestamo
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 */
public interface DatoPrestamo {
    
    void id();
    void monto();
    void fecha();
    void empleado();
    void tipo();
    void cuotas();
    void cliente();
    void estadoSolicitud();
    void estado();
    void planPago();
    void garantias();
    void descripcion();
    void valor();
    void prestamo();
    void abono();
    void tasa();
    void interes();
    void fechaPago();
    void numCuota();
}
