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
public class libretaCompra{
    //atributos
    private List<compra> compras;
    //constructor
    public libretaCompra(){
        this.compras = new ArrayList<>();
    }
    //metodo agregar compra
    public void AgregarCliente (compra compra){
        compras.add(compra);
    }
    //metodo eliminar compra
    public void EliminarCliente (compra compra){
        compras.remove(compra);
    }
    //metodo para obtener compra
    public List<compra> obtenerCliente (){
        return compras;
    }
    //metodo para buscar compra por su consecutivo
    public compra buscarCompra (String consecutivo){
        for(compra compra : compras){
            if(compra.getConsecutivo() == consecutivo){
                return compra;
            }
        }
        return null;
    }
}
