import org.example.Roupa;
import org.example.RoupaFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RoupaTenisTest {

    @Test
    void deveRetornarDetalhesTenis(){
        Roupa roupa = RoupaFactory.obterRoupa("Tenis");
        assertEquals("Tenis esportivo", roupa.detalhes());
    }

    @Test
    void deveRetornarPrecoTenis(){
        Roupa roupa = RoupaFactory.obterRoupa("Tenis");
        assertEquals(299, roupa.preco());
    }
}
