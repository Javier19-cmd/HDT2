    /**
     * Clase encargada de almacenar las operaciones, operandos y resultados que se van obteniendo del archivo .txt encontrado y abierto.
     * 
     * Se importó la clase Vector, porque esa era la única que se iba a usar.
     * 
     * Esta clase es implementa código de la clase calculadora.
     * @version 1.0, 05/02/21
     * @author Javier Sebastián Valle Balsells
     * 
     * Se instanció de manera protegida a la clase Vector.
     * 
     */

import java.util.Vector; //Importando nuevamente Vector por si acaso.

public class StackVector<E> implements Stack<E>{ //Esta clase implementa de la clase Stack.    


     protected Vector<E> data; //Vector a usar.


     public StackVector(){
        
        /**
         * 
         * Se creó de manera protegida al Vector.
         * Se asignó a la variable data al vector, para que así pueda almacenar los datos de las operaciones y operandos obtenidos.
         * 
         */

         data = new Vector<E>(); //Asignando a la variable "data" el vector.
     }

    @Override
    public void Push(E expresion) {//Agregando elementos al Vector.
        /**
         * 
         * En éste método se agregan elementos al Vector. 
         * Cabe destacar que los operandos y operaciones se reciben como sobrecarga en al inicio del método.
         * 
         */

         //pre: recibe los datos que la calculadora recuperó del archivo .txt 
         //post: los almacena en el Vector, con la variable expresion.
        
        data.addElement(expresion); //Agregando los números al Vector.
        //return null; 
    }

    @Override
    public E Pop() {//Remueve el último elemento del Vector y coloca el nuevo elemeto en el mismo Vector.
        /**
         * 
         * Acá, se eliminan las primeras dos entradas del Vector, para que así se haga lugar a los nuevos números y operaciones que se tendrán.
         * 
         */

         //Pre: 
         //Post: Elimina las primeras dos entradas del Vector.

        data.removeElementAt(0); //Eliminando el penúltimo elemento de la lista.
        data.removeElementAt(1); //Eliminando el último elemento de la lista.

        return null;
    }

    @Override
    public boolean Empty() {//Testear si el vector está vacío.

        /**
         * 
         * En este método se verifica que si el Vector está o no vacío.
         * 
         */
        
         //Pre: Revisa que el Vector esté vacío.
         //Post: Hace un print diciendo si el Vector está o no vacío.

        //Revisando que el Vector esté o no vacío.
        if(data.isEmpty()){
            System.out.println(data.isEmpty());
        }else{
            System.out.println("El vector se encuentra vacío.");
        }
        return true;
    }

    @Override
    public E Peek() {//Busca el resultado en la última entrada del Vector.

        /**
         * 
         * Este método revisa el Vector y devuelve el tamaño del mismo.
         * 
         */
        //Pre: 
        //Post: Analiza e imprime el último elemento del Vector.

        //Imprimiendo la última entrada del Vector.
        System.out.println("El último elemento del vector es: " + data.elementAt(0)); //Imprimiendo el último elemento del Vector.
        return null;
    }

   @Override
   public int size() {//Ve el tamaño del Vector.

        /**
         * 
         * Este método es el encargado de revisar el tamaño del Vector.
         * 
         */
         
         //Pre: 
         //Post: Revisa e imprime el tamaño del Vector.
    
        System.out.println( "El tamaño del vector es: " + data.size()); 

    return 0;

       
   }
}