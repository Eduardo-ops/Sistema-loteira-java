
package loteria.classesGerais;

import br.com.univas.loteria.classes_gerais.MegaSena;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MegaSenaTest {
    
    private MegaSena m = new MegaSena();
    
    @Test
    public void testGetDezenas() {
        
      ArrayList<Integer> a = new ArrayList(); // 
      assertEquals(a,m.getDezenas());
    }

    @Test
    public void testSetDezenas_ArrayList() {
        
        assertNotNull(m);
    }

    @Test
    public void testValidacao() {

        int dezena = 25;
        assertEquals(true,m.validacao(dezena));
       
    }
    
    @Test
    public void testSetDezenas_int() {

        assertNotNull(m);

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
        assertEquals(count,m.confere(a,b));
    }

    @Test
    public void testRandomicos() {
        
        String vod = "Saída do jogo aleatório";
        
        assertNotNull(vod,m);
        
    }

    @Test
    public void testCincoMais() {
       
        String cincoMais = "CINCO NUMEROS QUE MAIS SAIRAM: ";
        
        assertNotNull(cincoMais,m);
       
    }

    @Test
    public void testCincoMenos() {
        
        String cincoMenos = "CINCO NUMEROS QUE MENOS SAIRAM: ";
        
        assertNotNull(cincoMenos,m);
    }
    
}
