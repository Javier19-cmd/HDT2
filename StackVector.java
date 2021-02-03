/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

import java.util.*; //Importando todas las clases de java.

public class StackVector<E> implements Stack<E>{ //Esta clase implementa de la clase Stack.    

     Vector data = new Vector<E>(); 

    @Override
    public void Push(E expresion) {//Agregando elementos al Vector.
        
        data.addElement(expresion); //Agregando los números al Vector.
        //return null; 
    }

    @Override
    public E Pop() {//Remueve el último elemento del Vector y coloca el nuevo elemeto en el mismo Vector.
        
        data.removeElementAt(0); //Eliminando el penúltimo elemento de la lista.
        data.removeElementAt(1); //Eliminando el último elemento de la lista.

        return null;
    }

    @Override
    public boolean Empty() {//Testear si el vector está vacío.
        
        //Revisando que el Vector esté o no vacío.
        if(data.isEmpty()){
            System.out.println(data.isEmpty());
        }else{
            System.out.println("El vector se encuentra vacío.");
        }
        return false;
    }

    @Override
    public E Peek() {//Busca el resultado en la última entrada del Vector.

        //Imprimiendo la última entrada del Vector.
        System.out.println("El último elemento del vector es: " + data.elementAt(0)); //Imprimiendo el último elemento del Vector.
        return null;
    }

   @Override
   public int size() {//Ve el tamaño del Vector.
    
        System.out.println( "El tamaño del vector es: " + data.size()); 

    return 0;

       
   }
}