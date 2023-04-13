package example.tests;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    private final String sex;
    private final boolean expected;

    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {{"Самец", true}, {"Самка", false}};
    }

    @Test
    public void checkDoesHaveManeReturnsCorrectValue_dependingOnGender() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void checkLionHasOneKitten() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedCount = 1;
        int actualCount = lion.getKittens();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkLionEatsMeat() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = lion.getFood();
        assertEquals(expectedList, actualList);
    }

}
