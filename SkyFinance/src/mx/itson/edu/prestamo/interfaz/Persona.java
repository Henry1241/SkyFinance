/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.itson.edu.prestamo.interfaz;

import mx.itson.edu.prestamo.entidades.Cliente;
import mx.itson.edu.prestamo.entidades.Empleado;

/**
 * Interfaz Persona que aplica el patron factory hacia las entidades relacionadas con empleados y clientes
 * @author Enrique Gonzales Leyva
 *         Jesus Alexis Martan Gallardo
 *         Xylan Rodriguez Robles
 *         Omar Ignacio Urias Ruiz
 */
public interface Persona {
    
    void id();
    void nombre();
    void apellido();
    void direccion();
    void telefono();
    void email();
    void sueldo();
    void cargo();
    
    Cliente definirId();
    Cliente definirNombre();
    Cliente definirApellido();
    Cliente definirDireccion();
    Cliente definirTelefono();
    Cliente definirEmail();
    Cliente definirSueldo();
    
    Empleado definirCargo();
}
