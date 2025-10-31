package EstructurasDeDatos.EDL;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListaSETest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaSETest
{
    /**
     * Default constructor for test class ListaSETest
     */
    public ListaSETest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testEliminar() {
        ListaSE<Integer> l = new ListaSE();
        l.insertar(2);
        l.insertar(3);
        l.insertar(4);
        l.eliminar();
        assertEquals(null, l.acceder(2));
    }
    
    @Test
    public void testReemplazar() {
        ListaSE<Integer> l = new ListaSE();
        l.insertar(2);
        l.insertar(3);
        l.insertar(4);
        l.eliminar();
        assertEquals(true, l.reemplazar(10, 1));
    }
    
    @Test
    public void testEliminarPos() {
        ListaSE<Integer> l = new ListaSE();
        l.insertar(2);
        l.insertar(3);
        l.insertar(4);
        l.insertar(10);
        l.insertar(5);
        l.eliminar(2);
        assertEquals(10, l.acceder(2));
    }
    
    @Test
    public void testBuscar() {
        ListaSE<Integer> l = new ListaSE();
        l.insertar(2);
        l.insertar(3);
        l.insertar(4);
        l.insertar(10);
        l.insertar(5);
        l.eliminar(2);
        assertEquals(5, l.acceder(3));
    }
    
    @Test
    public void testInsertarEnPos() {
        ListaSE<Integer> l = new ListaSE();
        l.insertar(2);
        l.insertar(3);
        l.insertar(4); // aqui se agrega
        l.insertar(10);
        l.insertar(5);
        l.insertar(20, 2);
        assertEquals(4, l.acceder(3));
    }
}
