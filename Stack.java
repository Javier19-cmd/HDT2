/**
 * 
 * Interface Stack: Esta interface es la encargada de proveerle al Stack los métodos que estarán usando en la clase de StackVector.
 * @version 1.0 5/02/21
 * 
 */

public interface Stack <E>{//Clase que posee los métodos para las operaciones.
    
    //Métodos a utilizar para la calculadora.
    
    public void Push(E a);  //Va a agregar los ítems al Vector.
    public E Pop();             //Remueve el último elemento del Vector y coloca el nuevo elemeto en el mismo Vector.
    public boolean Empty();     //Testear si el vector está vacío.
    public E Peek();            //Busca el resultado en la última entrada del Vector.
    public int size();          //Ve el tamaño del Vector.
}