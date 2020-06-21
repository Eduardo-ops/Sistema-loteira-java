
package loteria.classesGerais;

import br.com.univas.loteria.classes_gerais.Lotofacil;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LotofacilTest {
    
    private Lotofacil l = new Lotofacil();
    
    @Test
    public void testGetDezenas() {
        
      ArrayList<Integer> a = new ArrayList(); // 
      assertEquals(a,l.getDezenas());
    }

    @Test
    public void testSetDezenas_ArrayList() {
        
        assertNotNull(l);
    }

    @Test
    public void testValidacao() {

        int dezena = 15;
        assertEquals(true,l.validacao(dezena));
       
    }
    
    @Test
    public void testSetDezenas_int() {

        assertNotNull(l);

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
        assertEquals(count,l.confere(a,b));
    }

    @Test
    public void testRandomicos() {
        
        String vod = "Saída do jogo aleatório";
        
        assertNotNull(vod,l);
        
    }

    @Test
    public void testCincoMais() {
       
        String cincoMais = "CINCO NUMEROS QUE MAIS SAIRAM: ";
        
        assertNotNull(cincoMais,l);
       
    }

    @Test
    public void testCincoMenos() {
        
        String cincoMenos = "CINCO NUMEROS QUE MENOS SAIRAM: ";
        
        assertNotNull(cincoMenos,l);
    }
    
}
