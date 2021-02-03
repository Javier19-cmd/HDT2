/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

import java.util.*; //Importando todas las clases de java.

public class StackVector<E> implements Stack<E>{ //Esta clase implementa de la clase Stack.
    
    Calculadora cal = new Calculadora(); //Instancia de la calculadora.
    //Stack <String> operaciones = new StackArrayList<String>(); //Vector que almacena los números.    

    int ope[] = new int[10]; //Creando el vector que almacenará los dígitos.
    int top = 0; //Índice del Vector. 

    @Override
    public E Push(int num) {
        
        ope[0] = num; //Ingresando los dígitos al Vector.
        top++; //Aumento del índice del Vector.
        return null; 
    }

    @Override
    public E Pop() {//Remueve el último elemento del Vector y coloca el nuevo elemeto en el mismo Vector.
        int datos; //Variable a usar para eliminar el último elemento del Vector. 

        datos = ope[top]; //Eliminando el último elemento del Vector.

        return null;
    }

    @Override
    public boolean Empty() {//Testear si el vector está vacío.
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E Peek() {//Busca el resultado en la última entrada del Vector.

        //Imprimiendo la última entrada del Vector.
        
        for(int n : ope){
            System.out.println(n + "");
        }

        return null;
    }

   @Override
   public int size() {//Ve el tamaño del Vector.
    // TODO Auto-generated method stub
    return 0;

       
   }
}