
package loteria.classesGerais;

import br.com.univas.loteria.classes_gerais.Loterias;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoteriasTest {
    
    // A classe interface não foi  necessário realizar testes, pois, contém apenas as assinaturas dos métodos, sendo que eles já foram implementados e testados nas classes filhas.
    
    private Loterias lo = new Loterias() {
        
        @Override
        public boolean validacao(int valida) {
           return true || false;
        }

        @Override
        public void setDezenas(int dezenas) {
            //
        }

        @Override
        public int confere(ArrayList<Integer> aposta, ArrayList<Integer> jogo) {
            return 0;
        }

        @Override
        public void randomicos() {
            //
        }

        @Override
        public void cincoMais(ArrayList<Integer> vet) {
           //
        }

        @Override
        public void cincoMenos(ArrayList<Integer> vet) {
            
        }

        @Override
        public ArrayList<Integer> getDezenas() {
            ArrayList a = new ArrayList();
            return a;
        }
    };
    
    @Test
    public void testValidacao() {
       
    }

    @Test
    public void testSetDezenas() {
       
    }

    @Test
    public void testConfere() {
       
    }

    @Test
    public void testRandomicos() {
       
    }

    @Test
    public void testCincoMais() {
       
    }

    @Test
    public void testCincoMenos() {
     
    }

    @Test
    public void testGetDezenas() {

    }
}
