import org.junit.Assert;

public class TestBasic {
    @org.junit.Test
    public void testGetNumber() {
        Basic testOperation = new Basic();
        Assert.assertEquals(4, testOperation.testGetNumber());
    }
}
