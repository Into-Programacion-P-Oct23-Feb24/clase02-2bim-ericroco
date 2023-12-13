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
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        String acu = "";
        int acu2 = 0;
        // arreglo de tipo entero
        //int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        // System.out.println(arreglo1.length);
        //arreglo1[2] = 1000;
        // el length me devuelve el numero de elementos q tiene el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            acu2 = acu2 + arreglo1[i];
            acu = String.format("%sSubindice o indice %d, con valor %d\n",
                    acu, i, arreglo1[i]);
        }
        acu = String.format("%s\nLa Suma de estos valores es: %d",
                 acu, acu2);
        System.out.printf("%s\n",
                acu.toUpperCase());

    }

}
