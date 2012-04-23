/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hkom
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ biblioteca.LivroTest.class, biblioteca.Dissertacao_TeseTest.class, biblioteca.SearchTest.class, biblioteca.ItemDeBibliotecaTest.class, biblioteca.AnaisDeEventosTest.class})
public class BibliotecaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
