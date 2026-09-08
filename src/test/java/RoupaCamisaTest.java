import org.example.Roupa;
import org.example.RoupaFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RoupaCamisaTest {

    @Test
    void deveRetornarDetalhesCamisa(){
        Roupa roupa = RoupaFactory.obterRoupa("Camisa");
        assertEquals("Camisa Basica", roupa.detalhes());
    }

    @Test
    void deveRetornarPrecoCamisa(){
        Roupa roupa = RoupaFactory.obterRoupa("Camisa");
        assertEquals(50, roupa.preco());
    }
}
