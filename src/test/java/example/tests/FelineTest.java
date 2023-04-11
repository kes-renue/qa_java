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

    @Test
    //не очень понятно, что требуется проверить в данном случае
    public void checkGetKittensReturns_kittensCount(){
        int actual = feline.getKittens();
        int expected = feline.getKittens(1);
        Assert.assertEquals(expected, actual);
    }
}
