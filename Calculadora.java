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
        StackVector st = new StackVector(); //Instanciando la clase StackVector, encargada de almacenar las operaciones.
        //StackArrayList sta = new StackArrayList(); //Instanciando la clase StackArrayList, que guardará también los operandos y los resultados de las operaciones.

        StackVector<Integer> lista = new StackVector<Integer>(); //Instanciando la clase StackVector como integer.

        for(int i = 1; i < expresion.length(); i++){
            //st.Push(i);

            if(expresion.contains("+")  && Character.isDigit(expresion.charAt(i))){
                
                //StackVector
                st.Push(expresion.charAt(i)); //Push del primer operando.
                st.Push(expresion.charAt(i - 1)); //Push del segundo operando.
                
                //StackArrayList
                //sta.Push(expresion.charAt(i)); //Push del primer operando.
                //sta.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                int a = (Integer.valueOf(expresion.charAt(i))) + (Integer.valueOf(expresion.charAt(i - 1))); //Operando los números del archivo de texto.
                
                expresion = String.valueOf(a); //Pasando de int a String los valores de la operación realizada.

                //StackVector
                st.Push(expresion); //Push del resultado.
                
                //StackArrayList
                //sta.Push(expresion); //Push del resultado.

                System.out.println(a);
                
            }
            if(expresion.contains("-")  && Character.isDigit(expresion.charAt(i))){
                //StackVector
                st.Push(expresion.charAt(i)); //Push del primer operando.
                st.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                //StackArrayList
                //sta.Push(expresion.charAt(i + 2)); //Push del primer operando.
                //sta.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                int a = (Integer.valueOf(expresion.charAt(i))) - (Integer.valueOf(expresion.charAt(i - 1)));  //Operando los números del archivo de texto.
                System.out.println(a);

                expresion = String.valueOf(a); //Pasando de int a String los valores de la operación realizada.

                //Vector
                st.Push(expresion); //Push del resultado.
                st.Push(st.Pop());  //Eliminando el último elemento del Vector.

                //StackArrayList
                //sta.Push(expresion); //Push del resultado.
                //sta.Push(sta.Pop()); //Eliminando el último elemento del ArrayList.
            }
            if(expresion.contains("*")  && Character.isDigit(expresion.charAt(i))){
                st.Push(expresion.charAt(i)); //Push del primer operando.
                st.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                //StackArrayList
                //sta.Push(expresion.charAt(i)); //Push del primer operando.
                //sta.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                int a = (Integer.valueOf(expresion.charAt(i))) * (Integer.valueOf(expresion.charAt(i - 1))); //Operando los números del archivo de texto.
                System.out.println(a);

                expresion = String.valueOf(a); //Pasando de int a String los valores de la operación realizada.

                //Vector
                st.Push(expresion); //Push del resultado.
                st.Push(st.Pop());  //Eliminando el último elemento del Vector.

                //StackArrayList
               // sta.Push(expresion); //Push del resultado.
                //sta.Push(sta.Pop()); //Eliminando el último elemento del ArrayList.

            }
            if(expresion.contains("/")  && Character.isDigit(expresion.charAt(i))){
                
                //StackVector
                st.Push(expresion.charAt(i)); //Push del primer operando.
                st.Push(expresion.charAt(i - 1)); //Push del segundo operando.

                 //StackArrayList
                //sta.Push(expresion.charAt(i)); //Push del primer operando.
                //sta.Push(expresion.charAt(i - 1)); //Push del segundo operando.
                
                if(expresion.charAt(i) == 0 || expresion.charAt(i - 2) == 0){
                    System.out.println("¡Error! División por cero.");
                    break; //Break para final de repente la simulación, ya que hay una división por cero.
                }

                int a = (Integer.valueOf(expresion.charAt(i))) / (Integer.valueOf(expresion.charAt(i - 1))); //Operando los números del archivo de texto.
                System.out.println(a);

                expresion = String.valueOf(a); //Pasando de int a String los valores de la operación realizada.

                //StackVector
                st.Push(expresion); //Push del resultado.
                st.Push(st.Pop());  //Eliminando el último elemento del Vector.

                //StackArrayList
               // sta.Push(expresion); //Push del resultado.
               // sta.Push(sta.Pop()); //Eliminando el último elemento del ArrayList.
            }
            
        }

        //st.Pop(); //Eliminando los últimos dos elementos del Vector.

        return expresion; //Return del resultado que se obtendrá con las operaciones dadas.
        
    }
    
    
    private boolean evaluate(String operator){
        //Método para evaluar.

        //Evaluando si la expresión es igual.
        if(Calculo(operator).equals("1")){
            System.out.println("El resultado es correcto.");
        }else{
            System.out.println("El resultado no es correcto.");
        }
        return true;
    }
}