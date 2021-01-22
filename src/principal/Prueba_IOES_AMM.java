
package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import utilidades.Color;
import utilidades.IO_ES;

/**Clase para elegir que desea leer o escribir
 *
 * @author Ana Muñiz
 * @version 1.0
 */
public class Prueba_IOES_AMM {
    
    /**
     * Método que visualiza el menú de elección y devuelve la opción elegida
     * @return opción elegida
     */
    public static int menu(){
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada */

        
        int option;
        
        String entrada;
        
        
       
        
       /** Clase Scanner para petición de datos de entrada */
          
        Scanner e = new Scanner(System.in);
        
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
           
        /**     Imprimir menú     */
        IO_ES.escribirLN("\n---              MENÚ              ---");
        IO_ES.escribirLN("1. Leer entero.");
        IO_ES.escribirLN("2. Leer real.");
        IO_ES.escribirLN("3. leer entero en formato largo.");
        IO_ES.escribirLN("4. Leer real en formato largo");
        IO_ES.escribirLN("5. Leer cadena de caracteres.");
        IO_ES.escribirLN("6. Leer carácter.");
        IO_ES.escribirLN("7. Leer booleano.");
        IO_ES.escribirLN("8. Visualizar contenido añadido.");
        IO_ES.escribirLN("0. Salir.");
        IO_ES.escribirLN("===========================================");
          
        option = IO_ES.leerInteger("Elija una opción: ", 0, 8);
        
        return option;
    }
    
    /**
     * Método que permite realizar una pausa en la ejecución.
     * @param ms tiempo de pausa en ms.
     */
    public static void dormir(int ms){
        try {
                    //Ponemos a "Dormir" el programa durante los ms deseados
                    Thread.sleep(ms);
                        
            } catch (Exception e) {
                    
                    
            }
    }
    
    /**
     * Método main para la ejecución del proyecto
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
        
        /** Variables auxiliares */
        
       boolean flag = false;
       
       boolean[] valido = new boolean[7];
       
       final int MS = 1000;
       
       int option;
               
      

       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
        
            flag = false;
            
            option = menu();
       
            switch(option){
                
                case 1:
                    /** Elección: 1.NÚMERO ENTERO */

                    entero[0] = IO_ES.leerInteger();
        
                    entero[1] = IO_ES.leerInteger("Quiero un entero: ");

                    entero[2] = IO_ES.leerInteger("Quiero un entero mayor o igual que 4: ", 4);

                    entero[3] = IO_ES.leerInteger("Quiero un entero entre 3 y 20: ", 3, 20);
                    
                    valido[0] = true;
                    
                    dormir(MS);

                    break;

                case 2:
                    /** Elección: 2.REAL */

                   real[0] = IO_ES.leerReal();
        
                   real[1] = IO_ES.leerReal("Quiero un número real: ");

                   real[2] = IO_ES.leerReal("Quiero un número real mayor o igual que 4: ", 4);
                   
                   valido[1] = true;
                   
                   dormir(MS);

                   break;

                case 3:
                    /** Elección: 3.ENTERO LARGO */

                   enteroLargo[0] = IO_ES.leerEnteroLargo();
        
                   enteroLargo[1] = IO_ES.leerEnteroLargo("Quiero un entero largo: ");
                   
                   valido[2] = true;
                   
                   dormir(MS);

                   break;
                   
                case 4:
                    /** Elección: 3.REAL LARGO */

                   realLargo[0] = IO_ES.leerRealLargo();
        
                   realLargo[1] = IO_ES.leerRealLargo("Quiero un número real largo: ");
                   
                   valido[3] = true;
                   
                   dormir(MS);

                   break;
                   
                case 5:
                    /** Elección: 4.CADENA */

                    cadena[0] = IO_ES.leerCadena();
                           
                    cadena[1] = IO_ES.leerCadena("Quiero una cadena: ");
                    
                    cadena[2] = IO_ES.leerCadena("Quiero una cadena de 10 caracteres: ", 10);
                    
                    valido[4] = true;
                    
                    dormir(MS);

                    break;

                case 6:
                    /** Elección: 5.CARACTER */

                   caracter[0] = IO_ES.leerCaracter();
        
                   caracter[1] = IO_ES.leerCaracter("Quiero un carácter: ");
                   
                   valido[5] = true;
                   
                   dormir(MS);

                   break;

                case 7:
                    /** Elección: 6.BOOLEANO */

                   booleano[0] = IO_ES.leerBooleano();
        
                   booleano[1] = IO_ES.leerBooleano("¿Desea confirmar? ");
                   
                   valido[6] = true;
                   
                   dormir(MS);

                   break;
                   
                case 8:
                    /** Eleccion: 8.VISUALIZAR CONTENIDO */
                    
                    IO_ES.escribirLN("-----------------------------------");
                    IO_ES.escribirLN("Los datos introduccidos son:");
                    IO_ES.escribirLN(" ");
                    
                    if(valido[0]) IO_ES.escribir("Los números enteros: " + entero[0] + ", " + entero[1] + ", " + entero[2] + " y " + entero[3] + ". ");

                    if(valido[2]) IO_ES.escribirLN("Los números enteros largo: " + enteroLargo[0] + " y " + enteroLargo[1] + ". ");

                    if(valido[1]) IO_ES.escribir("\nLos números reales: " + real[0] + ", " + real[1] + " y " + real[2] + ". ");

                    if(valido[3]) IO_ES.escribirLN("Los números reales largo: " + realLargo[0] + " y " + realLargo[1] + ". ");

                    if(valido[4]) IO_ES.escribirLN("\nLos textos son: " + cadena[0] + " , " + cadena[1] + " y " + cadena[2] + ". ");

                    if(valido[5]) IO_ES.escribirLN("\nLos caracteres son: " + caracter[0] + " y " + caracter[1] + ". ");

                    if(valido[6]) IO_ES.escribirLN("\nLos booleanos son: " + booleano[0] + " y " + booleano[1] + ". ");
                    
                    dormir(3*MS);              
                    
                    break;
                case 0:
                    /** Elección: 5. SALIR */
                   flag = true;

                   break;

                default:
                    /** elección: error */
                    System.out.println(Color.ROJO + "Error. opción incorrecta." + Color.RESET);

                    break;
                
            }//cierre switch 
            
            
                    
        }while(!flag);
        
        System.out.println ();
	System.out.println ("Fin del programa. Bye!");
      

    }
    
}
