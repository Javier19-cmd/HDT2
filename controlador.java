/**
 * 
 * Clase main: Esta es la encargada de que todo el programa funcione correctamente.
 * Se hizo el import de todas las clases. 
 * Además de ello, se importaron las clases que se encargan de buscar el archivo .txt y de tirar error en caso de que el main no encuentre el archivo.
 * 
 * @author Javier Sebastián Valle Balsells Carné 20159
 * @version 1.0
 * 
 */

import java.util.*; //Importando todas las clases de java.

import java.io.CharArrayReader;
import java.io.File; //Importando las clases necesarias para abrir el archivo .txt.
import java.io.FileNotFoundException; //Importando la clase que tira el error de que no encuentra el archivo.


public class controlador { //Clase main: esta clase es la encargda de tener la instancia de la clase que manejará los métodos para las operaciones.

    /**
     * 
     * Se creó el método main para poder darle la información necesaria del programa al usuario. 
     * 
     */

    public static void main(String[] args){
       
        /**
         * 
         * En este método main se hizo la instancia de la clase calculadora, la cual es la encargada de operar todos los números que hay en el archivo .txt.
         * Las línes 41 y 42 son las encargadas de abrir y escanear el archivo.
         * El try-catch es el encargado de verificar el archivo y si no está o el nombre es diferente, se le da un mensaje de error al usuario.
         * También se imprimen las operaciones y los números.
         * 
         */

        Calculadora ca = new Calculadora(); //Instancia de la clase calculadora.
        
                //Abriendo el archivo .txt para su lectura.
                try {
                    
                    File arch = new File("datos.txt"); //Creando la variable arch para abrir el archivo .txt.
                    Scanner s = new Scanner(arch); //Abriendo el archivo.
                    //FileReader fr = new FileReader(arch); //Lector del archivo.
                    //BufferedReader br = new BufferedReader(fr); //Lector de las entradas de caracteres.
     
                     String expresion; //Variable para imprimir el contenido del archivo.
 
                     expresion = s.nextLine(); //Leyendo las líneas del archivo.
 
                     System.out.println(expresion); //Imprimiendo las operaciones.
 
                     s.close();//Cerrando el archivo.
                    
                     ca.Calculo(expresion); //Llamando al método de Calculo para hacer las operaciones que aparezcan en el archivo.

                     } catch (Exception errorBusq){
                         System.out.println("El archivo no existe"); //Diciendo que no se encontró el archivo.
                      
                     }
                     

    }


}