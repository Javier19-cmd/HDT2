/** 
*  Clase encargada de hacer los cálculos necesarios al momento de que el main abre e identifica el archivo txt.
*  @version 1.0 5/02/21
*  @author Javier Sebastián Valle Balsells Carné 20159. 
*  Se imporaton todas las clases y también las clases que se iban a ser encargadas de tirar el mensaje de error, en caso de que no se encontrara el archivo "datos.txt"
*/
import java.util.*; //Importando todas las clases de java.
import java.io.CharArrayReader;
import java.io.File; //Importando las clases necesarias para abrir el archivo .txt.
import java.io.FileNotFoundException; //Importando la clase que tira el error de que no encuentra el archivo


public class Calculadora {//Clase calculadora: esta clase es la encargada de realizar los cálculos que se le indiquen.
    
  //static public Double resultado; 
   //public static String cont; //Variable para imprimir el contenido del archivo.


    public static String Calculo(String expresion){//Método para hacer los cálculos.
        
        /** 
         * Método encargado de analizar 
         * @param expresion este parámetro es el encargado de traer todas las expresiones que posee el .txt abierto. 
         * 
         * También se mandan las expresiones a la clase StackVector.
         * Este método se encarga de pasar de int a string las expresiones numéricas que se obtienen luego de operar los números del archivo .txt.
         * Asimismo, se identifican los operandos y los operadores.
         * 
         * */
        
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

                System.out.println(expresion);
                
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

                expresion = String.valueOf(expresion); //Pasando de int a String los valores de la operación realizada.

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

        /**
         * @param operator, esta variable es la encargada de poder analizar a detalle las operaciones.
         * 
         * Método encargado de analizar que las operaciones estén correctas.
         * 
         *  */ 

        //Evaluando si la expresión es igual.
        if(Calculo(operator).equals("1")){
            System.out.println("El resultado es correcto.");
        }else{
            System.out.println("El resultado no es correcto.");
        }
        return true;
    }
}