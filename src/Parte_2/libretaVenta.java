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
public class libretaVenta {
    //atributos
    private List<venta> ventas;
    //constructor
    public libretaVenta(){
        this.ventas = new ArrayList<>();
    }
    //metodo agregar venta
    public void AgregarCliente (venta venta){
        ventas.add(venta);
    }
    //metodo eliminar venta
    public void EliminarCliente (venta venta){
        ventas.remove(venta);
    }
    //metodo para obtener venta
    public List<venta> obtenerCliente (){
        return ventas;
    }
    //metodo para buscar venta por su consecutivo
    public venta buscarventa (String consecutivo){
        for(venta venta : ventas){
            if(venta.getConsecutivo() == consecutivo){
                return venta;
            }
        }
        return null;
    }
}
