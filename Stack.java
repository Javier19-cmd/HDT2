
/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

public interface Stack <T>{//Clase que posee los métodos para las operaciones.
    
    //Métodos a utilizar para la calculadora.
    
    public void Push(int num);  //Va a agregar los ítems al Vector.
    public T Pop();             //Remueve el último elemento del Vector y coloca el nuevo elemeto en el mismo Vector.
    public boolean Empty();     //Testear si el vector está vacío.
    public T Peek();            //Busca el resultado en la última entrada del Vector.
    public int size();          //Ve el tamaño del Vector.
}