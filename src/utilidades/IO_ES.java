/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/** Clase que recoge métodos para pedir por teclado y presentar por pantalla.
 *
 * @author Ana
 */
public class IO_ES {
    
     /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * un número entero.
    *
    * @return entero
    */
   public static int leerInteger() {
       
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       int d = 0;
               
       /** Variables auxiliares */
 
       boolean numeroValido = false;
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

       do {

            Scanner sc = new Scanner(System.in);

            System.out.print("Introduzca un numero entero: ");
            String s = sc.nextLine();

            if (s != null) {
               try {
                  d = Integer.valueOf(s);
                  numeroValido = true;
               } catch (NumberFormatException e) {
                  System.out.println(Color.ROJO + "ERROR:  El numero introducido no es válido" + Color.RESET);
               }
            } else {
               numeroValido = true; // Cancelado
            }
       } while (!numeroValido);

       return d;
   }//cierre del método leerInteger()

   /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * un número entero.
    *
    * @param msg  mensaje que muestra para la petición del dato.
    * @return entero
    */
   static public int leerInteger(String msg) {
       
       //----------------------------------------------
       /**          DECLARACIÓN DE VARIABLES         */
       //---------------------------------------------- 
        
       /** Variables de entrada - salida */
       int d = 0;
               
       /** Variables auxiliares */
 
       boolean numeroValido = false;
       
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------

       do {

            Scanner sc = new Scanner(System.in);

            System.out.print(msg);
            String s = sc.nextLine();

            if (s != null) {
                
               try {
                   
                  d = Integer.valueOf(s);
                          
                  numeroValido = true;
                  
               } catch (NumberFormatException e) {
                   
                  System.out.println(Color.ROJO + "ERROR:  El numero introducido no es válido" + Color.RESET);
                  
               }
               
            } else {
                
               numeroValido = true; // Cancelado
               
            }
       } while (!numeroValido);

       return d;
   }
   
   /**
    * Método que pide al usuario que introduzca un número. 
    * El número esperado es un número entero mayor que el parametro de entrada min. 
    * @param msg mensaje que muestra para la petición del dato.
    * @param min valor mínimo
    * @return d valor introducido.
    */
   static public int leerInteger(String msg, int min) {
      //----------------------------------------------
      /**          DECLARACIÓN DE VARIABLES         */
      //---------------------------------------------- 
        
      /** Variables de entrada - salida */
      int d = 0;
               
      /** Variables auxiliares */
 
      boolean numeroValido = false;
       
      //---------------------------------------------- 
      /**          POCESAMIENTO DE DATOS            */
      //----------------------------------------------

      do {

         Scanner sc = new Scanner(System.in);

         System.out.print(msg);
         String s = sc.nextLine();

         if (s != null) {
            try {
               d = Integer.valueOf(s);
               
               numeroValido = true;
               
               if (d < min){  

                    System.out.println(Color.ROJO + "Introduzca un número mayor que " + min + "." + Color.RESET);
                    
                    numeroValido = false;
                }
               
            } catch (NumberFormatException e) {
                
               System.out.println(Color.ROJO + "ERROR:  El numero introducido no es válido" + Color.RESET);
               
            }
         } else {
             
            numeroValido = true; // Cancelado
            
         }
         
      } while (!numeroValido);

      return d;
   }
   
   /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * El número esperado es un número entero comprendido entre el valor de los parametros de entrada min y max.
    * @param msg mensaje que muestra para la petición del dato
    * @param min valor mínimo
    * @param max valor máximo
    * @return d valor introducido.
    */
   static public int leerInteger(String msg, int min, int max) {
      //----------------------------------------------
      /**          DECLARACIÓN DE VARIABLES         */
      //---------------------------------------------- 
        
      /** Variables de entrada - salida */
      int d = 0;
               
      /** Variables auxiliares */
 
      boolean numeroValido = false;
       
      //---------------------------------------------- 
      /**          POCESAMIENTO DE DATOS            */
      //----------------------------------------------

      do {

         Scanner sc = new Scanner(System.in);

         System.out.print(msg);
         String s = sc.nextLine();

         if (s != null) {
            try {
               d = Integer.valueOf(s);
               
               numeroValido = true;
               
               if (d < min || d > max){  

                    System.out.println(Color.ROJO + "Introduzca un número del " + min + " al " + max + "." + Color.RESET);
                    
                    numeroValido = false;
                }
               
            } catch (NumberFormatException e) {
                
               System.out.println(Color.ROJO + "ERROR:  El numero introducido no es válido" + Color.RESET);
               
            }
         } else {
            numeroValido = true; // Cancelado
         }
      } while (!numeroValido);

      return d;
   }
   
