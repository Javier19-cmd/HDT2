/**
 * 
 * Esta es la interfaz que se encarga de proveerle a la clase calculadora el método de cálculo.
 * @version 1.0
 * @author Javier Sebastián Valle Balsells
 * 
 * 
 */

public interface CalculadoraGeneral{ //Clase Interface que posee el método de Calculo. 
    /**
     * 
     * Se creó el método Calculo(String expresion), el cual será implementado en la clase Calculadora.
     * La variable expresion es la encargada de traer los números y las expresiones aritméticas del archivo .txt.
     * 
     */

    public String Calculo(String expresion); //Método para hacer los cálculos de la calculadora. Tiene la sobrecarga de la variable texto.

}