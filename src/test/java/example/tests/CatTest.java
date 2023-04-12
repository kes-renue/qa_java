package example.tests;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class CatTest {

    @Test
    public void checkCatMakesMeowSound(){
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

    /*Тут я решила избавться от мока, потому что так и не разобралась, что мокать.
      Мокать Feline feline не имеет смысла. Мок Predator feline в итоге
      выдаёт ошибку - 'class com.example.Predator$MockitoMock$1413711497
      cannot be cast to class com.example.Feline'*/
    @Test
    public void checkCatEatsMeat() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

}
