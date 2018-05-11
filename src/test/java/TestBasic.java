import Oper.IMethod;
import org.junit.Assert;

public class TestBasic {
    @org.junit.Test
    public void testGetNumber() {
        IMethod testOperation = new Basic();
        Assert.assertEquals(4, testOperation.testGetNumber());
    }
}
