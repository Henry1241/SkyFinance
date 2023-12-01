/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.edu.prestamo.entidades;

import mx.itson.edu.prestamo.interfaz.DatoPrestamo;

/**
 * Clase cuota que guarda los valores necesarios para generar una cuota
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 */
public class Cuota {
    private final DatoPrestamo datoPrestamo;
    
    public Cuota(DatoPrestamo datoPrestamo){
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
    
    public void estado(){
        datoPrestamo.estado();
    
    }
    
    public void numCuota(){
        datoPrestamo.numCuota();
    }
    
    public void prestamo(){
        datoPrestamo.prestamo();
    }
    
    public void fechaPago(){
        datoPrestamo.fechaPago();
    }
    
    public void intenres(){
        datoPrestamo.interes();
    }
    
    public void tasa(){
        datoPrestamo.tasa();
    }
    
    public void abono(){
        datoPrestamo.abono();
    }     
}