package example.tests;
import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void checkGetFriendsReturnsListOfNames() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAlexLivesInNewYorkZoo() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    /*Если сюда вставлять мок, то mockito ругается и говорит, что
    нужно убрать unnecessary mock.
     */
    @Test
    public void checkAlexHasNoKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }
}
