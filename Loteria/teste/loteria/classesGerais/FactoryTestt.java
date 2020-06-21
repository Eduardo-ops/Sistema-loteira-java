/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria.classesGerais;

import br.com.univas.loteria.classes_gerais.Factory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;



public class FactoryTest {
    
    private Factory n = new Factory();

    @Test
    public void testCriarJogo() {
    
       assertEquals(true,n.equals(n));
       assertNotNull(n);
       
    }
 
}
