import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionExceptionTest {
    Feline feline;
    @Test (expected = Exception.class) //Подсказали такое решение, вынес в отдельный класс
    public void lionIncorrectSexExceptionTest() throws Exception {
        Lion lion = new Lion("Чупакабра", feline);
    }
}
