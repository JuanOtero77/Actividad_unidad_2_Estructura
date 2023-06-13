/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamientos {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(90, 12, 30, 70, 25, 50));

        //Ordenacion burbuja
        List<Integer> ListaOrdenamientoBurbuja = new ArrayList<>(lista);
        OrdenamientoBurbuja(ListaOrdenamientoBurbuja);
        System.out.println("Ordenamiento burbuja: " + ListaOrdenamientoBurbuja);
        //Ordenamiento Seleccion
        List<Integer> ListaOrdenamientoSeleccion = new ArrayList<>(lista);
        OrdenamientoSeleccion(ListaOrdenamientoSeleccion);
        System.out.println("Ordenamiento por seleccion: " + ListaOrdenamientoSeleccion);
        //Ordenamiento Insercion
        List<Integer> ListaOrdenamientoInsercion = new ArrayList<>(lista);
        OrdenamientoInsercion(ListaOrdenamientoInsercion);
        System.out.println("Ordenamiento por insercion: " + ListaOrdenamientoInsercion);
        //Ordenamiento por monticulos
        List<Integer> ListaOrdenamientoMonticulos = new ArrayList<>(lista);
        OrdenamientoMonticulos(ListaOrdenamientoMonticulos);
        System.out.println("Ordenamiento por monticulos: " + ListaOrdenamientoMonticulos);
        //Ordenamiento shell
        List<Integer> ListaOrdenamientoShell = new ArrayList<>(lista);
        OrdenamientoShell(ListaOrdenamientoShell);
        System.out.println("Ordenamiento shell: " + ListaOrdenamientoShell);
        //Ordenamiento rapido
        List<Integer> ListaOrdenamientoRapido = new ArrayList<>(lista);
        OrdenamientoRapido(ListaOrdenamientoRapido);
        System.out.println("Ordenamiento rapido: " + ListaOrdenamientoRapido);
        //Ordenamiento por mezcla
        List<Integer> ListaOrdenamientoMezcla = new ArrayList<>(lista);
        OrdenamientoMezcla(ListaOrdenamientoMezcla);
        System.out.println("Ordenamiento por mezcla: " + ListaOrdenamientoMezcla);
        //Ordenamiento por radix
        List<Integer> ListaOrdenamientoRadix = new ArrayList<>(lista);
        OrdenamientoRadix(ListaOrdenamientoRadix);
        System.out.println("Ordenamiento por radix: " + ListaOrdenamientoRadix);
        //Ordenamiento por cuentas
        List<Integer> ListaOrdenamientoCuentas = new ArrayList<>(lista);
        OrdenamientoCuentas(ListaOrdenamientoCuentas);
        System.out.println("Ordenamiento por cuentas: " + ListaOrdenamientoCuentas);
        //Ordenamiento por casillas
        List<Integer> ListaOrdenamientoCasillas = new ArrayList<>(lista);
        OrdenamientoCasillas(ListaOrdenamientoCasillas);
        System.out.println("Ordenamiento por casillas: " + ListaOrdenamientoCasillas);
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
    //Ordenamiento por monticulos
    
    public static void OrdenamientoMonticulos(List<Integer> lista) {
        int n = lista.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            juntar(lista, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = lista.get(0);
            lista.set(0, lista.get(i));
            lista.set(i, temp);
            juntar(lista, i, 0);
        }
    }

    public static void juntar(List<Integer> lista, int n, int i) {
        int raiz = i;
        int nIzquierda = 2 * i + 1;
        int nDerecha = 2 * i + 2;

        if (nIzquierda < n && lista.get(nIzquierda) > lista.get(raiz)) {
            raiz = nIzquierda;
        }
        if (nDerecha < n && lista.get(nDerecha) > lista.get(raiz)) {
            raiz = nDerecha;
        }
        if (raiz != i) {
            int swap = lista.get(i);
            lista.set(i, lista.get(raiz));
            lista.set(raiz, swap);
            juntar(lista, n, raiz);
        }
    }

    //Ordenamiento shell
    public static void OrdenamientoShell(List<Integer> lista) {
        int n = lista.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = lista.get(i);
                int j;
                for (j = i; j >= gap && lista.get(j - gap) > temp; j -= gap) {
                    lista.set(j, lista.get(j - gap));
                }
                lista.set(j, temp);
            }
        }
    }

    //Ordenamiento rapido
    public static void OrdenamientoRapido(List<Integer> lista) {
        OrdenamientoRapido(lista, 0, lista.size() - 1);
    }

    public static void OrdenamientoRapido(List<Integer> lista, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(lista, low, high);
            OrdenamientoRapido(lista, low, pivotIndex - 1);
            OrdenamientoRapido(lista, pivotIndex + 1, high);
        }
    }

    public static int partition(List<Integer> lista, int low, int high) {
        int pivot = lista.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (lista.get(j) < pivot) {
                i++;
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(high));
        lista.set(high, temp);
        return i + 1;
    }

    //Ordenamiento por mezcla
    public static void OrdenamientoMezcla(List<Integer> lista) {
        if (lista.size() <= 1) {
            return;
        }
        int mid = lista.size() / 2;
        List<Integer> left = new ArrayList<>(lista.subList(0, mid));
        List<Integer> right = new ArrayList<>(lista.subList(mid, lista.size()));
        OrdenamientoMezcla(left);
        OrdenamientoMezcla(right);
        Mezcla(lista, left, right);
    }

    public static void Mezcla(List<Integer> lista, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                lista.set(k, left.get(i));
                i++;
            } else {
                lista.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < left.size()) {
            lista.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            lista.set(k, right.get(j));
            j++;
            k++;
        }
    }
    //Ordenamiento por radix
    public static void OrdenamientoRadix(List<Integer> lista){
        int max = Collections.max(lista);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            ContadorOrdenamientoRadix(lista, exp);
        }
    }
    public static void ContadorOrdenamientoRadix(List<Integer> lista, int exp){
        int n = lista.size();
        int[] contador = new int[10];
        List<Integer> salida = new ArrayList<>(n);
        for(int num : lista){
            contador[(num / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            salida.add(0);
        }
        for (int i = n - 1; i >= 0; i--){
            int num = lista.get(i);
            int digito = (num / exp) % 10;
            salida.set(contador[digito] - 1, num);
            contador[digito]--;
        }
        for (int i = 0; i < n; i++) {
            lista.set(i, salida.get(i));
        }
    }
    //Ordenamiento por cuentas
    public static void OrdenamientoCuentas(List<Integer> lista){
        int max = Collections.max(lista);
        int min = Collections.min(lista);
        int rango = max - min + 1;
        
        int[] contador = new int[rango];
        List<Integer> salida = new ArrayList<>(lista.size());
        for(int num : lista){
            contador[num - min]++;
        }
        for (int i = 0; i < rango; i++) {
            while(contador[i] > 0){
                salida.add(i + min);
                contador[i]--;
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, salida.get(i));
        }
    }
    //Ordenamiento por casillas
    public static void OrdenamientoCasillas(List<Integer> lista){
        int n = lista.size();
        List<List<Integer>> bucles = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            bucles.add(new ArrayList<>());
        }
        for(int num : lista){
            int bucleIndex = (int) Math.floor(n * num / (float) (Collections.max(lista) + 1));
            bucles.get(bucleIndex).add(num);
        }
        int index = 0;
        for(List<Integer> bucle : bucles){
            for(int num : bucle){
                lista.set(index++, num);
            }
        }
    }
}
