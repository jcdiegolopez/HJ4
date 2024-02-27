package uvg.edu.gt;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyPFCalcTest {

    private MyPFCalc pfCalc;

    @Before
    public void setUp() {
        // Puedes inicializar cualquier configuración necesaria antes de cada prueba aquí
        UVGStack<Integer> stack = new MyArrayStack<>();
        pfCalc = new MyPFCalc(stack);
    }

    @Test
    public void testEvaluate() {
        // Prueba básica para evaluar una expresión postfix
        int result = pfCalc.evaluate("2 3 * 5 + ");
        assertEquals(11, result);
    }
 
    

    @Test
    public void testIsOperand() {
        // Prueba si un elemento es un operando
        assertTrue(pfCalc.isOperand("123"));
        assertFalse(pfCalc.isOperand("+"));
    }

    @Test
    public void testIsOperator() {
        // Prueba si un elemento es un operador
        assertTrue(pfCalc.isOperator("+"));
        assertFalse(pfCalc.isOperator("42"));
    }

    @Test
    public void testApplyOperation() {
        // Prueba la aplicación de una operación
        int result = pfCalc.applyOperation(5, 3, "+");
        assertEquals(8, result);
    }

  

}
