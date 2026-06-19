import org.example.ExternalAPI;
import org.example.Service;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
public class ServiceTest {
    @Test
    public void testExternalApi() {
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        Service service = new Service(mockApi);
        String result = service.fetchData();
        assertEquals("Mock Data",result);
    }
}