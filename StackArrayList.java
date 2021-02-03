import java.util.ArrayList; //Importando la clase ArrayList para que almacenar los datos que se obtendrán. 

public class StackArrayList <E> implements Stack<E>{
    
    ArrayList<E> data = new ArrayList<E>();

    @Override
    public void Push(E a) {
        data.add(a);//
        //return null;
    }

       @Override
       public E Pop() {//Moviendo para atrás un elemento del ArrayList y agregando un nuevo elemento al ArrayList.
           // TODO Auto-generated method stub
           return null;
       }

       @Override
       public boolean Empty() {//Revisando que el ArrayList esté vacía. 
           
           return false;
       }
       
       @Override
       public E Peek() {//Busca la última entrada del ArrayList y los imprime.
           // TODO Auto-generated method stub
           return null;
       }

       @Override
       public int size() {//Ve el tamaño del ArrayList.
           // TODO Auto-generated method stub
           return 0;
       }
}