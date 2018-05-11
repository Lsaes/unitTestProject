import org.junit.Assert;

public class MainTest {

    @org.junit.Test
    public void testGetNumber() {
        Operation testOperation = new Operation();
        Assert.assertEquals(4, testOperation.testGetNumber());
    }
}