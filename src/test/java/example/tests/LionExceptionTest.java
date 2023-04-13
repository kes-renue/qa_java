package example.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionExceptionTest {

    Feline feline;

    @Test(expected = Exception.class)
    public void checkNotValidSexThrowsException() throws Exception {
        String sex = "Мальчик";
        Lion lion = new Lion(feline, sex);
        lion.doesHaveMane();
    }
}
