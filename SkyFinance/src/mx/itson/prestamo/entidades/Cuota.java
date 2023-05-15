/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.prestamo.entidades;

import java.time.LocalDateTime;
import java.util.List;
import mx.itson.prestamo.enumeradores.EstadoCuota;

/**
 *
 * @author enri0
 */
public class Cuota {
    private int id;
    private LocalDateTime fecha;
    private Prestamo prestamo;
    private int numCuota;
    private EstadoCuota estado;
    private LocalDateTime fechaPago;
    private double interes;
    private double monto;
    private double tasa;
    private List<Abono> abono;

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
     * @return the prestamo
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    /**
     * @return the numCuota
     */
    public int getNumCuota() {
        return numCuota;
    }

    /**
     * @param numCuota the numCuota to set
     */
    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    /**
     * @return the estado
     */
    public EstadoCuota getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoCuota estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaPago
     */
    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
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
     * @return the tasa
     */
    public double getTasa() {
        return tasa;
    }

    /**
     * @param tasa the tasa to set
     */
    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    /**
     * @return the abono
     */
    public List<Abono> getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(List<Abono> abono) {
        this.abono = abono;
    }
    
}
