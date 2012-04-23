/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author hkom
 */
public class LivroTest {
    
    public LivroTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setAnoDeEdicao method, of class Livro.
     */
    @Test
    public void testSetAnoDeEdicao() {
        System.out.println("setAnoDeEdicao");
        int anoDeEdicao = 0;
        Livro instance = new Livro();
        instance.setAnoDeEdicao(anoDeEdicao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditora method, of class Livro.
     */
    @Test
    public void testSetEditora() {
        System.out.println("setEditora");
        String editora = "";
        Livro instance = new Livro();
        instance.setEditora(editora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroDePaginas method, of class Livro.
     */
    @Test
    public void testSetNumeroDePaginas() {
        System.out.println("setNumeroDePaginas");
        int numeroDePaginas = 0;
        Livro instance = new Livro();
        instance.setNumeroDePaginas(numeroDePaginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnoDeEdicao method, of class Livro.
     */
    @Test
    public void testGetAnoDeEdicao() {
        System.out.println("getAnoDeEdicao");
        Livro instance = new Livro();
        int expResult = 0;
        int result = instance.getAnoDeEdicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditora method, of class Livro.
     */
    @Test
    public void testGetEditora() {
        System.out.println("getEditora");
        Livro instance = new Livro();
        String expResult = "";
        String result = instance.getEditora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDePaginas method, of class Livro.
     */
    @Test
    public void testGetNumeroDePaginas() {
        System.out.println("getNumeroDePaginas");
        Livro instance = new Livro();
        int expResult = 0;
        int result = instance.getNumeroDePaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Livro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Livro instance = new Livro();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
