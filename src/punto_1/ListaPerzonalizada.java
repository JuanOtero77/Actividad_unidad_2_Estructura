/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ListaPerzonalizada {

    private List<Integer> numeros;

    public ListaPerzonalizada() {
        numeros = new ArrayList<>();
    }

    //operacion para agregar el elemento en la lista
    public void agregar(int numero) {
        numeros.add(numero);
    }

    //operacion para eliminar el elemento en la lista
    public void eliminar(int numero) {
        numeros.remove(Integer.valueOf(numero));
    }

    //operacion para verificar si el elemento esta en la lista
    public boolean encontrar(int numero) {
        return numeros.contains(numero);
    }

    public static void main(String[] args) {
        ListaPerzonalizada lista = new ListaPerzonalizada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        
        System.out.println(lista.encontrar(2));
        lista.eliminar(2);
        System.out.println(lista.encontrar(2));
    }
}
