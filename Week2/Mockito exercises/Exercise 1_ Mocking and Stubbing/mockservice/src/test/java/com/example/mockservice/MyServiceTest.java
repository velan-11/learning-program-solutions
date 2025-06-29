package com.example.mockservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create a mock of ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the getData method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use the mock in MyService
        MyService service = new MyService(mockApi);

        // Step 4: Call fetchData and assert the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}