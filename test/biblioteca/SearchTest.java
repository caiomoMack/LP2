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
public class SearchTest {
    
    public SearchTest() {
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
     * Test of binSearch method, of class Search.
     */
    @Test
    public void testBinSearch() {
        System.out.println("binSearch");
        int k = 0;
        int[] v = null;
        int start = 0;
        int end = 0;
        Search instance = new Search();
        int expResult = 0;
        int result = instance.binSearch(k, v, start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seqSearch method, of class Search.
     */
    @Test
    public void testSeqSearch() {
        System.out.println("seqSearch");
        int k = 0;
        int[] v = null;
        Search instance = new Search();
        int expResult = 0;
        int result = instance.seqSearch(k, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
