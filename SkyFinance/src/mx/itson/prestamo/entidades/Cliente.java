/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.prestamo.entidades;

import mx.itson.edu.prestamo.interfaz.Persona;

/**
 *
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 */
public class Cliente {
    private final Persona persona;

  public Cliente(Persona persona){
        this.persona = persona;
    }
    
    public void id(){
        persona.id();
    }
    
    public void nombre(){
        persona.nombre();
    }
    
    public void apellido(){
        persona.apellido();
    }
    
    public void direccion(){
        persona.direccion();
    }
    
    public void telefono(){
        persona.telefono();
    }
    
    public void email(){
        persona.email();
    }
    
    public void sueldo(){
        persona.sueldo();
    }
}
