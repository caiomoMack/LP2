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
public class ItemDeBibliotecaTest {
    
    public ItemDeBibliotecaTest() {
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
     * Test of estaEmprestado method, of class ItemDeBiblioteca.
     */
    @Test
    public void testEstaEmprestado() {
        System.out.println("estaEmprestado");
        Item item = null;
        ItemDeBiblioteca instance = new ItemDeBibliotecaImpl();
        instance.estaEmprestado(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empresta method, of class ItemDeBiblioteca.
     */
    @Test
    public void testEmpresta() {
        System.out.println("empresta");
        Item item = null;
        ItemDeBiblioteca instance = new ItemDeBibliotecaImpl();
        instance.empresta(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolvido method, of class ItemDeBiblioteca.
     */
    @Test
    public void testDevolvido() {
        System.out.println("devolvido");
        Item item = null;
        ItemDeBiblioteca instance = new ItemDeBibliotecaImpl();
        instance.devolvido(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descricaoSumaria method, of class ItemDeBiblioteca.
     */
    @Test
    public void testDescricaoSumaria() {
        System.out.println("descricaoSumaria");
        Item item = null;
        ItemDeBiblioteca instance = new ItemDeBibliotecaImpl();
        instance.descricaoSumaria(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ItemDeBibliotecaImpl implements ItemDeBiblioteca {

        public void estaEmprestado(Item item) {
        }

        public void empresta(Item item) {
        }

        public void devolvido(Item item) {
        }

        public void descricaoSumaria(Item item) {
        }
    }
}
