import org.junit.*;
import org.example.Main;
import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void test(){
        assertEquals(11,Main.add(5,6));
    }
}
