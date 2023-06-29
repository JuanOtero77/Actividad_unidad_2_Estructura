/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class libretaProducto{
    //atributos
    private List<producto> productos;
    //constructor
    public libretaProducto(){
        this.productos = new ArrayList<>();
    }
    //metodo agregar producto
    public void AgregarProducto (producto producto){
        productos.add(producto);
    }
    //metodo eliminar producto
    public void EliminarProducto (producto producto){
        productos.remove(producto);
    }
    //metodo para obtener producto
    public List<producto> obtenerProducto (){
        return productos;
    }
    //metodo para buscar producto por codigo
    public producto buscarProducto (int codigo){
        for(producto producto : productos){
            if(producto.getCodigo() == codigo){
                return producto;
            }
        }
        return null;
    }
}
