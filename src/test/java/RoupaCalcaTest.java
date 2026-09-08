import org.example.Roupa;
import org.example.RoupaFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RoupaCalcaTest {

    @Test
    void deveRetornarDetalhesCalca(){
        Roupa roupa = RoupaFactory.obterRoupa("Calca");
        assertEquals("Calça Jeans", roupa.detalhes());
    }

    @Test
    void deveRetornarPrecoCalca(){
        Roupa roupa = RoupaFactory.obterRoupa("Calca");
        assertEquals(150, roupa.preco());
    }
}
