/*
Nombre: Javier Sebastián Valle Balsells
Carnet: 20159
Sección: 10 
*/

import java.util.*; //Importando todas las clases de java.
import java.io.CharArrayReader;
import java.io.File; //Importando las clases necesarias para abrir el archivo .txt.
import java.io.FileNotFoundException; //Importando la clase que tira el error de que no encuentra el archivo

public class controlador { //Clase main: esta clase es la encargda de tener la instancia de la clase que manejará los métodos para las operaciones.

    
    public static void main(String[] args){
        AbrirArchivo();

    }


    public static void AbrirArchivo(){
           
        //Abriendo el archivo .txt para su lectura.
                try {
                    
                   File arch = new File("datos.txt"); //Creando la variable arch para abrir el archivo .txt.
                   Scanner s = new Scanner(arch);
                   //FileReader fr = new FileReader(arch); //Lector del archivo.
                   //BufferedReader br = new BufferedReader(fr); //Lector de las entradas de caracteres.
    
                    String cont; //Variable para imprimir el contenido del archivo.

                    cont = s.nextLine(); //Leyendo las líneas del archivo.

                    System.out.println("Ent                           Op                               Pila");

                    System.out.println(cont); //Imprimiendo las operaciones.

                    for(int i = 1; i < cont.length(); i++){
                        if(cont.contains("+")  && Character.isDigit(cont.charAt(i))){
                            int a = Integer.valueOf(cont.charAt(i)) + Integer.valueOf(cont.charAt(i)); 
                            
                            System.out.println(a);

                            i--;
                        }  
                    }

                    s.close();//Cerrando el archivo.
            
                    } catch (Exception errorBusq){
                        System.out.println("Archivo no encontrado"); //Error al encontrar el archivo.
                     
                    }
    }

}