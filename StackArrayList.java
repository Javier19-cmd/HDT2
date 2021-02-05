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
           data.remove(0); //Quitando la última entrada.
           data.remove(1); //Quitando la penúltima entrada.
           return null;
       }

       @Override
       public boolean Empty() {//Revisando que el ArrayList esté vacía. 

            //Revisando que el ArrayList está vacío.
            if(data.isEmpty()){
                System.out.println("El ArrayList está vacío.");
           }
           return false;
       }
       
       @Override
       public E Peek() {//Busca la última entrada del ArrayList y los imprime.
           
        System.out.println(data.get(0)); //Imprimiendo la última entrada del ArrayList.

           return null;
       }

       @Override
       public int size() {//Ve el tamaño del ArrayList.
           data.size(); //Viendo el tamaño del ArrayList.
           return 0;
       }
}