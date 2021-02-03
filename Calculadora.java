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
        StackVector st = new StackVector();

        for(int i = 1; i < expresion.length(); i++){
            //st.Push(i);

            if(expresion.contains("+")  && Character.isDigit(expresion.charAt(i))){
                //st.Push(expresion.charAt(i + 2)); //Push del primer operando.
                //st.Push(expresion.charAt(i - 1)); //Push del segundo operando.
                int a = Integer.valueOf(expresion.charAt(i + 2)) + Integer.valueOf(expresion.charAt(i - 1)); 
                //st.Pop(); //Eliminando los últimos dos elementos del Vector.
                
               // st.Push(a); //Push del resultado.

                System.out.println(a);
            }
            if(expresion.contains("-")  && Character.isDigit(expresion.charAt(i))){
                
                //st.Push(expresion.charAt(i + 2)); //Push del primer operando.
                //st.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                int a = Integer.valueOf(expresion.charAt(i + 2)) - Integer.valueOf(expresion.charAt(i - 1)); 
                System.out.println(a);

                //st.Pop(); //Eliminando los últimos dos elementos del Vector.
                
               // st.Push(a); //Push del resultado.
            }
            if(expresion.contains("*")  && Character.isDigit(expresion.charAt(i))){
                //st.Push(expresion.charAt(i + 2)); //Push del primer operando.
                //st.Push(expresion.charAt(i - 1)); //Push del segundo operando.
                
                int a = Integer.valueOf(expresion.charAt(i + 2)) * Integer.valueOf(expresion.charAt(i - 1)); 
                System.out.println(a);

                //st.Pop(); //Eliminando los últimos dos elementos del Vector.
                
               // st.Push(a); //Push del resultado.

            }
            if(expresion.contains("/")  && Character.isDigit(expresion.charAt(i))){

                //st.Push(expresion.charAt(i + 2)); //Push del primer operando.
                //st.Push(expresion.charAt(i - 1)); //Push del segundo operando.
                
                int a = Integer.valueOf(expresion.charAt(i + 2)) / Integer.valueOf(expresion.charAt(i - 1)); 
                System.out.println(a);

                //st.Pop(); //Eliminando los últimos dos elementos del Vector.
                
               // st.Push(a); //Push del resultado.
            }
            
        }


        return expresion; //Return del resultado que se obtendrá con las operaciones dadas.
    }
    
    /*
    private boolean evaluate(String operator){
        //Método para evaluar.
        

        return true;
    }*/
}