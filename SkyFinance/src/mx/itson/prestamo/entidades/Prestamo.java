/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.prestamo.entidades;

import java.time.LocalDateTime;
import java.util.List;
import mx.itson.prestamo.enumeradores.EstadoPrestamo;
import mx.itson.prestamo.enumeradores.EstadoSolicitud;
import mx.itson.prestamo.enumeradores.PlanPago;
import mx.itson.prestamo.enumeradores.TipoPrestamo;

/**
 *
 * @author Sisti
 */
public class Prestamo {
    
    private int id;
    private double monto;
    private LocalDateTime fecha;
    private Empleado empleado;
    private TipoPrestamo tipo;
    private List<Cuota> cuotas;
    private Cliente cliente;
    private EstadoSolicitud estadoSolicitud;
    private EstadoPrestamo estado;
    private PlanPago planPago;
    private List<Garantia> garantias;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the tipo
     */
    public TipoPrestamo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoPrestamo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cuotas
     */
    public List<Cuota> getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the estadoSolicitud
     */
    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    /**
     * @param estadoSolicitud the estadoSolicitud to set
     */
    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    /**
     * @return the estado
     */
    public EstadoPrestamo getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    /**
     * @return the planPago
     */
    public PlanPago getPlanPago() {
        return planPago;
    }

    /**
     * @param planPago the planPago to set
     */
    public void setPlanPago(PlanPago planPago) {
        this.planPago = planPago;
    }

    /**
     * @return the garantias
     */
    public List<Garantia> getGarantias() {
        return garantias;
    }

    /**
     * @param garantias the garantias to set
     */
    public void setGarantias(List<Garantia> garantias) {
        this.garantias = garantias;
    }
    
    
}
