package rwoo.research;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateMethod.class)
public class MockPrivateMethodTest {

    private MockPrivateMethod mockPrivateMethod;

    // This is the name of the private method which we want to mock
    private static final String METHOD = "iAmPrivate";

    @Test
    public void testPrivateMethod() throws Exception {
        mockPrivateMethod = new MockPrivateMethod();

        MockPrivateMethod spy = PowerMockito.spy(mockPrivateMethod);
        PowerMockito.doReturn("Test").when(spy, METHOD);
        String value = spy.getDetails();

        Assert.assertEquals(value, "Mock private method example: Test");
        PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke(METHOD);

        value = Whitebox.<String> invokeMethod(mockPrivateMethod, "iAmPrivate");
        System.out.println(value);
    }
}