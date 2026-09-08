import org.example.Roupa;
import org.example.RoupaFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RoupaFactoryTest {

    @Test
    void deveRetornarExcecaoParaRoupaInexistente() {
        try{
            Roupa roupa = RoupaFactory.obterRoupa("Moletom");
            fail();
        }catch (IllegalArgumentException e ){
            assertEquals("Roupa inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaRoupaInvalida() {
        try {
            Roupa roupa = RoupaFactory.obterRoupa("Meia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Roupa invalida", e.getMessage());
        }
    }
}
