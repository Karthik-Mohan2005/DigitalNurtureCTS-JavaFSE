import org.example.Main;
import org.junit.*;
import static org.junit.Assert.*;
public class AAATestAssertions {
    private Main a;
    @Before
    public void setUp(){
        System.out.println("Before setUp is on");
        a = new Main();
    }
    @Test
    public void test(){
        assertEquals(10,a.add(6,4));
    }

    @After
    public void tearDown(){
        System.out.println("Tear Down Executed");
        a = null;
    }
}
