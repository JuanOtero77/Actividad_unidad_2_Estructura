/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_2;

/**
 *
 * @author PC
 */
public class producto{
    private int codigo;
    private String nombre;
    private String marca;
    private String color;
    private double precioCompra;
    private double precioVenta;
    private double descuento;
    private int Existencia;
    private Categoria categoria;
    
    //constructor
    public producto(int codigo, String nombre, String marca, String color, double precioCompra, double precioVenta, double descuento, int Existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.descuento = descuento;
        this.Existencia = Existencia;
        this.categoria = categoria;
    }
    //getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    //metodo toSting
    @Override
    public String toString() {
        return "producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", color=" + color + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", descuento=" + descuento + ", Existencia=" + Existencia + ", categoria=" + categoria + '}';
    }
    
}
