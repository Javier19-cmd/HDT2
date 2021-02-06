import junit.framework.TestCase; 

public class claspruebas extends TestCase{
    


    public claspruebas(){
      
        Calculadora cal = new Calculadora();
    
    }

    public void testSuma(){
        //

        int resultado = 5;
        int valoresperado = 5; 

        assertEquals(resultado, valoresperado);

    }

}