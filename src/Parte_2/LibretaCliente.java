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
public class LibretaCliente{
    //atributos
    public List<cliente> clientes;
    //constructor
    public LibretaCliente(){
        this.clientes = new ArrayList<>();
    }
    //metodo agregar cliente
    public void AgregarCliente (cliente cliente){
        clientes.add(cliente);
    }
    //metodo eliminar cliente
    public void EliminarCliente (cliente cliente){
        clientes.remove(cliente);
    }
    //metodo para obtener clientes
    public List<cliente> obtenerCliente (){
        return clientes;
    }
    //metodo para buscar cliente por cedula
    public cliente buscarCliente (String cedula){
        for(cliente cliente : clientes){
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }
}
