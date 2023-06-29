/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_2;

/**
 *
 * @author PC
 */
public class compra{
    //atributos
    private String consecutivo;
    private String fecha;
    private String proveedor;
    private producto producto;
    private double precioCompra;
    private int cantidad;
    private double precioSinIva;
    private double precioIva;
    private double precioTotal;
    //contructor
     public compra(String consecutivo, String fecha, String proveedor, producto producto, double precioCompra, int cantidad, double precioSinIva, double precioIva, double precioTotal) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.producto = producto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.precioSinIva = precioSinIva;
        this.precioIva = precioIva;
        this.precioTotal = precioTotal;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public double getPrecioIva() {
        return precioIva;
    }

    public void setPrecioIva(double precioIva) {
        this.precioIva = precioIva;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
