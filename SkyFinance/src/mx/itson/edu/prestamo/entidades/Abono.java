/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.edu.prestamo.entidades;

import mx.itson.edu.prestamo.interfaz.DatoPrestamo;
/**
 * Clase abono que guarda los valores necesarios para un abono
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 *         Omar Ignacio Urias Ruiz
 */
public class Abono {
    private final DatoPrestamo datoPrestamo;
   
    public Abono(DatoPrestamo datoPrestamo){
        this.datoPrestamo = datoPrestamo;
    }
    
    public void id(){
        datoPrestamo.id();
    }
    
    public void fecha(){
        datoPrestamo.fecha();
    }
    
    public void monto(){
        datoPrestamo.monto();
    }
    
    public void tipo(){
        datoPrestamo.tipo();
    }
   
}