   /**
     * Pide por teclado y devuelve un número entero en formato largo
     * @return número entero introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número entero en formato largo.
     */
    public static long leerEnteroLargo(){
       
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        long a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print("Introduce un número: "); 
            
            a = s.nextLong(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: no ha introduccido un número real."+ e.getMessage() + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
    
    /**
     * Pide por teclado y devuelve un número entero en formato largo
     * @param msg mensaje que muestra para la petición del dato.
     * @return número entero introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número entero en formato largo.
     */
    public static long leerEnteroLargo(String msg){
       
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        long a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(msg); 
            
            a = s.nextLong(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println("Error: no ha introduccido un número real."+ e.getMessage());
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
   
    /**
     * Pide por teclado y devuelve un número real
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real.
     */
    public static float leerReal (){
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        float a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print("Introduce un número: "); 
            
            a = s.nextFloat(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: no ha introduccido un número real." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
    }
    
    /**
     * Pide por teclado y devuelve un número real
     * @param msg mensaje que muestra para la petición del dato.
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real.
     */
    public static float leerReal (String msg){
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        float a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(msg); 
            
            a = s.nextFloat(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: no ha introduccido un número real." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
    }
       
    /**
     * Pide por teclado y devuelve un número real.
     * @param msg mensaje que muestra para la petición del dato.
     * @param min dato de entrada.
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real.
     */
    public static float leerReal (String msg, int min){
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        float a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(msg); 
            
            a = s.nextFloat(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
            
            if (a < min){  

                    System.out.println(Color.ROJO + "Introduzca un número mayor que " + min + "." + Color.RESET);
                    
                    flag = false;
            }
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: no ha introduccido un número real." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
    }
    
    /**
     * Pide por teclado y devuleve un número real en formato largo
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real en formato largo.
     */
    public static double leerRealLargo(){
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        double a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print("Introduce un número: "); 
            
            a = s.nextDouble(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: no ha introduccido un número real."+ e.getMessage() + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
   
    /**
     * Pide por teclado y devuleve un número real en formato largo
     * @return número real introducido.
     * 
     * Excepcion.
     *            Ocurre cuando no introducimos un número real en formato largo.
     */
    public static double leerRealLargo(String msg){
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        double a = 0;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            s.useLocale(Locale.US);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(msg); 
            
            a = s.nextDouble(); //ENTRADA DE DATOS 
            s.reset();
            
            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println("Error: no ha introduccido un número real."+ e.getMessage());
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
    
    /**
     * Pide por teclado y devuelve una letra
     * @param mensaje mensaje saliente.
     * @return letra introducida.
     * @throws Ocurre cuando no introducimos una letra.
     */
    public static String leerCadena(){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print("Escriba un texto:"); 
            
            a = s.next(); //ENTRADA DE DATOS 

            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: No ha introducido una cadena." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
    
    /**
     * Pide por teclado y devuelve una letra
     * @param mensaje mensaje saliente.
     * @return letra introducida.
     * @throws Ocurre cuando no introducimos una letra.
     */
    public static String leerCadena(String msg){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(msg); 
            
            a = s.next(); //ENTRADA DE DATOS 

            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: No ha introducido una cadena." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }
    
    /**
     * Pide por teclado y devuelve una letra
     * @param mensaje mensaje saliente.
     * @return letra introducida.
     * @throws Ocurre cuando no introducimos una letra.
     */
    public static String leerCadena(String msg, int longitud){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        String a = "";
               
        /** Variables auxiliares */
       
        boolean flag;
        
        /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
        
        //---------------------------------------------- 
        /**          POCESAMIENTO DE DATOS            */
        //----------------------------------------------

        do{
             
            System.out.print(msg); 

            a = s.nextLine(); //ENTRADA DE DATOS 
            
            System.out.println(a.length());

            flag = true;     //salir del while  

           if(a.length() > longitud){

                System.out.println(Color.ROJO + "Error: la cadena es demasiado grande." + Color.RESET);

                flag = false; //seguir en el while.

            }
          
        }while(!flag);
        
        return a; //variable de salida.
        
    }
    
   /**
     * Pide por teclado y devuelve un caracter
     * @return a valor introducido.
     * 
     * Excepcion
     *           Ocurre cuando no introducimos una letra.
     */
    public static char leerCaracter(){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        char a = 'a';
               
        /** Variables auxiliares */
       
        String teclado;
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
                        
            System.out.print("Introduzca un carácter"); 
            
            teclado = s.next(); //ENTRADA DE DATOS 
            
            a = teclado.charAt(0);

            flag = true;     //salir del while  
            
            if (teclado.length() != 1){
                
                System.out.println(Color.ROJO + "No ha introduccido un carácter." + Color.RESET);
                
                flag = false;
                
            }
     
        }while(flag == false);
        
        return a; //variable de salida.
        
    }//cierre método LeerCaracter() 
    
    /**
     * Pide por teclado y devuelve una letra
     * @param mensaje mensaje saliente.
     * @return letra introducida.
     * Excepcion
     *           Ocurre cuando no introducimos una letra.
     */
    public static char leerCaracter(String msg){  
     //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        char a = 'a';
               
        /** Variables auxiliares */
       
        String teclado;
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
                        
            System.out.print(msg); 
            
            teclado = s.next(); //ENTRADA DE DATOS 
            
            a = teclado.charAt(0);

            flag = true;     //salir del while  
            
            if (teclado.length() != 1){
                
                System.out.println(Color.ROJO + "No ha introduccido un carácter." + Color.RESET);
                
                flag = false;
                
            }
     
        }while(flag == false);
        
        return a; //variable de salida.
    }//cierre método LeerCaracter(String msg)
    
    /**
     * Pide por teclaro un booleano y lo devuelve.
     * @return  a booleano introduccido.
     * 
     *  Excepcion
     *           Ocurre cuando no se introduce un bolleano.
     */
    public static boolean leerBooleano(){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        boolean a = false;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print("¿true o False? "); 
            
            a = s.nextBoolean(); //ENTRADA DE DATOS 

            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: No ha introducido un booleano." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }//cierre método LeerBooleano()

    /**
     * Pide por teclaro un booleano y lo devuelve.
     * @param msg mensaje a mostrar al pedir por pantalla.
     * @return  a booleano introduccido.
     * 
     *  Excepcion
     *           Ocurre cuando no se introduce un bolleano.
     */
    public static boolean leerBooleano(String msg){  
        //----------------------------------------------
        /**          DECLARACIÓN DE VARIABLES         */
        //---------------------------------------------- 
        
        /** Variables de entrada - salida */
        boolean a = false;
               
        /** Variables auxiliares */
       
        boolean flag;
       
        
       //---------------------------------------------- 
       /**          POCESAMIENTO DE DATOS            */
       //----------------------------------------------
        
        do{
          /** Clase Scanner para petición de datos de entrada */
        
            Scanner s = new Scanner(System.in);
            
          //CAPTURAR EXCEPCIONES:
          try{
             
            System.out.print(msg); 
            
            a = s.nextBoolean(); //ENTRADA DE DATOS 

            flag = true;     //salir del while  
           
          } catch(InputMismatchException e){
              
            System.out.println(Color.ROJO + "Error: No ha introducido un booleano." + Color.RESET);
            
            flag = false;
            
          }//cierre del catch
          
        }while(flag == false);
        
        return a; //variable de salida.
        
    }//cierre método LeerBooleano(String msg)
    
    /**
    * Método que muestra un String por pantalla con salto de línea
    *
    * @param msg mensaje que muestra en pantalla
    */
   public static void escribirLN(String msg) {
      //---------------------------------------------- 
      /**          POCESAMIENTO DE DATOS            */
      //----------------------------------------------
        
      //Imprimir por pantalla:
      System.out.println(msg);
      
   }//cierre del método escribirLN(String msg)
   
    /**
    * Método que muestra un String por pantalla sin salto de línea
    *
    * @param msg mensaje que muestra en pantalla
    */
   public static void escribir(String msg) {
      //---------------------------------------------- 
      /**          POCESAMIENTO DE DATOS            */
      //----------------------------------------------
        
      //Imprimir por pantalla:       
      System.out.print(msg);
   }//cierre del método escribir(String msg)
    
}//cierre de la clase IO_ES
