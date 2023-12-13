/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        // te genera 5 espacios en blanco para que los llenes
        int[] arreglo1 = new int[5];
        
        // arreglo de tipo entero
        //es una manera mas alargada de poner lo mismo de arriba
        int[] arreglo2;
        arreglo2 = new int[5];
        
        // arreglo de tipo entero
        //llenamos el arreglo con datos ya definidos
        int[] arreglo3 = {5, 10, 15, 20, 25}; // sin new
        
        // arreglo de doubles - 3 elementos
        //cuando usamos valores decimales, los escribimos con .
        double[] arreglo4 = {5.1, 10.2, 15.2}; // sin new
        
        // arreglo de cadenas - 4 elementos
        //llenamos un arreglo d elementos de cadena
        String[] arreglo5 = {"Loja", "Quito", "Zamora", "Machala"};
    }

}
