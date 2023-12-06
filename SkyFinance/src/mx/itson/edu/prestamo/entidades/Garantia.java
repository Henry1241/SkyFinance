/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.edu.prestamo.entidades;

import mx.itson.edu.prestamo.interfaz.DatoPrestamo;

/**
 * Clase garantia que guarda los valores necesarios para la garantia
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 *         Omar Ignacio Urias Ruiz
 */
public class Garantia{

    private final DatoPrestamo datoPrestamo;
    
    public Garantia(DatoPrestamo datoPrestamo){
        this.datoPrestamo = datoPrestamo;
    }
    
    public void id(){
        datoPrestamo.id();
    }
    
    public void descripcion(){
        datoPrestamo.descripcion();
    }
    
    public void valor(){
        datoPrestamo.valor();
    }
}
