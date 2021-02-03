
/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

import java.util.*; //Importando todas las clases de java.

public class StackVector<T> implements Stack<T>{ //Esta clase implementa de la clase Stack.
    
    Calculadora cal = new Calculadora(); //Instancia de la calculadora.

    @Override
    public void Push(int num) {//Va a agregar los ítems al Vector.
    // TODO Auto-generated method stub
    
    }

    @Override
    public T Pop() {//Remueve el último elemento del Vector y coloca el nuevo elemeto en el mismo Vector.
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean Empty() {//Testear si el vector está vacío.
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T Peek() {//Busca el resultado en la última entrada del Vector.
        // TODO Auto-generated method stub
        return null;
    }

   @Override
   public int size() {//Ve el tamaño del Vector.
    // TODO Auto-generated method stub
    return 0;

       
   }
}