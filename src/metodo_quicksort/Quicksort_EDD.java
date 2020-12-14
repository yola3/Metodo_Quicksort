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
public class Quicksort_EDD {
     public void ingresar_Quicksort(int[] arreglo) {//Metodo para ingresar el arreglo
        arreglo = Quicksort1(arreglo);//areglo sera  igual al arreglo ya ordenado
    }

    public int[] Quicksort1(int num[]) {//metodo para ingresar arreglo de nuevo
        return Quicksort2(num, 0, num.length - 1);//quicksor2 contiene todo el el codico para ordena, tiene un parametro de num que 
        // corresponde al arreglo, el 0 al puntero izquierdo y el numero.legth correspode al puntero derecho.
       
    }

    public int[] Quicksort2(int nElementos[], int izq, int der) {//metodo principal para ordenar con parametros iniciales.
                                                              
        if (izq >= der) {//compara punteros para saber si el izquierdo es igual o mayor a la derecha
            return nElementos;//regresa el arreglo
        }
        int i = izq, d = der;//se hace referencia a los punteros con variables independientes
        if (izq != der) {//se compara, tienen que ser diferentes
            int pivote;//si en la comparacion sale que es diferente, se declara el pivote
            int aux;//variable para poder hacer los movimientos
            pivote = izq;//se compara al valor de la izquierda
            while (izq != der) {//se agrega el ciclo while para que se ejecute todo el movimiento, mientra que izq sea diferente que der
            
                while (nElementos[der] >= nElementos[pivote] && izq < der) {//se revisa el lado derecho todos los nElemntos mientras sea mayor o igual a pivote
                    der--;//y meyor al indice izquierdo entonces se va decrementando el puntero derecha
                }
                while (nElementos[izq] < nElementos[pivote] && izq < der) {//
                    izq++;//esto indica que estan en la posicion adecuada menores al pivote
                    //del lado izquierdo, entonces va incrementando el puntero
                }//pero cuando no sea asi
                if (der != izq) {//en este if se hace el cambio, si derecha es diferente que izquierda
                    //
                    aux = nElementos[der];//cuando se haga el cambio se va a guaradar en la variable auxiliar
                    nElementos[der] = nElementos[izq];  // se intercambia el lado derecho por el lado izquierdo
                    nElementos[izq] = aux;// el lado izquierdo se guarda en la auxiliar
                  
                }
            }
            if (izq == der) {// si los punteros estan iguales
                Quicksort2(nElementos, i, izq - 1);//se vuelve a repetir la secuencia (metodo)
                // se ejecuta de nuevo el metodo pero con punteros diferentes en el lado izquierdo.
                
                Quicksort2(nElementos, izq + 1, d);//se ejecuta de nuevo el metodo pero con punteros diferetes en el lado derecho
                //y asi sucesivamente hasta ordenar el arreglo
            }
        } else {//si no entonces, retorna el numero de elementos
            return nElementos;//
        }
        return nElementos;//
    }
}

    

