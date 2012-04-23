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
public class Dissertacao_TeseTest {
    
    public Dissertacao_TeseTest() {
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
     * Test of getCidade method, of class Dissertacao_Tese.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Dissertacao_Tese instance = new Dissertacao_Tese();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Dissertacao_Tese.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Dissertacao_Tese instance = new Dissertacao_Tese();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrau method, of class Dissertacao_Tese.
     */
    @Test
    public void testGetGrau() {
        System.out.println("getGrau");
        Dissertacao_Tese instance = new Dissertacao_Tese();
        String expResult = "";
        String result = instance.getGrau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrau method, of class Dissertacao_Tese.
     */
    @Test
    public void testSetGrau() {
        System.out.println("setGrau");
        String grau = "";
        Dissertacao_Tese instance = new Dissertacao_Tese();
        instance.setGrau(grau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituicao method, of class Dissertacao_Tese.
     */
    @Test
    public void testGetInstituicao() {
        System.out.println("getInstituicao");
        Dissertacao_Tese instance = new Dissertacao_Tese();
        String expResult = "";
        String result = instance.getInstituicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstituicao method, of class Dissertacao_Tese.
     */
    @Test
    public void testSetInstituicao() {
        System.out.println("setInstituicao");
        String instituicao = "";
        Dissertacao_Tese instance = new Dissertacao_Tese();
        instance.setInstituicao(instituicao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDePaginas method, of class Dissertacao_Tese.
     */
    @Test
    public void testGetNumeroDePaginas() {
        System.out.println("getNumeroDePaginas");
        Dissertacao_Tese instance = new Dissertacao_Tese();
        int expResult = 0;
        int result = instance.getNumeroDePaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroDePaginas method, of class Dissertacao_Tese.
     */
    @Test
    public void testSetNumeroDePaginas() {
        System.out.println("setNumeroDePaginas");
        int numeroDePaginas = 0;
        Dissertacao_Tese instance = new Dissertacao_Tese();
        instance.setNumeroDePaginas(numeroDePaginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Dissertacao_Tese.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dissertacao_Tese instance = new Dissertacao_Tese();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
