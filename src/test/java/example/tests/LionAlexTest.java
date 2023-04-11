package example.tests;
import com.example.LionAlex;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Test
    public void checkGetFriendsReturnsListOfNames() throws Exception {
        LionAlex lionAlex = new LionAlex();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAlexLivesInNewYorkZoo() throws Exception {
        LionAlex lionAlex = new LionAlex();
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAlexHasNoKittens() throws Exception {
        LionAlex lionAlex = new LionAlex();
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }
}
