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
public class AnaisDeEventosTest  {
    
    public AnaisDeEventosTest() {
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
     * Test of getAnoDePublicacao method, of class AnaisDeEventos.
     */
    @Test
    public void testGetAnoDePublicacao() {
        System.out.println("getAnoDePublicacao");
        AnaisDeEventos instance = new AnaisDeEventos();
        int expResult = 0;
        int result = instance.getAnoDePublicacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnoDePublicacao method, of class AnaisDeEventos.
     */
    @Test
    public void testSetAnoDePublicacao() {
        System.out.println("setAnoDePublicacao");
        int anoDePublicacao = 0;
        AnaisDeEventos instance = new AnaisDeEventos();
        instance.setAnoDePublicacao(anoDePublicacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class AnaisDeEventos.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        AnaisDeEventos instance = new AnaisDeEventos();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class AnaisDeEventos.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        AnaisDeEventos instance = new AnaisDeEventos();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditora method, of class AnaisDeEventos.
     */
    @Test
    public void testGetEditora() {
        System.out.println("getEditora");
        AnaisDeEventos instance = new AnaisDeEventos();
        String expResult = "";
        String result = instance.getEditora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditora method, of class AnaisDeEventos.
     */
    @Test
    public void testSetEditora() {
        System.out.println("setEditora");
        String editora = "";
        AnaisDeEventos instance = new AnaisDeEventos();
        instance.setEditora(editora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeDoEvento method, of class AnaisDeEventos.
     */
    @Test
    public void testGetNomeDoEvento() {
        System.out.println("getNomeDoEvento");
        AnaisDeEventos instance = new AnaisDeEventos();
        String expResult = "";
        String result = instance.getNomeDoEvento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeDoEvento method, of class AnaisDeEventos.
     */
    @Test
    public void testSetNomeDoEvento() {
        System.out.println("setNomeDoEvento");
        String nomeDoEvento = "";
        AnaisDeEventos instance = new AnaisDeEventos();
        instance.setNomeDoEvento(nomeDoEvento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AnaisDeEventos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnaisDeEventos instance = new AnaisDeEventos();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
