package mockverification;

import org.junit.jupiter.api.Test; 
import static org.mockito.Mockito.*;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 3: Call method
        service.fetchData();

        // Step 4: Verify interaction
        verify(mockApi).getData(); // Verifies getData() was called once
    }
}