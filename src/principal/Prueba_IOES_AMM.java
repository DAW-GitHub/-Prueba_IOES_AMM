/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import utilidades.Color;
import utilidades.IO_ES;

/**
 *
 * @author Ana
 */
public class Prueba_IOES_AMM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        int[] entero = new int[4];
        
        long[] enteroLargo = new long[2];
        
        float[] real = new float[3];
        
        double[] realLargo =  new double[2];
        
        String[] cadena = new String[3];
        
        char[] caracter = new char[2];
        
        boolean[] booleano = new boolean[2];
               
      

       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        //Leer Enteros:
        
        entero[0] = IO_ES.leerInteger();
        
        entero[1] = IO_ES.leerInteger("Quiero un entero: ");
        
        entero[2] = IO_ES.leerInteger("Quiero un entero mayor que 4: ", 4);
        
        entero[3] = IO_ES.leerInteger("Quiero un entero entre 3 y 20: ", 3, 20);
        
        //Leer entero largo;
        
        enteroLargo[0] = IO_ES.leerEnteroLargo();
        
        enteroLargo[1] = IO_ES.leerEnteroLargo("Quiero un enteroLargo: ");
        
        //Leer Real
        
        real[0] = IO_ES.leerReal();
        
        real[1] = IO_ES.leerReal("Quiero un número real: ");
        
        real[2] = IO_ES.leerReal("Quiero un número real mayor que 4: ", 4);
        
        //Leer real largo;
        
        realLargo[0] = IO_ES.leerRealLargo();
        
        realLargo[1] = IO_ES.leerRealLargo("Quiero un número real Largo: ");
        
        //Leer cadena
        
        cadena[0] = IO_ES.leerCadena();
        
        cadena[1] = IO_ES.leerCadena("Quiero una cadena: ");
        
        cadena[2] = IO_ES.leerCadena("Quiero una cadena de menos de 10 caracteres: ", 10);
        
        //Leer carácter
        
        caracter[0] = IO_ES.leerCaracter();
        
        caracter[1] = IO_ES.leerCaracter("Quiero un carácter: ");
        
        //Leer booleano
        
        booleano[0] = IO_ES.leerBooleano();
        
        booleano[1] = IO_ES.leerBooleano("Escribe true o false: ");
        
        //Imprimir datos:
        IO_ES.escribirLN("-----------------------------------");
        IO_ES.escribirLN("Los datos introduccidos son:");
        IO_ES.escribirLN(" ");
        
        IO_ES.escribir("Los números enteros: " + entero[0] + ", " + entero[1] + ", " + entero[2] + " y " + entero[3] + ". ");
        
        IO_ES.escribirLN("Los números enteros largo: " + enteroLargo[0] + " y " + enteroLargo[1] + ". ");
        
        IO_ES.escribir("Los números reales: " + real[0] + ", " + real[1] + " y " + real[2] + ". ");
        
        IO_ES.escribirLN("Los números reales largo: " + realLargo[0] + " y " + realLargo[1] + ". ");
        
        IO_ES.escribirLN("Los textos son: " + cadena[0] + " y " + cadena[1] + ". ");
        
        IO_ES.escribirLN("Los caracteres son: " + caracter[0] + " y " + caracter[1] + ". ");
        
        IO_ES.escribirLN("Los booleanos son: " + booleano[0] + " y " + booleano[1] + ". ");
        
    }
    
}
