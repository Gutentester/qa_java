import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline;
    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные","Птицы","Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest(){
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensNativeTest(){
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParametersTest(){
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals(expectedResult, actualResult);
    }
}