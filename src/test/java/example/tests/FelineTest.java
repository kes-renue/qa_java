package example.tests;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void checkFelineEatsMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFamilyIsFeline(){
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void checkFelineHaveOneKitten(){
        int actualAmount = feline.getKittens();
        int expectedAmount = 1;
        Assert.assertEquals(expectedAmount, actualAmount);
    }

    /* Вроде бы поняла, что тут важно проверить, что метод возвращает
       ровно то, что мы ему передаём. Ни больше, ни меньше.
       Немного поменяла тело теста в части expected result.
       Надеюсь, поняла правильно.*/
    @Test
    public void checkGetKittensReturnsGivenParameter(){
        int actual = feline.getKittens(6);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

}
