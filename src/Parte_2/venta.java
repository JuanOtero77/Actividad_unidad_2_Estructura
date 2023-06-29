/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_2;

/**
 *
 * @author PC
 */
public class venta{
    //atributos
    private String consecutivo;
    private String fecha;
    private cliente cliente;
    private String medioPago;
    private String modalidad;
    private producto productos;
    private double valorDescuento;
    private double valorTotal;
    //constructor
    public venta(String consecutivo, String fecha, cliente cliente, String medioPago, String modalidad, producto productos, double valorDescuento, double valorTotal) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.productos = productos;
        this.valorDescuento = valorDescuento;
        this.valorTotal = valorTotal;
    }
    //getters and setters

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public producto getProductos() {
        return productos;
    }

    public void setProductos(producto productos) {
        this.productos = productos;
    }

    public double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
