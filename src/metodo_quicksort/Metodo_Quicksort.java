/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_quicksort;

/**
 *
 * @author HP
 */
public class Metodo_Quicksort {

   
    public static void main(String[] args) {
        int[] arreglo = {5,6,8,12,0,13,21,2,4,1,3,7,9,11,14,18,16,20,15,13,17,19};//se declara el tipo de datos y se inserta los valores 
       Quicksort_EDD ord = new Quicksort_EDD();//se crea una instanciacion 
        ord.ingresar_Quicksort(arreglo);//llama al metodo para utilizarlo en la subclase para poder imprimir los datos que contiene
        System.out.println("Metodo Quicksort Algoritmos de ordenamiento interno: ");

        for (int i = 0; i < arreglo.length; i++) {// se agrega un ciclo 
            System.out.print(arreglo[i] + " - ");// se imprime el resultado del metodo  Quicksort
        }
      
    }
    
}
