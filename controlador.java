/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

import java.util.*; //Importando todas las clases de java.

import jdk.jfr.Timestamp;

import java.io.CharArrayReader;
import java.io.File; //Importando las clases necesarias para abrir el archivo .txt.
import java.io.FileNotFoundException; //Importando la clase que tira el error de que no encuentra el archivo.


public class controlador { //Clase main: esta clase es la encargda de tener la instancia de la clase que manejará los métodos para las operaciones.

    
    public static void main(String[] args){
       
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