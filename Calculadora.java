/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

import java.util.*; //Importando todas las clases de java.
import java.io.CharArrayReader;
import java.io.File; //Importando las clases necesarias para abrir el archivo .txt.
import java.io.FileNotFoundException; //Importando la clase que tira el error de que no encuentra el archivo

public class Calculadora {//Clase calculadora: esta clase es la encargada de realizar los cálculos que se le indiquen.
    
  //static public Double resultado; 
  
   //public static String cont; //Variable para imprimir el contenido del archivo.


    public static String Calculo(String expresion){//Método para hacer los cálculos.
        //Cuerpo del metodo Calculo.
        
        for(int i = 1; i < expresion.length(); i++){

            if(expresion.contains("+")  && Character.isDigit(expresion.charAt(i))){
                int a = Integer.valueOf(expresion.charAt(i + 2)) + Integer.valueOf(expresion.charAt(i - 2)); 
                System.out.println(a);
            }
            if(expresion.contains("-")  && Character.isDigit(expresion.charAt(i))){
                int a = Integer.valueOf(expresion.charAt(i)) - Integer.valueOf(expresion.charAt(i)); 
                System.out.println(a);
            }
            if(expresion.contains("*")  && Character.isDigit(expresion.charAt(i))){
                int a = Integer.valueOf(expresion.charAt(i)) * Integer.valueOf(expresion.charAt(i)); 
                System.out.println(a);
            }
            if(expresion.contains("/")  && Character.isDigit(expresion.charAt(i))){
                int a = Integer.valueOf(expresion.charAt(i)) / Integer.valueOf(expresion.charAt(i)); 
                System.out.println(a);
            }
            
        }


        return expresion; //Return del resultado que se obtendrá con las operaciones dadas.
    }
}