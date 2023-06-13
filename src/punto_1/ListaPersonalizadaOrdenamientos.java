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
public class ListaPersonalizadaOrdenamientos {
    private List<Integer> numeros;

    public ListaPersonalizadaOrdenamientos() {
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
    //Ordenacion burbuja
    public static void OrdenamientoBurbuja(List<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    //Ordenamiento Seleccion
    public static void OrdenamientoSeleccion(List<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            int minElemento = i;
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j) < lista.get(minElemento)) {
                    minElemento = j;
                }
            }
            int temp = lista.get(minElemento);
            lista.set(minElemento, lista.get(i));
            lista.set(i, temp);
        }
    }

    //Ordenamiento insercion
    public static void OrdenamientoInsercion(List<Integer> lista) {
        int n = lista.size();
        for (int i = 1; i < n; i++) {
            int key = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > key) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, key);
        }
    }
    public static void main(String[] args) {
        ListaPersonalizadaOrdenamientos lista = new ListaPersonalizadaOrdenamientos();
        lista.agregar(10);
        lista.agregar(23);
        lista.agregar(37);
        lista.agregar(12);
        lista.agregar(29);
        lista.agregar(24);
        //Lista original
        System.out.println("Lista personalizada: "+lista.numeros);
        //Ordenacion burbuja
        List<Integer> ListaOrdenamientoBurbuja = new ArrayList<>(lista.numeros);
        lista.OrdenamientoBurbuja(ListaOrdenamientoBurbuja);
        System.out.println("Lista persozanilzada por ordenamiento burbuja: "+ListaOrdenamientoBurbuja);
        //Ordenamiento Seleccion
        List<Integer> ListaOrdenamientoSeleccion = new ArrayList<>(lista.numeros);
        lista.OrdenamientoSeleccion(ListaOrdenamientoSeleccion);
        System.out.println("Lista persozanilzada por ordenamiento seleccion: "+ListaOrdenamientoSeleccion);
        //Ordenamiento Insercion
        List<Integer> ListaOrdenamientoInsercion = new ArrayList<>(lista.numeros);
        lista.OrdenamientoInsercion(ListaOrdenamientoInsercion);
        System.out.println("Lista persozanilzada por ordenamiento insercion: "+ListaOrdenamientoInsercion);
    }
}
