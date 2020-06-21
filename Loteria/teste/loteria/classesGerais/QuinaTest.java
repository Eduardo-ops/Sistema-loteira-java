
package loteria.classesGerais;

import br.com.univas.loteria.classes_gerais.Quina;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuinaTest {
    
    private Quina q = new Quina();
    
    @Test
    public void testGetDezenas() {
        
      ArrayList<Integer> a = new ArrayList(); // 
      assertEquals(a,q.getDezenas());
    }

    @Test
    public void testSetDezenas_ArrayList() {
        
        assertNotNull(q);
    }

    @Test
    public void testValidacao() {

        int dezena = 35;
        assertEquals(true,q.validacao(dezena));
       
    }
    
    @Test
    public void testSetDezenas_int() {

        assertNotNull(q);

    }

    @Test
    public void testConfere() {
        
        ArrayList<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList();
        b.add(1);
        b.add(2);
        
        int count = 2;
        assertEquals(count,q.confere(a,b));
    }

    @Test
    public void testRandomicos() {
        
        String vod = "Saída do jogo aleatório";
        
        assertNotNull(vod,q);
        
    }

    @Test
    public void testCincoMais() {
       
        String cincoMais = "CINCO NUMEROS QUE MAIS SAIRAM: ";
        
        assertNotNull(cincoMais,q);
       
    }

    @Test
    public void testCincoMenos() {
        
        String cincoMenos = "CINCO NUMEROS QUE MENOS SAIRAM: ";
        
        assertNotNull(cincoMenos,q);
    }
    
}
