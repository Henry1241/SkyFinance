/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.edu.prestamo.entidades;

import mx.itson.edu.prestamo.interfaz.DatoPrestamo;

/**
 * Clase prestamo que guarda los valores necesarios para generar un prestamo
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 */
public class Prestamo {    
    private final DatoPrestamo datoPrestamo;
    
    public Prestamo(DatoPrestamo datoPrestamo){
        this.datoPrestamo = datoPrestamo;
    }
    
    public void id(){
        datoPrestamo.id();
    }
    
    public void monto(){
        datoPrestamo.monto();
    }
    
    public void fecha(){
        datoPrestamo.fecha();
    }
    
    public void empleado(){
        datoPrestamo.empleado();
    }
    
    public void tipo(){
        datoPrestamo.tipo();
    }
    
    public void cuotas(){
        datoPrestamo.cuotas();
    }
    
    public void cliente(){
        datoPrestamo.cliente();
    }
    
    public void estadoSolicitud(){
        datoPrestamo.estadoSolicitud();
    }
    
    public void estado(){
        datoPrestamo.estado();
    }
    
    public void planPago(){
        datoPrestamo.planPago();
    }
    
    public void garantias(){
        datoPrestamo.garantias();
    }
}
